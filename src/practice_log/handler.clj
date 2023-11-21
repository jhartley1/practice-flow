(ns practice-log.handler
  (:require [reitit.ring :as ring]
            [ring.util.response :refer [response]]))

(defn get-entry-by-id [] (response "Hello, World!"))

(def router (ring/router [["/entry"
                           ["/:id" {:get get-entry-by-id}]]]))

(def handler (ring/ring-handler router))