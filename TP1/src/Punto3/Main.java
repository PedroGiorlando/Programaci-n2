package Punto3;

import Punto3.Entidades.LibrosDeTexto;
import Punto3.Entidades.LibrosDeTextoUNAL;
import Punto3.Entidades.Novela;

public class Main {
    public static void main(String[] args) {

        LibrosDeTexto libroTexto = new LibrosDeTexto("Álgebra Lineal", "García", "Matemáticas");
        libroTexto.setPrecio(35.50);
        libroTexto.imprimirInfo();

        LibrosDeTextoUNAL libroUNAL = new LibrosDeTextoUNAL("Cálculo", "Pérez", "Matemáticas", "Ingeniería");
        libroUNAL.setPrecio(40.75);
        libroUNAL.imprimirInfo();

        Novela novela = new Novela("Cien años de soledad", "García Márquez", "Realista");
        novela.setPrecio(25.99);
        novela.imprimirInfo();
    }
}
