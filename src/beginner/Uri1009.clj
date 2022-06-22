(def sellerName (read-string (read-line)))
(def fixedSalary (read-string (read-line)))
(def salesAmount (read-string (read-line)))
(def total (+ (/ (* salesAmount 15.0) 100.0) fixedSalary))

(printf "TOTAL = R$ %.2f\n" total)