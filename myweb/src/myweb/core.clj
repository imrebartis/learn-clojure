(ns myweb.core
  (:require [ring.adapter.jetty :as jetty]))

(defn myapp [request]
  {:body "Hallöchen"
   :status 200
   :headers {"Content-Type" "text/html"}})

(myapp {})

(defn -main []
  (jetty/run-jetty myapp {:port 3000}))
