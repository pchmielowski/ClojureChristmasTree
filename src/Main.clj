(ns Main)

(defn marginWidth [tree trunk]
  (/ (- tree trunk) 2))

(defn trunkWidth [i]
  (+ 1 (* 2 i)))

(defn treeWitdh [height]
  (- (* height 2) 1))

(defn margin [i height]
  (reduce str (map (fn [_] " ")
                   (range (marginWidth (treeWitdh height) (trunkWidth i))))))

(defn trunk [i]
  (reduce str (map (fn [_] "*")
                   (range (trunkWidth i)))))

(defn stage [i h]
  (str (margin i h) (trunk i) (margin i h) "\n"))

(defn tree [height]
  (doseq [i (range height)] (print (stage i height))))

(tree 15)
