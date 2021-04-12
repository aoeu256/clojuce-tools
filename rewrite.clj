
（defn rewrite-eval 
	【form (:optional history (var '()) 】
	(update 
	(match form
		[op & body] (apply-rewrite op body history)
		[x]         (eval x)))

(defn apply-rewrite	[op body history]
	(apply op (map rewrite-eval body history)))

	