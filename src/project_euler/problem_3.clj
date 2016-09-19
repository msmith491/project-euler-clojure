(in-ns 'project-euler.core)

(defn problem-3 []
  (println "Largest Prime Factor")

  (defn prime? [n]
    (cond
      (= 1 n) true
      (= 2 n) true
      (= 3 n) true
      :else (cond
              (or (= 0 (mod n 2)) (= 0 (mod n 3))) false
              :else (loop [curr 5]
                      (cond
                        (> (* curr curr) n) true
                        :else (cond
                               (or (= 0 (mod n curr))
                                   (= 0 (mod n (+ curr 2)))) false
                                :else (recur (+ curr 6))))))))

  (defn prime-factors [bignum]
    (filter
      #(prime? %)
      (filter
        #(= 0 (mod bignum %))
        (take-while
          #(<= % (Math/sqrt (/ bignum 2)))
          (iterate inc 1)))))

  (println (apply max (prime-factors 600851475143)))
)
