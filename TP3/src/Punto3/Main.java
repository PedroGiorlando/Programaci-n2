package Punto3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        // Insertar "Juernes" en la posición 4
        System.out.println("Insertando Juernes en la posición 4");
        diasSemana.add(4, "Juernes");

        // Mostrar el contenido de las posiciones 3 y 4
        System.out.println("Contenido de la posición 3: " + diasSemana.get(3));
        System.out.println("Contenido de la posición 4: " + diasSemana.get(4));

        // Mostrar el primer y último elemento
        System.out.println("Primer elemento de la lista: " + diasSemana.get(0));
        System.out.println("Último elemento de la lista: " + diasSemana.get(diasSemana.size() - 1));

        // Eliminar "Juernes" de la lista
        System.out.println("Eliminando 'Juernes' de la lista...");
        diasSemana.remove("Juernes");

        // Comprobar que "Juernes" ha sido eliminado
        if (!diasSemana.contains("Juernes")) {
            System.out.println("El elemento 'Juernes' ha sido eliminado de la lista.");
        } else {
            System.out.println("El elemento 'Juernes' no ha sido eliminado correctamente.");
        }

        // Crear un iterador y mostrar uno a uno los valores de la lista
        System.out.println("Mostrando los elementos de la lista con un iterador:");
        Iterator<String> iterador = diasSemana.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Buscar si existe "Lunes" en la lista
        System.out.println("Buscando si existe 'Lunes' en la lista...");
        boolean lunesEncontrado = false;
        for (String dia : diasSemana) {
            if (dia.equalsIgnoreCase("Lunes")) {
                lunesEncontrado = true;
                break;
            }
        }
        if (lunesEncontrado) {
            System.out.println("'Lunes' se encuentra en la lista.");
        } else {
            System.out.println("'Lunes' no se encuentra en la lista.");
        }

        // Borrar todos los elementos de la lista
        System.out.println("Borrando todos los elementos de la lista...");
        diasSemana.clear();

        // Mostrar que la lista está vacía
        if (diasSemana.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }
    }
}
