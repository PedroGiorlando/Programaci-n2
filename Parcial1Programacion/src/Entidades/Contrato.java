package Entidades;

public interface Contrato {
    default double calculaIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser un valor positivo.");
        }
        return peso / (altura * altura);
    }

    default boolean hayPesoExtra(double imc) {
        return imc > 25; // Se considera sobrepeso si el IMC es mayor a 25
    }
    double tomarPulsaciones();
}
