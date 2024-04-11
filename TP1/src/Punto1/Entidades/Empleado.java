package Punto1.Entidades;

public class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }


}
