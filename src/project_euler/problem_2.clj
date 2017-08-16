(in-ns 'project-euler.core)

(defn problem-2 []
  (println "Even Fibonacci Numbers")

  (defn fibaux [a b c]
    (cond
      (<= c 0) a
      :else (recur b (+' a b) (dec c))))

  (defn fib [n]
    (cond
      (<= n 2) 1
      :else (fibaux 0 1 n)))

  (defn result [n]
    (reduce +'
            (filter #(= 0 (mod % 2))
                    (take-while #(< % n)
                                (map fib
                                     (iterate inc 1))))))

  (println (result 4000000)))
