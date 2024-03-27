package Punto1.Entidades;

public class Piloto extends Persona implements Volador{

    public Piloto(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {

    }
}
