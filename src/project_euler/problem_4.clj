(in-ns 'project-euler.core)

(use '[clojure.string :only (join)])

(defn problem-4 []
  (println "Largest Palindrome Product")

  (defn palindrome? [x]
    (= (str x) (join (reverse (str x)))))

  (defn largest-palindrome-product []
    (range 999 1 -1)))
