package mains;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09c {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        LocalTime hora, hora2;
        
        System.out.println("Introduce 2 horas de reloj formato HH:MM y te digo "
                         + "cuanto tiempo hay entre las 2");
        hora=LocalTime.parse(teclado.nextLine());
        hora2=LocalTime.parse(teclado.nextLine());
        System.out.println("Han pasado " + hora.until(hora2, ChronoUnit.SECONDS)
                         + "segundos");
        
        
        

    }
    
}
