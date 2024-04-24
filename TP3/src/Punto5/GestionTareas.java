package Punto5;

import java.util.Scanner;

public class GestionTareas {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("\nElija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarTarea(listaDeTareas);
                    break;
                case 2:
                    mostrarTodasLasTareas(listaDeTareas);
                    break;
                case 3:
                    eliminarTarea(listaDeTareas);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }

        scanner.close();
    }

    private static void agregarTarea(ListaDeTareas listaDeTareas) {
        System.out.println("\nIngrese la descripción de la tarea:");
        String descripcion = scanner.nextLine();

        System.out.println("Ingrese la prioridad de la tarea:");
        int prioridad = scanner.nextInt();

        Tarea tarea = new Tarea(descripcion, prioridad);
        listaDeTareas.agregarTarea(tarea);

        System.out.println("Tarea agregada correctamente.");
    }

    private static void mostrarTodasLasTareas(ListaDeTareas listaDeTareas) {
        System.out.println("\nLista de tareas:");
        for (Tarea tarea : listaDeTareas) {
            System.out.println(tarea);
        }
    }

    private static void eliminarTarea(ListaDeTareas listaDeTareas) {
        System.out.println("\nIngrese la descripción de la tarea a eliminar:");
        String descripcion = scanner.nextLine();

        listaDeTareas.eliminarTarea(descripcion);

        System.out.println("Tarea eliminada correctamente.");
    }
}
