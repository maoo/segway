(ns segway.rename)

(import 'java.io.File)

(defn rename-file [prefix suffix dirpath file counter]
  (if (> counter 0) (.renameTo file (java.io.File. dirpath (str prefix "-" (if (< counter 10)
                                                          (str "0" counter)
                                                          (str counter )) "." suffix)))))

(defn rename [dirpath prefix suffix]
 (map (partial rename-file prefix suffix dirpath) (-> dirpath File. file-seq) (range)))

;(rename "/Users/mauriziopillitu/prj/segway/src/template/images/segway/routes/periurbano" "periurbano-square" "jpg")
