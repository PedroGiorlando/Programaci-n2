package punto1;


import punto1.Entidades.*;


public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();


        Animal perro = new Perro("Fido ", 3, " Canino ", 320, " Labrador", true);
        Animal gato = new Gato("Whiskers ", 5, " Felino ", 170, " Egipcio", true);
        Animal ave = new Ave("Polly ", 2, " Ave ", 350, " Loro", true);
        Animal pez = new Pez("Nemo ", 1, " Acuático ", 90, " Pacífico ", " Azul");


        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);


        tienda.listarAnimales();


        tienda.alimentarAnimal("Whiskers");

        tienda.venderAnimal("Fido");

        // Listamos los animales nuevamente para ver los cambios
        tienda.listarAnimales();
    }
}
