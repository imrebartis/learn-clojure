(defn my-sum [total vals]
  (if (empty? vals)
    total
    (my-sum (+ (first vals) total) (rest vals))))

(my-sum 0 [0 1 2 3 4]) ;; 10

(defn my-sum
  ([vals] (my-sum 0 vals))
  ([total vals]
    (if (empty? vals)
    total
    (recur (+ (first vals) total) (rest vals)))))


(my-sum [0 1 2 3 4]) ;; 10


(defn my-sum [vals]
  (loop [total 0 vals vals]
  (if (empty? vals)
    total
    (recur (+ (first vals) total) (rest vals)))))


(my-sum [0 1 2 3 4]) ;; 10

(reduce (fn [total vals] (+ total vals)) 0 [0 1 2 3 4]) ;; 10

(+ (+ (+ (+ (+ 0 0) 1) 2) 3) 4) ;; 10

(defn summer [total val]
  (+ total val))

(reduce summer 0 [1 2 3 4]) ;; 10

(reduce + 0 [1 2 3 4]) ;; 10

(reduce + [1 2 3 4]) ;; 10

(defn filter-even [acc next-val]
  (if (even? next-val)
    (conj acc next-val)
    acc))

(reduce filter-even [] [0 1 2 3 4 5 6]) ;; [0 2 4 6]

(filter even? [0 1 2 3 4 5 6]) ;; [0 2 4 6]

(defn map-inc [acc next-val]
  (conj acc (inc next-val)))

(reduce map-inc [] [0 1 2 3 4 5 6]) ;; [1 2 3 4 5 6 7]

(map inc [0 1 2 3 4 5 6]) ;; [1 2 3 4 5 6 7]

(defn group-even [acc next-val]
  (let [key (if (even? next-val) :even :odd)]
    (update-in acc [key] #(conj % next-val))))

(reduce group-even {} [0 1 2 3 4 5 6]) ;; {:odd (5 3 1), :even (6 4 2 0)}

(group-by #(if (even? %) :even :odd) [0 1 2 3 4 5 6]) ;; {:even [0 2 4 6], :odd [1 3 5]}