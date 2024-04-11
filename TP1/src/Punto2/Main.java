package Punto2;

import Punto2.Entidades.Circulo;
import Punto2.Entidades.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}
