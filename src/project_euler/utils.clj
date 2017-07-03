(ns project-euler.utils)

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
