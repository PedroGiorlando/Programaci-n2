package Punto1.Entidades;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public void organizarActividades() {
        System.out.println(nombre + " está organizando actividades en el departamento de " + departamento + ".");
    }

}
