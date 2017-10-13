(ns learnclojure.core-test
  (:require [clojure.test :refer [is deftest testing]]))

;; (is (= (+ 1 1) 2)) ;; => true

;; (is (nil? (first ["a"]))) false
;; (is (instance? Integer 123.4)) false

(deftest my-test
 ;; this will fail when you run lein test in the terminal:
  ;; (testing "1 + 1 = 1"
    ;; (is (= (+ 1 1) 1)))

;; this will pass when you run lein test in the terminal:
  (testing "Ensure 2 - 1 = 1"
    (is (= (- 2 1) 1)))
  )
