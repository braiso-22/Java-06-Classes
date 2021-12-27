package mains;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09g {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        LocalDate fecha, fecha2;
        int domingos = 0;

        
        
        System.out.println("Introduce un año y te digo cuantos domingos tiene");
        fecha = LocalDate.parse(teclado.nextLine() + "-01-01");
        fecha2 = fecha;
        while (fecha.getYear() == fecha2.getYear()) {
            if (fecha.getDayOfWeek().getValue() == 7) {
                domingos += 1;
            }
            fecha = fecha.plus(1, ChronoUnit.DAYS);

        }
        System.out.println("Hay " + domingos + " domingos");
        
        /*
        System.out.println("Introduce un año y te digo cuantos domingos tiene");
        fecha = LocalDate.parse(a.nextLine() + "-01-01");
        fecha2 = fecha;
        
        while (fecha.getYear() == fecha2.getYear()) {
            while (fecha.getDayOfWeek().getValue() != 7) {
                fecha = fecha.plus(1, ChronoUnit.DAYS);
                if (fecha.getDayOfWeek().getValue() == 7) {
                    domingos += 1;
                }
            }
            fecha = fecha.plus(7, ChronoUnit.DAYS);
            if (fecha.getYear() == fecha2.getYear()) {
                domingos += 1;
            }
        }
        System.out.println("Hay " + domingos + " domingos");*/
    }
}
