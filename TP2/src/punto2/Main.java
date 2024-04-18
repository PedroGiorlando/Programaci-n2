package punto2;

import punto2.Entidades.Biblioteca;
import punto2.Entidades.Infantil;
import punto2.Entidades.Novela;
import punto2.Entidades.Universitario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Novela novela = new Novela(false, 1988, "H.Hallet", "Amanecer de otoño", "Drama");
        Universitario universitario = new Universitario(false, 2012, "Anónimo", "Anatomía de los invertebrados", "Anatomía");
        Infantil infantil = new Infantil(false, 2019, "Nana", "La granja", 6);

        biblioteca.agregarLibro(novela);
        biblioteca.agregarLibro(universitario);
        biblioteca.agregarLibro(infantil);


        // Listar libros disponibles
        System.out.println("Libros disponibles en la biblioteca:");
        biblioteca.listarLibrosDisponibles();

        // Prestar un libro
        biblioteca.prestarLibro("Anatomía de invertebrados");

        // Listar libros disponibles después de prestar uno
        System.out.println("Libros disponibles en la biblioteca después de prestar uno:");
        biblioteca.listarLibrosDisponibles();

        // Devolver un libro
        biblioteca.devolverLibro("Anatomía de invertebrados");

        // Listar libros disponibles después de devolver uno
        System.out.println("Libros disponibles en la biblioteca después de devolver uno:");
        biblioteca.listarLibrosDisponibles();

    }
}
