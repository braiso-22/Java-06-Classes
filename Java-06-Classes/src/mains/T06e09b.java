package mains;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09b {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        LocalDate fecha;
        
        System.out.println("Introduce una fecha formato AAAA-MM-DD y una"
                         + " cantidad de días y te digo la fecha que es después"
                         + " de esos días");
        fecha=LocalDate.parse(a.nextLine()).plus(a.nextInt(), ChronoUnit.DAYS);
        System.out.println(fecha);
        
        
        

    }
    
}
