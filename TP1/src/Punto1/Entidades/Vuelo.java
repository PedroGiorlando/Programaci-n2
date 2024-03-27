package Punto1.Entidades;
import java.util.ArrayList;
import java.util.List;
public class Vuelo {

    private Avion avion;

    private String destino;
    private int horario;

    public Vuelo(String destino, int horario){
        this.destino = destino;
        this.horario = horario;
    }
    private List<Reserva> reservas;

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva>reservas) {
        this.reservas = reservas;
    }
}
