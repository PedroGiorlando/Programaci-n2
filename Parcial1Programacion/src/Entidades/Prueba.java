package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    private String codigo;
    private String titulo;
    private List<Atleta> atletas;

    public Prueba(String codigo) {
        this.codigo = codigo;
        this.atletas = new ArrayList<>();
    }


    public void agregarAtleta(Atleta atleta) {
        this.atletas.add(atleta);
    }


    public Atleta getAtleta(int indice) {
        if (indice < 0 || indice >= atletas.size()) {
            throw new IllegalArgumentException("Índice de atleta fuera de rango.");
        }
        return atletas.get(indice);
    }


    public String getCodigo() {
        return codigo;
    }
}
