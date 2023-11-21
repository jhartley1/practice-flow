(ns practice-log.system
  (:require [ring.adapter.jetty :as jetty] 
            [integrant.core :as ig] 
            [practice-log.handler :refer handler]))

(def config {:adapter/jetty {:port 3000 :join? false}})

(defmethod ig/init-key :adapter/jetty [_ {:keys [port join?]}]
  (jetty/run-jetty handler {:port port :join? join?}))

(defmethod ig/halt-key! :adapter/jetty [_ server]
  (.stop server))

