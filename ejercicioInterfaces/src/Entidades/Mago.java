package Entidades;

public class Mago extends PersonajeBase{

    public Mago (String nombre, int nivel, int puntosVida){
        super(nombre, nivel, puntosVida);
    }

    @Override
    public int atacar(){
        return 20;
    }
    @Override
    public void defender(int dañoRecibido){
        super.defender((dañoRecibido) * 2);
    }


}
