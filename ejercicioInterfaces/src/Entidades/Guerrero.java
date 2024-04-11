package Entidades;

public class Guerrero extends PersonajeBase {

    public Guerrero(String nombre, int nivel, int puntosVida){
        super(nombre, nivel, puntosVida);
    }


    @Override
    public int atacar(){
        return 12;
    }
    @Override
    public void defender(int dañoRecibido){
        super.defender(dañoRecibido / 2);
    }


}
