package Entidades;

public class Picaro extends PersonajeBase {

    public Picaro (String nombre, int nivel, int puntosVida){
        super(nombre, nivel, puntosVida);
    }

    @Override
    public int atacar(){
        return 25;
    }
    @Override
    public void defender(int dañoRecibido){
        super.defender(dañoRecibido * 3);
    }


}
