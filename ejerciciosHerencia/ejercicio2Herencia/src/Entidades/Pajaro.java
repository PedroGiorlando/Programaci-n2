package Entidades;

public class Pajaro extends Animal{
    private String Especie;

    public Pajaro(String nombre, int edad, boolean genero, String especie) {
        super(nombre, edad, genero);
        this.Especie = especie;
    }

    public void hacer_sonido() {
        System.out.println("El Pajaro canta");
    }

    public void informacion() {
        String MoF;
        if (this.genero) {
            MoF = "Masculino";
        } else {
            MoF = "Femenino";
        }

        System.out.println("\n nombre: " + this.nombre + "\n edad: " + this.edad + "\n genero: " + MoF + "\n especie: " + this.Especie);
    }
}
