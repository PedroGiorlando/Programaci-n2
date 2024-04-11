package Punto3.Entidades;

public class LibrosDeTexto extends Libro {

    private String curso;

    public LibrosDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso: " + curso);
    }
}
