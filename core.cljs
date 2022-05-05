(def problem-1
  (= true true))

(def problem-2
  (= (- 10 (* 2 3)) 4))

(def problem-3 (= "HELLO WORLD" (.toUpperCase "hello world")))

(assert (every? true? [problem-1 problem-2 problem-3]))

(comment
  problem-1
  problem-2)