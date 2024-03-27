package Entidades;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        saldo -= cantidad;
        if (saldo < 0) {
            sobregiro += Math.abs(saldo);
            saldo = 0;
        }
        numRetiros++;
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                sobregiro = 0;
            }
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones realizadas: " + (numConsignaciones + numRetiros));
        System.out.println("Valor de sobregiro: " + sobregiro);
    }

}
