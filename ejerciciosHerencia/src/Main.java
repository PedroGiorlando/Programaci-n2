import Entidades.CuentaAhorros;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(10000,5);


        cuentaAhorros.consignar(2000);
        cuentaAhorros.retirar(1500);
        cuentaAhorros.retirar(20000);
        cuentaAhorros.extractoMensual();


        cuentaAhorros.imprimir();
    }
}

