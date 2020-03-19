(defun bateria()
(print "Cuantos volteos tiene su bateria?")
(setq b (read))
(cond 
((< b 10)(print "Cambie su bateria"))
((> b 10) (combustible))))

(defun combustible ()
(print "Compruebe el indicador de combustible (Ingrese 1 si esta vacio o 2 si esta lleno")
(setq c(read))
(cond 
((= c 1)(print "Llene su deposito de combustible"))
((= c 2)(print "Su coche no sirve, mandelo al taller"))))

(print "1.Si    2.No")
(print "Arranca su coche?")
(setq a (read))
(cond 
((= a 1)(print "Su coche esta en buen estado"))
((= a 2)(bateria)))
(setq w (read))