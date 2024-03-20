package Entidades;

public class Gato extends Animal {
    private String Raza;

    public Gato(String nombre, int edad, boolean genero, String raza) {
        super(nombre, edad, genero);
        this.Raza = raza;
    }

    public void hacer_sonido() {
        System.out.println("El Gato maulla");
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
