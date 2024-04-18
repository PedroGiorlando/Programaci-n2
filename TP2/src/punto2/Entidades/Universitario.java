package punto2.Entidades;

public class Universitario extends Libro{
    private String materia;

    public Universitario(boolean prestado, int añoDePublicacion, String autor, String titulo, String materia) {
        super(prestado, añoDePublicacion, autor, titulo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
