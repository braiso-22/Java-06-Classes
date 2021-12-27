package mains;

import classes.Ruleta;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e14b {

    static Scanner teclado;
    
    public static void main(String[] args) {
        Ruleta juego= new Ruleta();
        teclado = new Scanner(System.in);
        
        juego.setSaldoInicial(10000);
        
        for(int i=1;i<=10000;i++){
            juego.apostar(2, 1);
            juego.girarRuleta();
        }
        System.out.println("Saldo: "+ juego.getSaldo());
   }
}

//Casi todas las veces se pierden sobre 200-500€ :/