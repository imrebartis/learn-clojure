(ns learnclojure.core
  (:require [clojure.string :refer [split]])
  (:import [java.util.Date])
  )

;; (require '[clojure.string :refer [split]])
;; (import 'java.util.Date)

(split "a,b,c" #",") ;; => ["a" "b" "c"]
(Date.) ;; => #inst "2017-10-13T07:35:44.108-00:00"
