(ns myweb.core
  (:require [selmer.parser :as tmpl]))

(tmpl/render"<h1>Hello, {{ name }}</h1>" {:name "Froosh"})

(tmpl/render-file "hello.html" {:name "Frannie"})

;; (require '[clojure.java.io :as io])
;; (tmpl/set-resource-path! (io/resource "templates"))

(defn myapp [{{name "name"} :params}]
  (respond-tmpl "hello.html" {:name name}))

(defn respond-html [s]
  {:body s
   :status 200
   :header {"Content-Type" "text-html"}})

(def respond-tmpl (comp respond-html tmpl/render-file))

(myapp {:params {"name" "Joe"}})
