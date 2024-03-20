import Entidades.Animal;
import Entidades.Gato;
import Entidades.Pajaro;
import Entidades.Perro;
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Serpiente", 3, false);
        Gato gato = new Gato("Juan", 4, true, "siames");
        Perro perro = new Perro("lola", 3, false, "bulldog");
        Pajaro pajaro = new Pajaro("coco", 1, true, "codorniz");

        animal.hacer_sonido();
        perro.hacer_sonido();
        pajaro.hacer_sonido();
        gato.hacer_sonido();

        animal.informacion();
        perro.informacion();
        gato.informacion();
        pajaro.informacion();
        //menu
        /* int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido\n" +
                "1. Sonido de animal\n" +
                "2. Sonido de gato\n" +
                "3. Informacion de gato\n");
        n = leer.nextInt();

        switch (n){
            case 1:
                animal.hacer_sonido();
                break;
            case 2:
                gato.hacer_sonido();
                break;
            case 3 :
                gato.informacion();
                break;
        } */
    }
    }