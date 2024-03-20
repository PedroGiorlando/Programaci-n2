package Entidades;

public class Bicicleta extends Vehiculo {

    private boolean tipo;

    public Bicicleta(String color, int ruedas, boolean tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @java.lang.Override
    public String toString() {
        return "Bicicleta{" +
                "tipo=" + tipo +
                '}' + super.toString();
    }
}
