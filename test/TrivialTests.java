import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }
    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1()
    {
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";
        String actual = sut.nuevaPosicionJugador();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minimo_dos_jugadores()
    {
        Game minimo = new Game();
        minimo.agregar("Víctor");

        boolean expected = false;
        boolean actual = minimo.esJugable();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maximo_seis_jugadores()
    {
        Game maximo = new Game();
        maximo.agregar("Alberto");

        boolean expected = false;
        boolean actual = maximo.esJugable();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void noGanador_a_ganador()
    {
        Game ganador = new Game();
        ganador.agregar("Victor");

        boolean expected = true;
        boolean actual = ganador.jugadorHaGanado();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void siguienteJugador()
    {
        Game siguiente = new Game();
        siguiente.agregar("Luis");
        siguiente.agregar("Victor");

        boolean expected = false;
        boolean actual = siguiente.siguienteJugador();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void simplificaMetodofueRespuestaCorrecta()
    {
        Game simpli = new Game();
        simpli.agregar("Victor");

        boolean expected = true;
        boolean actual = simpli.contadorMonedas();
        Assertions.assertEquals(expected, actual);
    }
}
