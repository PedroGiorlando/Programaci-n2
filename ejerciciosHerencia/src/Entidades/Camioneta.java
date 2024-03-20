package Entidades;

public class Camioneta extends Coche{

    private int carga;

    public Camioneta(String color, int ruedas, int km, int cc, int carga) {
        super(color, ruedas, km, cc);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @java.lang.Override
    public String toString() {
        return "Camioneta{" +
                "carga=" + carga +
                '}' + super.toString();
    }
}
