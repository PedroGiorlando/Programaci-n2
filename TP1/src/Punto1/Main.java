package Punto1;

import Punto1.Entidades.Gerente;
import Punto1.Entidades.Trabajador;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", 40, 5000, "Ventas");
        gerente.organizarActividades();
        gerente.trabajar();

        Trabajador trabajador = new Trabajador("María", 25, 3000, "Producción");
        trabajador.producir();
        trabajador.trabajar();
    }
}
