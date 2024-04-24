package Punto2.Entidades;

public class Empleado {
    private String nombre;
    private Empleado supervisor;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void asignarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public String obtenerNombreSupervisor() {
        if (supervisor != null) {
            return supervisor.getNombre();
        } else {
            return "Sin supervisor";
        }
    }

    public String getNombre() {
        return nombre;
    }
}
