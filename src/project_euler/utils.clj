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

(defn char-int
  [c]
  (- (int c) (int \0)))

(defn factorial
  [n]
  (reduce *' (range 1 (inc n))))

(defn sum-of-digits
  ([n] (sum-of-digits n 0))
  ([n sum]
   (if (zero? n)
     sum
     (recur (quot n 10) (+ sum (rem n 10))))))

(defn fib
  ([] (fib 1 1))
  ([a b] (lazy-seq (cons a (fib b (+' a b))))))