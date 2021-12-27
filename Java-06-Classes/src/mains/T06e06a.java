package mains;

import classes.Consola;
import classes.Nim;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e06a {

    public static void main(String[] args) {
        Nim juego = new Nim();
        int npj;
        while (!juego.Fin()) {
            Consola.PintarTablero(juego);
            System.out.println("Consola pensando...");
            npj=juego.Piensa();
            juego.Juega(npj/10, npj%10); 
            Consola.PintarTablero(juego);
            if (!juego.Fin()) {
                juego.Juega(Consola.leerEntero("Introduce la fila 1-3:") - 1, Consola.leerEntero("Introduce la cantidad a eliminar 1-7:"));

            }

        }
        System.out.println("Perdiste");
    }

}
