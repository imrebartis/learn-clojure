(def hello (fn [] "Hello"))

(hello)

(#(str "Hello"))

;; assign a function & create it at the same time
(defn hello [] "Hello")

(defn hello [name] (str "Hello, " name))

(hello, "K")

(defn hello [name title] (str "Hello, " title " " name))

(hello "Frances" "Captain")

(defn hello "Greets a person named <name> with their <title>" [name title] (str "Hello, " title " " name))

(require '[clojure.repl :refer [doc]])
(doc hello)



(defn hello
  ([] "Hello, World")
  ([name] (str "Hello, " name)))

(hello "Jack")


(defn hello
  ([] (hello "World"))
  ([name] (str "Hi, " name)))

(hello "b") ;;=> should be "Hi, b" but instead it's "Hello, b"


;; destructuring 1
(defn hello [config]
  (str "Hello, " (:name config)))

(hello {:name "Joe"})

;; destructuring 2
(defn hello [{name :name}]
  (str "Hi, " name))
(hello {:name "Jay"})

;; destructuring 3
(defn hello [[name title]]
  (str "Ho, " title " " name))
(hello ["Lucky" "Miss"])

