(ns practice-log.system
  (:require [ring.adapter.jetty :as jetty] [integrant.core :as ig]))

(defn handler [request]
  {:status 200 :header {"Content-Type" "text/html"} :body "Hello, Josh"})

(defmethod ig/init-key :adapter/jetty [_ {:keys [port join?]}]
  (jetty/run-jetty handler {:port port :join? join?}))

(defmethod ig/halt-key! :adapter/jetty [_ server]
  (.stop server))

