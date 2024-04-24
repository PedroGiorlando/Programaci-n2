package Punto1;

import Punto1.Entidades.Alumno;
import Punto1.Entidades.Asignatura;
import Punto1.Entidades.Grupo;
import Punto1.Entidades.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Alumno alumno1 = new Alumno(12345678, "Juan Perez");


        Grupo grupo1 = new Grupo("1A", 'A');
        //grupo1.agregarAlumno(alumno1);


        Profesor profesor1 = new Profesor(98765432, "Maria Gomez", "Departamento de Matemáticas");


        Asignatura asignatura1 = new Asignatura(101, "8:00 - 10:00", "Matemáticas");
        asignatura1.setProfesor(profesor1);

        List<Asignatura> asignaturas = obtenerAsignaturasDelProfesor(profesor1);

        if (asignaturas.size() >= 3) {

            Asignatura terceraAsignatura = asignaturas.get(2);


            System.out.println("El aula de la tercera asignatura del profesor es: " + terceraAsignatura.getAula());
        } else {
            System.out.println("El profesor no imparte al menos tres asignaturas.");
        }

        //1.B
    /*if (!asignaturas.isEmpty()) {
        System.out.println("Asignaturas impartidas por el profesor:");
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre());
        }
    } else {
        System.out.println("El profesor no imparte ninguna asignatura.");
    }*/
    /*1.C
    Grupo grupo = obtenerGrupoDeAsignatura(asignatura1);


        if (grupo != null && !grupo.getAlumnos().isEmpty()){
        System.out.println("Alumnos del grupo " + grupo.getCurso() + grupo.getLetra() + ":");
        for (Alumno alumno : grupo.getAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
        }
    } else {
        System.out.println("No hay alumnos en el grupo asignado a esta asignatura.");
    }*/
        /*1.E
        Grupo primerGrupo = obtenerPrimerGrupoDelAlumno(alumno1);

        // Mostrar todas las asignaturas recibidas por el primer grupo
        if (primerGrupo != null) {
            List<Asignatura> asignaturas = obtenerAsignaturasDeGrupo(primerGrupo);

            if (!asignaturas.isEmpty()) {
                System.out.println("Asignaturas recibidas por el primer grupo del alumno:");
                for (Asignatura asignatura : asignaturas) {
                    System.out.println("Nombre de la asignatura: " + asignatura.getNombre());
                }
            } else {
                System.out.println("El primer grupo del alumno no tiene asignaturas asignadas.");
            }
        } else {
            System.out.println("El alumno no pertenece a ningún grupo.");
        }*/
        /*1.F
        Grupo grupo = obtenerGrupoDelAlumno(alumno1);
        if (grupo != null) {
            // Pedir al usuario por pantalla el nombre de la asignatura
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nombreAsignatura = scanner.nextLine();

            // Buscar la asignatura en las asignaturas del grupo
            Asignatura asignatura = buscarAsignaturaEnGrupo(grupo, nombreAsignatura);

            if (asignatura != null) {
                // Mostrar el profesor que imparte la asignatura
                System.out.println("El profesor que imparte la asignatura " + nombreAsignatura + " es: " + asignatura.getProfesor().getNombre());
            } else {
                System.out.println("La asignatura ingresada no existe en el grupo del alumno.");
            }
        } else {
            System.out.println("El alumno no pertenece a ningún grupo.");
        }*/
        /*1.G
        if (asignaturas.size() >= 2) {
            Asignatura segundaAsignatura = asignaturas.get(1);

            Grupo grupo = obtenerGrupoDeAsignatura(segundaAsignatura);

            if (grupo != null && !grupo.getAlumnos().isEmpty()) {
                System.out.println("Nombres de los alumnos inscritos en el grupo de la segunda asignatura:");
                for (Alumno alumno : grupo.getAlumnos()) {
                    System.out.println(alumno.getNombre());
                }
            } else {
                System.out.println("No hay alumnos inscritos en el grupo de la segunda asignatura.");
            }
        } else {
            System.out.println("El profesor no imparte al menos dos asignaturas.");
        }*/

    }


    public static List<Asignatura> obtenerAsignaturasDelProfesor(Profesor profesor) {

        // En este ejemplo devolvemos una lista vacía
        return new ArrayList<>();
    }

    public static Grupo obtenerGrupoDeAsignatura(Asignatura asignatura) {

        // En este ejemplo devolvemos null
        return null;
    }
    public static Grupo obtenerPrimerGrupoDelAlumno(Alumno alumno) {
        //ejemplo
        return null;
    }

    public static List<Asignatura> obtenerAsignaturasDeGrupo(Grupo grupo) {
        //ejemplo
        return new ArrayList<>();
    }
    public static Grupo obtenerGrupoDelAlumno(Alumno alumno) {
        return null;
    }

    public static Asignatura buscarAsignaturaEnGrupo(Grupo grupo, String nombreAsignatura) {
        return null;
    }


}

