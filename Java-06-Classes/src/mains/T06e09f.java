package mains;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09f {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        LocalDateTime fecha;
        int producto;

        System.out.println("Introduce el tipo de progucto 1-3 y la fecha de "
                + "compra AAAA-MM-DDThh-mm");
        producto = teclado.nextInt();
        teclado.nextLine();
        fecha = LocalDateTime.parse(teclado.nextLine());
        
        if(caducidad(producto, fecha)){
            System.out.println("Se puede devolver");
        }else{
            System.out.println("No se puede devolver");
        }

    }

    public static boolean caducidad(int tipo, LocalDateTime fecha) {
        LocalDateTime hoy = LocalDateTime.now();
        switch (tipo) {
            case 1:
                if (fecha.isBefore(hoy.minus(5, ChronoUnit.HOURS))) {
                    return false;
                }
                return true;
            case 2:
                if (fecha.isBefore(hoy.minus(6, ChronoUnit.MONTHS))) {
                    return false;
                }
                return true;
            case 3:
                if (fecha.isBefore(hoy.minus(15, ChronoUnit.DAYS))) {
                    return false;
                }
                return true;
            default:
                System.out.println("Tipo incorrecto");
                return false;
        }
        
    }
}
