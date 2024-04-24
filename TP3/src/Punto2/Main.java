package Punto2;

import Punto2.Entidades.Empleado;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("Maria");


        empleado1.asignarSupervisor(empleado2);


        System.out.println("El supervisor del empleado 1 es: " + empleado1.obtenerNombreSupervisor());

    }
}
