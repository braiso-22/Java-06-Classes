package mains;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09a {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        LocalDate nacimiento;
        LocalDate hoy=LocalDate.now();
        
        System.out.println("Introduce tu fecha de nacimiento formato AAAA-MM-DD"
                         + " y te digo cuantos dias han pasado");
        nacimiento=LocalDate.parse(teclado.nextLine());
        System.out.println("Han pasado " + nacimiento.until(hoy, ChronoUnit.DAYS)+ " días");
        
        

    }
    
}
