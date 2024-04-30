package Punto1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        boolean adivinado = false;
        while (!adivinado) {
            System.out.print("Introduce tu intento: ");
            try {
                int intento = scanner.nextInt();
                intentos++;

                if (intento < 1 || intento > 100) {
                    System.out.println("Por favor, introduce un número entre 1 y 100.");
                    continue;
                }

                if (intento == numeroAdivinar) {
                    adivinado = true;
                    System.out.println("¡Felicidades! ¡Has adivinado el número " + numeroAdivinar + "!");
                    System.out.println("Número de intentos: " + intentos);
                } else if (intento < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
                intentos++;
            }
        }

        scanner.close();
    }
}