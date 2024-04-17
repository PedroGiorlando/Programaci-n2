import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Punto 1
        List<Integer> numeros = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el entero #" + (i+1));
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        int maximo = numeros.get(0);
        int posicionMaximo = 0;


        for(int i = 1; i<10; i++){
            if (numeros.get(i)> maximo){
                maximo = numeros.get(i);
                posicionMaximo = i;
            }
        }

        System.out.println("El mayor numero es: "+ maximo + " y esta en la posición: " + (posicionMaximo+1));*/

        /*Punto2
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el entero #" + (i + 1));
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        int mayorPrimo = encontrarMayorPrimo(numeros);
        if(mayorPrimo != 0){
            System.out.println("El mayor número primo es: "+ mayorPrimo);
        } else{
            System.out.println("No se encontraron números primos");
        }


    }

    private static int encontrarMayorPrimo(List<Integer> numeros) {
        int mayorPrimoEncontrado = 0;

        for(int num : numeros){
            if(esPrimo(num)) {

            if (num> mayorPrimoEncontrado){
                mayorPrimoEncontrado = num;
            }
            }
        }
    return mayorPrimoEncontrado;
    }

    public static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        return true;
        }*/

        /*Punto 3
        List<Integer> primosEntre100y300 = encontrarPrimosEntre(100, 300, 10);

        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int primo : primosEntre100y300) {
            System.out.println(primo);
        }
    }

    private static List<Integer> encontrarPrimosEntre(int inicio, int fin, int cantidad) {
        List<Integer> primos = new ArrayList<>();
        int numero = inicio;

        while (primos.size() < cantidad && numero <= fin) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }

        return primos;
    }
    public static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        return true;
        }*/
        /*Punto4
        List<Integer> numeros = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.println("Los números terminados en 4 se encuentran en las siguientes posiciones:");


        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            if (terminaEnCuatro(numero)) {
                System.out.println("Número: " + numero + ", Posición: " + (i + 1));
            }
        }
    }

    private static boolean terminaEnCuatro(int numero) {
        return numero % 10 == 4;
    }*/
    /*Punto5
        List<Integer> numeros = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }


        int mayor = encontrarMayor(numeros);


        int repeticionesDelMayor = contarRepeticiones(numeros, mayor);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número mayor se repite " + repeticionesDelMayor + " veces.");
    }

    private static int encontrarMayor(List<Integer> numeros) {
        int mayor = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    private static int contarRepeticiones(List<Integer> numeros, int numero) {
        int contador = 0;
        for (int num : numeros) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;
    }*/

}
}

