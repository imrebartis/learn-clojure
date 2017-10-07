
(type 1)
(type 1.1)
(type true)
(type "Hello")

(type (keyword "a"))

(type (quote a))
(type 'a)

(type (list 1 2 3))
(type '(1 2 3))
(type [1 2 3])
(type (vector 1 2 3))

(nth (vector 1 2 3) 2)

(first (list 1 2 3))
(last (list 1 2 3))

(type (hash-map :a 1 :b 1))
(type {:a 1 :b 1 :c 1})
(:a {:a 1 :b 2})

(type (hash-set 1 2 3 4))
(type #{1 2 3 4})