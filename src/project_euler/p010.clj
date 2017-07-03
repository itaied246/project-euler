; 142913828922
(ns project-euler.p010
  (:require [project-euler.utils :as utils]))

(def limit 2000000)

(defn main
  []
  (reduce +
          (take-while #(< % limit) utils/prime-numbers)))