package Punto1.Entidades;

public class Reserva {
    private String asiento;
    private double precio;

    public Reserva(String asiento, double precio){

            this.asiento = asiento;
            this.precio = precio;

    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
