package Punto1.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String curso;
    private char letra;
    private List<Alumno> alumnos;

    public Grupo(String curso, char letra) {
        this.curso = curso;
        this.letra = letra;
        this.alumnos = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


}
