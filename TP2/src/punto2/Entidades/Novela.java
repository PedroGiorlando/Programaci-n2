package punto2.Entidades;

public class Novela extends Libro{
    private String tipo;

    public Novela(boolean prestado, int añoDePublicacion, String autor, String titulo, String tipo) {
        super(prestado, añoDePublicacion, autor, titulo);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
