(ns project-euler.p025
  (:require [project-euler.utils :as utils]))

(def num-of-digits 1000)

(defn count-digits
  [n]
  (count (str n)))

(defn main
  []
  (->> (take-while
         #(< (count-digits %) num-of-digits)
         (utils/fib))
       (count)
       (inc)))
