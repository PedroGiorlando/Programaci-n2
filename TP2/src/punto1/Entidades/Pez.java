package punto1.Entidades;

public class Pez extends Animal{
    private String oceano;
    private String colorDominante;

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String oceano, String colorDominante) {
        super(nombre, edad, tipoAnimal, precio);
        this.oceano = oceano;
        this.colorDominante = colorDominante;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n" +
                "Oceano: " + oceano + "\n" +
                "Color Dominante: " + colorDominante;
    }


    public String getOceano() {
        return oceano;
    }

    public void setOceano(String oceano) {
        this.oceano = oceano;
    }

    public String getColorDominante() {
        return colorDominante;
    }

    public void setColorDominante(String colorDominante) {
        this.colorDominante = colorDominante;
    }

}
