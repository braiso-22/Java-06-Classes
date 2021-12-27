package mains;

import classes.MovilPrepago;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e02 {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        MovilPrepago movil1 = new MovilPrepago(633171659, 0.5f, 0.2f, 0.01f, 20);

        
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("\tElegiste Saldo");
                    System.out.println(movil1.consultarSaldo());
                    teclado.nextLine();
                    break;
                case 2:
                    System.out.println("\tElegiste Recarga");
                    System.out.println("Cuanto quieres recargar?");
                    movil1.recargar(teclado.nextInt());
                    break;
                case 3:
                    System.out.println("\tElegiste Llamada");
                    System.out.println("Cuantos segundos durará la llamada?");
                    movil1.efectuarLlamada(teclado.nextInt());
                    break;
                case 4:
                    System.out.println("\tElegiste Navegar");
                    System.out.println("Cuantos MB vas a gastar en esta busqueda?");
                    movil1.navegar(teclado.nextInt());
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
        System.out.println("1 Saldo");
        System.out.println("2 Recarga");
        System.out.println("3 Llamada");
        System.out.println("4 Navegar");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }

}
