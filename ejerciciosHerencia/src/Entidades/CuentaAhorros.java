package Entidades;

public class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        cuentaActiva = saldo >= 10000; // Si el saldo es mayor o igual a $10 000, la cuenta está activa
    }

    @Override
    public void consignar(float cantidad) {
        if (cuentaActiva) {
            super.consignar(cantidad);
        } else {
            System.out.println("Error: La cuenta de ahorros está inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (cuentaActiva) {
            super.retirar(cantidad);
        } else {
            System.out.println("Error: La cuenta de ahorros está inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        cuentaActiva = saldo >= 10000;
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones realizadas: " + (numConsignaciones + numRetiros));
    }
}

