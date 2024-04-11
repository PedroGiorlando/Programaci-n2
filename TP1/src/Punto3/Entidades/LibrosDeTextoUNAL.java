package Punto3.Entidades;

public class LibrosDeTextoUNAL extends LibrosDeTexto{
    private String facultad;

    public LibrosDeTextoUNAL(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
    }

}
