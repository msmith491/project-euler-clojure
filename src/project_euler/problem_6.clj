(in-ns 'project-euler.core)

(defn problem-6 []
  (println "Sum Square Difference")

  (defn exp [a b]
    (reduce * 1 (repeat b a)))

  (defn sum-of-squares [n]
    (reduce +' (map #(* % %) (range n))))

  (defn square-of-sums [n]
    (exp (reduce +' (range n)), 2))

  (println (- (square-of-sums 101) (sum-of-squares 101))))
