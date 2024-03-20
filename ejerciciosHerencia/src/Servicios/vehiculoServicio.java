package Servicios;
import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Vehiculo;

public class vehiculoServicio{

    public void Catalogar(ArrayList<Vehiculo> lista) {

        for (Vehiculo vehiculos : lista) {
            System.out.println(vehiculos);
        }

        System.out.println("Ingrese cantidad de ruedas: ");
        Scanner leer = new Scanner (System.in);
        int n = leer.nextInt();

        if (n == 0){
            System.out.println("Eligio 0 ruedas");
        } else if (n == 2) {
            System.out.println("Eligio 2 ruedas");
        } else if (n == 4) {
            System.out.println("Eligio 4 ruedas");
        }else {
            System.out.println("Ingreso un numero incorrecto");
        }
        }

    }

