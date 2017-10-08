(ns learnclojure.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;;added main
(defn -main []
  (foo "Main"))
