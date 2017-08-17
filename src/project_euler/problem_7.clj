(in-ns 'project-euler.core)

(defn problem-7 []

  (defn prime? [n]
    (cond
      (some #{n} [2 3]) true
      :else (cond
              (or (= 0 (mod n 2)) (= 0 (mod n 3))) false
              :else (loop [curr 5]
                      (cond
                        (> (* curr curr) n) true
                        :else (cond
                                (or (= 0 (mod n curr))
                                    (= 0 (mod n (+ curr 2)))) false
                                :else (recur (+ curr 6))))))))
  (defn nth-prime [n]
    (nth (filter #(prime? %) (range)) n))

  (println (nth-prime 10001)))
