(ns user
  (:require [practice-log.handler :refer handler]
            [integrant.core :as ig]
            [integrant.repl :as repl]))

(repl/set-prep! 
 #(ig/prep {:adapter/jetty {:port 3000 :join? false :handler handler}}))

(comment
  (repl/go)

  (repl/reset)
  
  (repl/halt)

  :rcf)

