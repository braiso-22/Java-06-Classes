package mains;

import java.time.*;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09e {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        LocalDate fecha;

        System.out.println("Introduce una fecha formato AAAA-MM-DD y te digo el "
                         + "día de la semana ");
        fecha = LocalDate.parse(teclado.nextLine());
        System.out.println(fecha.getDayOfWeek());

    }
}
