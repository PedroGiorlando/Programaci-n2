package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Instalacion {
    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;
    private List<Prueba> pruebas;

    public Instalacion() {
        this.pruebas = new ArrayList<>();
    }

    // Método para agregar una prueba a la instalación
    public void agregarPrueba(Prueba prueba) {
        this.pruebas.add(prueba);
    }

    // Método para obtener una prueba por índice
    public Prueba getPrueba(int indice) {
        if (indice < 0 || indice >= pruebas.size()) {
            throw new IllegalArgumentException("Índice de prueba fuera de rango.");
        }
        return pruebas.get(indice);
    }

    public void agregarAtleta(Atleta atleta1) {
    }
}
