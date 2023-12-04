(ns practice-log.handler
  (:require [reitit.ring :as ring]
            [ring.util.response :refer [response]]))

(defn get-entry-by-id [r] (response (str "Hello, " (:id (:path-params r)))))

(def router (ring/router [["/entry"
                           ["/:id" {:get get-entry-by-id}]]]))

(def handler (ring/ring-handler router))