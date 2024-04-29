package Punto5;

import java.util.*;

public class ListaDeTareas implements Iterable<Tarea> {
    private List<Tarea> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        Collections.sort(tareas, Comparator.comparingInt(Tarea::getPrioridad).reversed());
    }

    public void eliminarTarea(String descripcion) {
        Iterator<Tarea> iterator = tareas.iterator();
        while (iterator.hasNext()) {
            Tarea tarea = iterator.next();
            if (tarea.getDescripcion().equals(descripcion)) {
                iterator.remove();
                break;
            }
        }

    }

    public int obtenerNumeroTotalTareas() {
        return tareas.size();
    }

    @Override
    public Iterator<Tarea> iterator() {
        return tareas.iterator();
    }
}