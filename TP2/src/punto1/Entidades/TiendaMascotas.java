package punto1.Entidades;
import java.util.ArrayList;
import java.util.List;
public class TiendaMascotas {

    private List<Animal> animales;


    public TiendaMascotas() {

        this.animales = new ArrayList<>();
    }


    public void addAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Se ha agregado el animal: " + animal);
    }


    public void venderAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            if (animal.toString().contains(nombre)) {
                animales.remove(i);
                System.out.println("Se ha vendido el animal: " + animal);
                return;
            }
        }
        System.out.println("No se encontró ningún animal con ese nombre.");
    }


    public void alimentarAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.toString().contains(nombre)) {
                animal.alimentar(nombre);
                return;
            }
        }
        System.out.println("No se encontró ningún animal con ese nombre.");
    }


    public void listarAnimales() {
        System.out.println("Animales en la tienda:");
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }
}
