package mains;

import classes.Examen;
import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class T06e15 {

    public static void main(String[] args) {
        Examen ex1 = new Examen();
        Scanner teclado = new Scanner(System.in);
        String as;
        System.out.println("Introduce las respuestas correctas:");
        ex1.setPreguntas(teclado.nextLine());
        System.out.println("Introduce las respuestas de un alumno:");
        as = teclado.nextLine();
        System.out.println("La nota es " + ex1.corregir(as));
    }

}
