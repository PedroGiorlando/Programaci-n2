package Punto5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionTareas {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ListaDeTareas listaDeTareas = new ListaDeTareas();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\n1. Agregar tarea");
                System.out.println("2. Mostrar todas las tareas");
                System.out.println("3. Eliminar tarea");
                System.out.println("4. Salir");
                System.out.print("\nElija una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        agregarTarea();
                        break;
                    case 2:
                        mostrarTodasLasTareas();
                        break;
                    case 3:
                        eliminarTarea();
                        break;
                    case 4:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elija una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero para la opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
    }

    private static void agregarTarea() {
        try {
            System.out.println("\nIngrese la descripción de la tarea:");
            String descripcion = scanner.nextLine();

            System.out.println("Ingrese la prioridad de la tarea:");
            int prioridad = scanner.nextInt();

            Tarea tarea = new Tarea(descripcion, prioridad);
            listaDeTareas.agregarTarea(tarea);

            System.out.println("Tarea agregada correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: La prioridad debe ser un número entero.");
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }

    private static void mostrarTodasLasTareas() {
        if (listaDeTareas.obtenerNumeroTotalTareas() == 0) {
            System.out.println("\nNo hay tareas en la lista.");
            return;
        }

        System.out.println("\nLista de tareas:");
        for (Tarea tarea : listaDeTareas) {
            System.out.println(tarea);
        }
    }

    private static void eliminarTarea() {
        if (listaDeTareas.obtenerNumeroTotalTareas() == 0) {
            System.out.println("\nNo hay tareas en la lista.");
            return;
        }

        System.out.println("\nIngrese la descripción de la tarea a eliminar:");
        String descripcion = scanner.nextLine();

        listaDeTareas.eliminarTarea(descripcion);

        System.out.println("Tarea eliminada correctamente.");
    }
}
