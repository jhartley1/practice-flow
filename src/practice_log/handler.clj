(ns practice-log.handler
  (:require [reitit.ring :as ring]
            [ring.util.response :refer [response]]
            [hiccup2.core :as h]
            [hiccup.page :as hp]))




(defn home [r]
  (response
   (hp/html5 [:p])))

(defn entry [ts msg] [])

(defn log [r] 
  (response (hp/html5 
             [:ol 
              [:li "Test Item"] 
              [:li "Test Item 2"]])))

(defn get-entry-by-id [r]
  (response (hp/html5 [:p "entry"])))

(def router (ring/router [["/" {:get home}]
                          ["/log" {:get log}]
                          ["/entry" ["/:id" {:get get-entry-by-id}]]]))

(def handler (ring/ring-handler router))