package mains;

import classes.Ruleta;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e14 {

    static Scanner teclado;
    
    public static void main(String[] args) {
        Ruleta juego= new Ruleta();
        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("Introduce tu dinero inicial");
        juego.setSaldoInicial(teclado.nextInt());teclado.nextLine();
        do {
           opcion=pintarMenu ();
           switch (opcion) {
               case 1: System.out.println("\tLas apuestas son 0 Cero, 1 Impar y 2 Par"); 
                   System.out.println("Elige la apuesta y el dinero a apostar");
                   juego.apostar(teclado.nextInt(), teclado.nextInt());teclado.nextLine();
                    break;
               case 2: System.out.println("\tGirando ruleta..."); 
                    juego.girarRuleta();
                    break;  
               case 3:System.out.println("Tu saldo actual es: "+juego.getSaldo());
                   
                    break;
               case 0: salir=true; break;    
               default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }  // fin main    
    
   private static int pintarMenu (){
      System.out.println("");  
      System.out.println("Elija una opción:");  
      System.out.println("1 Apostar");  
      System.out.println("2 Girar Ruleta");  
      System.out.println("3 Dinero Actual");  
      System.out.println("0 Salir del programa");  
      try {                  //si introduce un valor no entero haría return 999
        return Integer.parseInt (teclado.nextLine());
      } catch (Exception e ) {return 999;}
   }
}
