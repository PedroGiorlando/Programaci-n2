package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipo implements Iterable<Jugador>{
    private List<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }


    public List<Jugador> getJugadores() {
        return jugadores;
    }


    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public Iterator<Jugador> iterator() {
        return jugadores.iterator();
    }


}
