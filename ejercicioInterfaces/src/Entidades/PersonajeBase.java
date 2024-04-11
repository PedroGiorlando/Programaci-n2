package Entidades;

abstract class PersonajeBase implements Personaje {
    String nombre;
    int nivel;
    int puntosVida;

    public PersonajeBase (String nombre, int nivel, int puntosVida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    @Override
    public int atacar(){
        return 10;
    }

    @Override
    public void defender(int dañoRecibido){
        this.puntosVida -= dañoRecibido;
    }

}
