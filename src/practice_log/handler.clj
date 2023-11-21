(ns practice-log.handler (:require [ring.util.response :refer [response]]))

(defn handler [request]
  {:status 200 :header {"Content-Type" "text/html"} :body "Hello, Josh"})