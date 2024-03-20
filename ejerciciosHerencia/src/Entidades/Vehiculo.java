package Entidades;

public class Vehiculo {


    private String color;
    private int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    @java.lang.Override
    public String toString() {
        return "color='" + color + '\'' +
                ", ruedas=" + ruedas +
                '}';
    }
}
