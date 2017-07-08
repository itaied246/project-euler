(ns project-euler.p020
  (:require [project-euler.utils :as utils]))

(def number 100)

(defn main
  []
  (->> (utils/factorial number)
       (utils/sum-of-digits)))
