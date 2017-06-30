(defn half
  [s]
  (let [middle (quot (count s) 2)]
    (subs s 0 middle)))

(defn palindrome?
  [n]
  (let [str-n (str n)]
    (= (half str-n) (half (clojure.string/reverse str-n)))))

(def mult-seq
  (let [n-range (range 100 1000)]
    (for [x n-range
          y n-range
          :when (>= y x)]
      (* x y))))

(defn main
  []
  (->> mult-seq
       (filter palindrome?)
       (apply max)))

