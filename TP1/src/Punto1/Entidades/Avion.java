package Punto1.Entidades;

public class Avion {
    private String modelo;
    private String fabricante;
    private int capacidadPasajeros;
    private int capacidadCarga;

    public Avion(String modelo, String fabricante, int capacidadPasajeros, int capacidadCarga){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadCarga = capacidadCarga;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
