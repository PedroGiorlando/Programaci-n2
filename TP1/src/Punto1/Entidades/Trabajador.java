package Punto1.Entidades;

public class Trabajador extends Empleado{
    private String area;

    public Trabajador(String nombre, int edad, double salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }
    public void producir() {
        System.out.println(nombre + " está produciendo en el área de " + area + ".");
    }

}
