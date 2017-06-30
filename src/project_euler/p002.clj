; 4613732
(ns project-euler.p002)

(def fib-values
    (loop [a 1 
           b 2 
           result [a]] 
        (if (> b 4000000)
        result
        (recur b (+ b a) (conj result b)))))

(defn main
  []
  (->> fib-values
       (filter even?)
       (reduce +)))