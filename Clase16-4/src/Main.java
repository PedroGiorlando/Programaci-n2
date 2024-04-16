import Entidades.Equipo;
import Entidades.Jugador;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        equipo.agregarJugador(new Jugador("Juan", 13, 7, 21));
        equipo.agregarJugador(new Jugador("María", 12, 10, 20));

        for (Jugador jugador : equipo) {
            System.out.println("Nombre del jugador: " + jugador.getNombre());
            System.out.println("Posición del jugador: " + jugador.getPosicion());
            System.out.println("Número de camiseta: " + jugador.getNumCamiseta());
            System.out.println("Edad del jugador: " + jugador.getEdad());
        }

        
    }
}