; 837799
(ns project-euler.p014)

(def top-bound 1000000)

(defn proc-even
  [n]
  (/ n 2))

(defn proc-odd
  [n]
  (inc (* n 3)))

(defn next-collatz
  [n]
  (if (even? n)
    (proc-even n)
    (proc-odd n)))

(defn count-terms
  ([n] (count-terms n 1))
  ([n count]
   (if (= 1 n)
     count
     (recur (next-collatz n) (inc count)))))

(defn main
  []
  (let [range (range 1 top-bound)]
    (key (apply max-key val
                (zipmap range (map count-terms range))))))
