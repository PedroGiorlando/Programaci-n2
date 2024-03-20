package Entidades;

public class Coche extends Vehiculo {


    private int km;
    private int cc;

    public Coche(String color, int ruedas, int km, int cc) {
        super(color, ruedas);
        this.km = km;
        this.cc = cc;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "km=" + km +
                ", cc=" + cc +
                '}' + super.toString();
    }
}
