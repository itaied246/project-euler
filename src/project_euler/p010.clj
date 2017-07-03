; 142913828922
(ns project-euler.p010
  (:require [project-euler.p007 :as p007]))

(def limit 2000000)

(defn main
  []
  (reduce +
          (take-while #(< % limit) p007/prime-numbers)))