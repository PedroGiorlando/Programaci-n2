package Entidades;

import Entidades.Bicicleta;

public class Motocicleta extends Bicicleta {
    private int velocidad;
    private int cc;

    public Motocicleta(String color, int ruedas, boolean tipo, int velocidad, int cc) {
        super(color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @java.lang.Override
    public String toString() {
        return "Motocicleta{" +
                "velocidad=" + velocidad +
                ", cc=" + cc +
                '}' + super.toString();
    }
}
