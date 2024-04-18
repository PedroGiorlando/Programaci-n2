package punto2.Entidades;

public class Infantil extends Libro{
    private int edadRecomendada;

    public Infantil(boolean prestado, int añoDePublicacion, String autor, String titulo, int edadRecomendada) {
        super(prestado, añoDePublicacion, autor, titulo);
        this.edadRecomendada = edadRecomendada;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
}
