package Punto3;

import java.util.Scanner;

public class AreaTriangul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = 0;
        double altura = 0;

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Ingrese la base del triángulo: ");
                String baseStr = scanner.nextLine();
                base = Double.parseDouble(baseStr);

                System.out.print("Ingrese la altura del triángulo: ");
                String alturaStr = scanner.nextLine();
                altura = Double.parseDouble(alturaStr);

                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número válido para la base y la altura.");
            }
        }

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
