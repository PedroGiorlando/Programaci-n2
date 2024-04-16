package Entidades;

public class Jugador {
    private String nombre;
    private int posicion;
    private int numCamiseta;
    private int edad;

    public Jugador(String nombre, int posicion, int numCamiseta, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
