(ns user
  (:require [integrant.core :as ig]
            [practice-log.system :as system]
            [integrant.repl :as repl]
            [clojure.tools.namespace.repl :refer [set-refresh-dirs]]))

(set-refresh-dirs "src")

(repl/set-prep! 
 #(ig/prep {:adapter/jetty {:port 3000 :join? false}}))

(comment
  (repl/go)

  (repl/reset)
  
  (repl/halt)

  :rcf)

