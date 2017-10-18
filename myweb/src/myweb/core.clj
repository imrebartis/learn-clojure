(ns myweb.core
  (:require [net.cgrand.enlive-html :as enlive]
            [ring.adapter.jetty :as jetty]))

(enlive/deftemplate hello-tpl "hello.html"
  [name]
  [:h1] (enlive/do->
        (enlive/wrap :main)
        (enlive/html-content "Hurray"))
  ;[:h1] (enlive/wrap :main)
  ;[h1:] (enlive/set-attr :class "test")
  ;[h1:] (enlive/html-content (str "Hello, " name)
  )

;(hello-tpl "Kimmy")

; table tbody tr:first-of-type
(enlive/defsnippet table-row-tpl "hello.html" [:table :tbody [:tr enlive/first-of-type]]
 [rowdata]
 [[:td (enlive/nth-of-type 1)]] (enlive/html-content (:id rowdata))
 [[:td (enlive/nth-of-type 2)]] (enlive/html-content (:name rowdata))
 [[:td (enlive/nth-of-type 3)]] (enlive/html-content (:date rowdata)))

(enlive/deftemplate table-tpl "hello.html"
  [rows]
  [:h1] (enlive/html-content "Customers")
  [:table :tbody] (enlive/content (map table-row-tpl rows)))

(defn myapp [req]
  {:body (table-tpl [{:id 1 :name "Jimmy" :date "Today"}
                     {:id 2 :name "Jane" :date "Tomorrow"}
                     {:id 2 :name "Deirdra" :date "Ever"}])
         :status 200
         :headers {"Content-Type" "text/html"}})

(defn -main []
  (jetty/run-jetty myapp {:port 3000}))

