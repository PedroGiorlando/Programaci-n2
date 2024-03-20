
import Entidades.*;
import Servicios.vehiculoServicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bicicleta bici = new Bicicleta("negro", 2, true);
        Coche coche = new Coche("negro", 4, 20000, 299);
        Camioneta camioneta = new Camioneta("blanco", 4, 300, 450, 200);
        Motocicleta moto = new Motocicleta("gris", 2, true, 300, 100);



        vehiculoServicio service = new vehiculoServicio();


        ArrayList<Vehiculo> lista = new ArrayList<>();

        lista.add(bici);
        lista.add(coche);
        lista.add(camioneta);
        lista.add(moto);

        service.Catalogar(lista);




    }
}