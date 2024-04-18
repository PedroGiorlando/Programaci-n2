package punto2.Entidades;

public class Libro implements Prestable {
    private String titulo;
    private String autor;
    private int añoDePublicacion;
    private boolean prestado;

    public Libro(boolean prestado, int añoDePublicacion, String autor, String titulo) {
        this.prestado = prestado;
        this.añoDePublicacion = añoDePublicacion;
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public void prestar(){
        if(!prestado){
            prestado = true;
            System.out.println("El libro: "+ titulo + " ha sido prestado");
        }else{
            System.out.println("El libro: "+ titulo + " ya está prestado");
        }
    }

    @Override
    public void devolver() {
        if(prestado){
            prestado = false;
            System.out.println("El libro: "+ titulo+ " ha sido devuelto");
        }else{
            System.out.println("El libro: "+ titulo+ " ya está disponible");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
