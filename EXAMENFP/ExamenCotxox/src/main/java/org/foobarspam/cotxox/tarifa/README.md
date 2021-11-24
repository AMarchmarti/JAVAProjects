# Clase Tarifa

### ATRIBUTOS
- ```costeMilla``` Cotxox fija en 1.35€ el coste de la milla.
- ```costeMinuto``` Cotxox fija en 0.35€ el coste del minuto.
- ```costeMinimo``` El coste mínimo que cobra Cotxox por un viaje es de 5€.
- ```porcentajeComision``` la comisión que cobra cotxox sobre el coste del viaje es
del 20%.


### MÉTODOS
- ```getCosteDistancia(distancia)``` devuelve la parte del coste del trayecto debido al a
distancia.
- ```getCosteTiempo(minutos)``` devuelve la parte del coste del trayecto debido a su
duración en minutos.
- ```getCosteTotalEsperado(carrera)``` devuelve el coste total esperado de la carrera
que recibe en función de la distancia esperada y el tiempo esperado. El coste total esperado no puede ser inferior al mínimo.
