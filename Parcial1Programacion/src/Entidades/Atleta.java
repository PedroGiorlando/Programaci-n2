package Entidades;

public class Atleta extends Persona implements Contrato, Math{
    private double altura;
    private int edad;
    private double peso;
    private EquipoNacional equipo;
    private Prueba prueba;
    private String nombre;

    public Atleta(double altura, int edad, double peso, EquipoNacional equipo, Prueba prueba, String nombre) {
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
        this.equipo = equipo;
        this.prueba = prueba;
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public EquipoNacional getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoNacional equipo) {
        this.equipo = equipo;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public double calculaIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    @Override
    public boolean hayPesoExtra(double imc) {
        return imc > 25;
    }

    @Override
    public double tomarPulsaciones() {
        return 0.0;
    }

}
