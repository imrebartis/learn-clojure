(def x "Hi Clojure")

(let [x "Jim"]
  (print "Hello, " x))

(str x)

(if (empty? x)
  "X is empty"
  "X is not empty")

(if nil
  "Yes" "No")

(if (empty? x)
  nil
  (do
    (println "Omg")
    :omg))

(if-not (empty? x)
  (do
    (println "Omg")
    :omg))

(when-not (empty? x)
  (println "Omg")
  :omg)

(when (not (empty? x)) :omg)

(case x
  "Goodbye"      :goodbye
  "Hi Clojure"   :hello
  :nothing)

(cond
  (= x "Goodbye"):goodbye
  (= (apply str (reverse x)) "erujolC iH") :olleh
  :otherwise :nothing)
