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


## Problema 3

Agrego al método tirarDado la corrección "enCasillaCastigo[jugadorActual] = false;" que permite verificar que el
jugador que sale de la carcel sale reflejado verdaderamente.

## Problema 4

Hago publico el método jugadorHaGanado() para poder introducirlo en el Test, le quito la exclamación para cambiar la
lógica de que cuando el jugador tenga 6 monedas es el ganador y cambio en el GameLauncher el booleano noGanador por ganador.

Creo el test unitario "noGanador_a_ganador"

## Problema 5

Cojo el código jugadorActual++ que se utiliza para pasar al siguiente jugador, lo refactorizo en un método común y
elimino donde se encuentra el código duplicado.

Creo el test unitario "siguienteJugador"