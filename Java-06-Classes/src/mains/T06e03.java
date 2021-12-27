package mains;

import classes.CuentaCorriente;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e03 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        CuentaCorriente c1 = new CuentaCorriente("ES3420802002032298765432");
        CuentaCorriente.setComision(0.03f, 0.03f);
        boolean salir = false;
        int opcion;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("\tElegiste Consultar Saldo");
                    System.out.println(c1.getSaldo());
                    teclado.nextLine();
                    break;
                case 2:
                    System.out.println("\tElegiste Ingreso");
                    System.out.println("Cuantos euros quieres añadir a tu cuenta?");
                    c1.ingresar(teclado.nextFloat());
                    break;
                case 3:
                    System.out.println("\tElegiste Retirar");
                    System.out.println("Cuantos euros quieres retirar de tu cuenta? \n Se aplicará una comisión");
                    if (c1.retirar(teclado.nextFloat())) {
                        System.out.println("Se ha efectuado el movimiento sin problemas");
                    } else {
                        System.out.println("No se ha podido retirar el dinero");
                    }
                    teclado.nextLine();teclado.nextLine();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
        System.out.println("");
    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Consultar Saldo");
        System.out.println("2 Ingreso");
        System.out.println("3 Retirar");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (Exception e) {
            return 999;
        }
    }

}
