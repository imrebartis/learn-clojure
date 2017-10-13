(ns learnclojure.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(comment

(require '[clojure.test :refer [is testing]])

(testing "Make sure foo works"
(is (= (foo "") "Hello, World!")) ;; true
(is (= (foo "Hey, ") "Hey, Hello, World!"))) ;; true
)
