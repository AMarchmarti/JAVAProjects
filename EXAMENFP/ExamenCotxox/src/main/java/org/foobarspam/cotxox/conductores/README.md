# Clase Conductor

### ATRIBUTOS
- ```nombre``` del conductor
- ```modelo``` modelo del coche
- ```matricula```
- ```valoracionMedia``` valoración media del conductor
- ```valoraciones``` array de longitud variable que almacena todas las valoraciones del
conductor
- ```ocupado``` indica si el conductor está prestando un servicio o está libre.

### MÉTODOS
- ```setValoracion(valoracion)``` añade la nueva valoración y actualiza la valoración
media del conductor.


# Clase PoolConductores

### ATRIBUTOS
- ```poolConductores``` es un array de longitud variable de conductor es

### MÉTODOS
- El constructor ```PoolConductores(conductores)``` recibe un array de longitud variable
de conductores.
- ```asignarConductor()``` selecciona un conductor libre entre la flota y lo devuelve,
estableciendo que ese conductor está ahora ocupado.
