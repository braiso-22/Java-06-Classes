package mains;

import classes.Pistola;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e13 {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        Pistola juego = new Pistola();
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("\tElegiste Nueva Partida");
                    juego.nuevaPartida();

                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }  // fin main    

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Nueva Partida");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }

}
