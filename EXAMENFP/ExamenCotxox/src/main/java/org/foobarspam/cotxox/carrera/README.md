# Clase Carrera

### ATRIBUTOS
- crea las variables de instancia que estimes oportunas.
- ```tiempoEsperado``` del trayecto
- ```tiempoCarrera``` tiempo real empleado en el trayecto
- ```costeTotal``` real del trayecto
- ```conductor``` asignado a la carrera

### MÉTODOS
- ```getTarjetaCredito()``` devuelve el número de la tarjeta de crédito del usuario/a.
- ```getOrigen()``` devuelve el lugar de origen del trayecto.
- ```getDestino()``` devuelve el lugar de destino del trayecto.
- ```getDistancia()``` devuelve la distancia entre el origen y el destino.
- ```getCosteEsperado()``` devuelve el coste esperado del trayecto, cuyo cálculo es
responsabilidad de la clase Tarifa .
- ```asignarConductor(PoolConductores conductores)``` recibe la flota de conductores
y asigna un conductor a la carrera. Le pide a la clase PoolConductores que le asigne
un conductor(*Inyección de Dependencia*)
- ```getCosteEsperado()``` le pregunta a la clase Tarifa cuál es el coste total esperado.
- ```realizarPago(pago)``` recibe el pago y lo almacena en el atributo costeTotal
- ```recibirPropina(propina)``` recibe la propina que paga el usuario
- ```liberarConductor()``` establece que el conductor asignado a la carrera queda libre
tras el servicio.
