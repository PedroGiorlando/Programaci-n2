import Entidades.Atleta;
import Entidades.EquipoNacional;
import Entidades.Instalacion;
import Entidades.Prueba;

public class Main {
    public static void main(String[] args) {
        EquipoNacional equipoTemporal = new EquipoNacional("Amarillo", "Argentina");
        Prueba pruebaTemporal = new Prueba("001");
        Atleta atleta1 = new Atleta(1.80, 21, 75, equipoTemporal, pruebaTemporal, "Javier");
        Atleta atleta2 = new Atleta(1.60, 19, 60, equipoTemporal, pruebaTemporal, "Sandra");
        Atleta atleta3 = new Atleta(1.68, 20, 70, equipoTemporal, pruebaTemporal, "Carlos");

        Prueba prueba1 = new Prueba("001");
        Prueba prueba2 = new Prueba("002");

        Instalacion instalacion = new Instalacion();
        instalacion.agregarAtleta(atleta1);
        instalacion.agregarAtleta(atleta2);
        instalacion.agregarAtleta(atleta3);
        instalacion.agregarPrueba(prueba1);
        instalacion.agregarPrueba(prueba2);

        EquipoNacional equipo = new EquipoNacional();
        equipo.agregarAtleta(atleta1);
        equipo.agregarAtleta(atleta2);
        equipo.agregarAtleta(atleta3);

        System.out.println("Nombre del 3er atleta de la 2da prueba desde la Instalacion: " + instalacion.getPrueba(1).getAtleta(2).getNombre());
        System.out.println("Código de la 2da prueba desde la Instalacion: " + instalacion.getPrueba(1).getCodigo());

        System.out.println("Altura de todos los atletas desde el Equipo Nacional:");
        equipo.obtenerAlturaAtletas();

        System.out.println("Peso extra de cada atleta desde el Equipo Nacional:");
        equipo.obtenerPesoExtraAtletas();
    }

    }
