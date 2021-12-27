package mains;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09h {

    public static void main(String[] args) {

        LocalDate fecha, hoy;
        Locale pais = new Locale("gl", "GL");
        DayOfWeek dia;
        hoy = LocalDate.of(LocalDate.now().getYear(), 12, 31);

        System.out.println("Os días da semana do 31 de decembro dos 5 anos anteriores foron:");
        for (fecha = hoy.minus(5, ChronoUnit.YEARS); fecha.getYear() < hoy.getYear(); fecha = fecha.plus(1, ChronoUnit.YEARS)) {
            dia=fecha.getDayOfWeek();
            System.out.println(dia.getDisplayName(TextStyle.FULL, pais));
        }

    }
}
