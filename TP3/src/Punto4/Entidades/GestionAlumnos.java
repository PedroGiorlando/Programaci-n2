package Punto4.Entidades;

import java.util.*;

public class GestionAlumnos {
    private static final List<Alumno> listaAlumnos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n1. Agregar alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Calcular y mostrar media de notas");
            System.out.println("4. Mostrar alumno con la nota más alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("6. Salir");
            System.out.print("\nElija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    mostrarListaAlumnos();
                    break;
                case 3:
                    calcularMediaNotas();
                    break;
                case 4:
                    mostrarAlumnoNotaMasAlta();
                    break;
                case 5:
                    buscarAlumnoPorNombre();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }

        scanner.close();
    }

    private static void agregarAlumno() {
        System.out.println("\nIngrese el nombre del alumno:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la nota del alumno:");
        double nota = scanner.nextDouble();

        Alumno alumno = new Alumno(nombre, edad, nota);
        listaAlumnos.add(alumno);

        System.out.println("Alumno agregado correctamente.");
    }

    private static void mostrarListaAlumnos() {
        System.out.println("\nLista de alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    private static void calcularMediaNotas() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos en la lista.");
            return;
        }

        double sumaNotas = 0;
        for (Alumno alumno : listaAlumnos) {
            sumaNotas += alumno.getNota();
        }

        double media = sumaNotas / listaAlumnos.size();
        System.out.println("\nLa media de notas de todos los alumnos es: " + media);
    }

    private static void mostrarAlumnoNotaMasAlta() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos en la lista.");
            return;
        }

        Alumno alumnoNotaMasAlta = Collections.max(listaAlumnos, Comparator.comparing(Alumno::getNota));
        System.out.println("\nAlumno con la nota más alta:");
        System.out.println(alumnoNotaMasAlta);
    }

    private static void buscarAlumnoPorNombre() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos en la lista.");
            return;
        }

        System.out.println("\nIngrese el nombre del alumno a buscar:");
        String nombreBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Información del alumno:");
                System.out.println(alumno);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún alumno con ese nombre.");
        }
    }
}
