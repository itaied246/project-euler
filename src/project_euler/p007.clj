; 104743
(ns project-euler.p007)

(def prime-index 10001)

(def prime-numbers
  ((fn f [x]
     (cons x
           (lazy-seq
             (f (first
                  (drop-while
                    (fn [n]
                      (some #(zero? (rem n %))
                            (take-while #(<= (* % %) n) prime-numbers)))
                    (iterate inc (inc x))))))))
    2))

(defn main
  []
  (last (take prime-index prime-numbers)))
