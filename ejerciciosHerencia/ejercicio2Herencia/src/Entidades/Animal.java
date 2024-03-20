package Entidades;

public class Animal {
    public String nombre;
    public int edad;
    public boolean genero;

    public Animal(String nombre, int edad, boolean genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void hacer_sonido() {
        System.out.println("El animal hace un sonido generico");
    }

    public void informacion() {
        String MoF;
        if (this.genero) {
            MoF = "Masculino";
        } else {
            MoF = "Femenino";
        }

        System.out.println("\n nombre: " + this.nombre + "\n edad: " + this.edad + "\n genero: " + MoF);
    }

}
