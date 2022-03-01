# Trivial

## Problema 0

Extraemos el código duplicado a un único método "nuevaPosiciónJugador",
al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

## Problema 1

Utilizo el método esJugable() que verifica dos jugadores como mínimo y lo implemento
en el GameLauncher como condición.

Creo el test unitario "minimo_dos_jugadores"

## Problema 2

Modifico el método esJugable() agregando un máximo de seis jugadores y aumento el tamaño del la
lista de jugadores a siete ya que po defecto pone seis y como la posicion en la que comienza es 1
supera el tamaño y sale el error outOfBounds.

Creo el test unitario "maximo_seis_jugadores"
