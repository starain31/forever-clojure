(def problem-1
  (= true true))

(def problem-2
  (= (- 10 (* 2 3)) 4))

(assert (every? true? [problem-1 problem-2]))

(comment
  problem-1
  problem-2)