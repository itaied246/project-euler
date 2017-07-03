; 104743
(ns project-euler.p007
  (:require [project-euler.utils :as utils]))

(def prime-index 10001)

(defn main
  []
  (last (take prime-index utils/prime-numbers)))
