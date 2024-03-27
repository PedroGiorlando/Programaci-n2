package Punto2.Entidades;

import java.util.List;

public class Vuelo {

    private String origen;
    private String destino;
    private List<Reserva> reservas;

    public Vuelo(String origen, String destino, List<Reserva> reservas){
        this.origen = origen;
        this.destino = destino;
        this.reservas = reservas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}
