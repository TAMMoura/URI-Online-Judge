(def id (read-string (read-line)))
(def hours (read-string (read-line)))
(def hourlyValue (read-string (read-line)))
(def salary (* hours hourlyValue))

(printf "NUMBER = %d\n" id)
(printf "SALARY = U$ %.2f\n" salary)