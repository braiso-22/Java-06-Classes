package mains;

import classes.Consola;
import classes.Nim;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e06b {

    public static void main(String[] args) {
        Nim juego = new Nim();
        int npj;
        String npj1, npj2 = "";
        while (!juego.Fin()) {
            Consola.PintarTablero(juego);
            juego.Juega(Consola.leerEntero("Introduce la fila 1-3:") - 1, Consola.leerEntero("Introduce la cantidad a eliminar 1-7:"));
            Consola.PintarTablero(juego);
            System.out.println("Consola pensando...");
            npj=juego.Piensa();
            npj1 = String.valueOf(npj / 10);
            npj2 = String.valueOf(npj).charAt(1) + "";
            juego.Juega(Integer.parseInt(npj1), Integer.parseInt(npj2));

        }

    }

}
