(ns learnclojure.core
  (:import (java.util Date Calendar)))

(System/currentTimeMillis) ;; => 1507888589768

(Date. (System/currentTimeMillis)) ;; => #inst "2017-10-13T09:57:25.169-00:00"

(. (Date.) getTime) ;; => 1507888712260
(.getTime (Date.)) ;; => 1507888712260

(doto (Calendar/getInstance)
  (.set Calendar/YEAR 1985)
  (.set Calendar/MONTH 9)
  (.set Calendar/DATE 26)) ;; => #inst "1985-10-26T13:02:05.290+02:00"

;; creating an array of integers, objects, etc. with a specific length:
(int-array 100)
(object-array 100)

;; placing items into an array:
(def myarray (into-array String ["this" "is" "an" "array"]))


;; gettin' an item from an array:
(aget myarray 1);; =>  "is"

;; changing an item in an array:
(aset myarray 1 "was") ;; =>  "was"

(amap myarray idx ret (aset ret idx (apply str (reverse (aget myarray idx))))) ;; =>  #<String[] [Ljava.lang.String;@13afb41b>

;; length of myarray in characters:
(areduce myarray idx ret (long 0) (+ ret (count (aget myarray idx)))) ;; => 14

;; letting clojure know the type in order to make code faster:
(set! *warn-on-reflection* true)
(defn strlen [^String s] (.length s))
(defn badstrlen [s] (.length s))
(strlen "test") ;; =>  4
(time (reduce + (map badstrlen (repeat 100000 "asdf")))) ;; => 400000 (terminal: Elapsed time: 508.095486 msecs)
(time (reduce + (map strlen (repeat 100000 "asdf")))) ;; => 400000 (terminal: Elapsed time: 25.267557 msecs)

(defn -main [] (println "Done"))
