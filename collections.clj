(def x (list 1 2 3))

(cons 0 x)

(print x);; in the console this should still show (1 2 3), because collections are immutable

(first x);; 1
(last x);; 3
(nth x 1);; 2

;; create new list
(cons 0 x) ;; (0 1 2 3)
(conj x) ;; (0 1 2 3)

(def v [1 2 3]) ;; [1 2 3]
(conj v 0) ;; [1 2 3 0]
(concat x v) ;;(1 2 3 1 2 3)

(def m {:a 1 :b 2})
(type m) ;; clojure.lang.PersistentArrayMap
(array-map :a 1 :b 2)
(type (hash-map :a 1 :b 2)) ;; clojure.lang.PersistentHashMap

(assoc {:a 1} :b 2) ;; {:b 2, :a 1}
(assoc-in {:settings {:a 1 :b 2}} [:settings :a] "a") ;; {:settings {:a "a", :b 2}}

(update-in {:settings {:a 1 :b 2}} [:settings :a] inc) ;; {:settings {:a 2, :b 2}}

(get m :a) ;; 1
(:a m) ;; 1

(def s #{1 2 3})
(conj s 4) ;; #{1 2 3 4}
(disj s 3) ;; #{1 2}
(contains? s 3) ;; true
(get s 3) ;; 3








