package punto2.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro \"" + libro.getTitulo() + "\" agregado a la biblioteca.");
    }

    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo) && !libro.isPrestado()) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no está disponible para préstamo.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo) && libro.isPrestado()) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no se puede devolver porque no está prestado.");
    }


}
