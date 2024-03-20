package Entidades;

public class Perro extends Animal{
    private String Raza;

    public Perro(String nombre, int edad, boolean genero, String raza) {
        super(nombre, edad, genero);
        this.Raza = raza;
    }

    public void hacer_sonido() {
        System.out.println("El Perro ladra");
    }

    public void informacion() {
        String MoF;
        if (this.genero) {
            MoF = "Masculino";
        } else {
            MoF = "Femenino";
        }

        System.out.println("\n nombre: " + this.nombre + "\n edad: " + this.edad + "\n genero: " + MoF + "\n raza: " + this.Raza);
    }
}
