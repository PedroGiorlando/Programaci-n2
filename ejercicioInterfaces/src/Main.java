import Entidades.Guerrero;
import Entidades.Mago;
import Entidades.Picaro;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Conan", 10, 100);
        Mago mago = new Mago("Gandalf", 10, 80);
        Picaro picaro = new Picaro("Arya", 10, 90);


        System.out.println("Comienza el enfrentamiento:");
        System.out.println("===========================");

        int damageGuerreroToMago = guerrero.atacar();
        mago.defender(damageGuerreroToMago);
        System.out.println("El guerrero ataca al mago y le inflige " + damageGuerreroToMago + " de daño.");

        int damageMagoToPicaro = mago.atacar();
        picaro.defender(damageMagoToPicaro);
        System.out.println("El mago ataca al pícaro y le inflige " + damageMagoToPicaro + " de daño.");

        int damagePicaroToGuerrero = picaro.atacar();
        guerrero.defender(damagePicaroToGuerrero);
        System.out.println("El pícaro ataca al guerrero y le inflige " + damagePicaroToGuerrero + " de daño.");
    }


}