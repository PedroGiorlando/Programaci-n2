import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operacion;

        System.out.println("Bienvenido a la calculadora básica");

        System.out.print("Ingrese el primer número: ");
        try {
            num1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
            return;
        }

        System.out.print("Ingrese el segundo número: ");
        try {
            num2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
            return;
        }
        
        System.out.println("Elija la operación a realizar:");
        System.out.println("a. Suma (+)");
        System.out.println("b. Resta (-)");
        System.out.println("c. Multiplicación (*)");
        System.out.println("d. División (/)");
        System.out.print("Ingrese la opción: ");
        operacion = scanner.next().charAt(0);

        try {
            switch (operacion) {
                case 'a':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 'b':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 'c':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 'd':
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: División por cero.");
                    }
                    System.out.println("Resultado: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}