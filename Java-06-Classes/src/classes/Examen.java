package classes;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Examen {

    private String preguntas;
    private String respuestas;
    private float nota;
    private Scanner a;

    public Examen() {
        preguntas = "aaaaaaaaaaaaaaaaaaaa";
        nota = 0;
        a = new Scanner(System.in);
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
        while (this.preguntas.length() != 20) {
            System.out.println("Numero de preguntas diferente de 20");
            this.preguntas = a.nextLine();
        }
        this.preguntas = preguntas;
    }

    public float corregir(String respuestas) {
        this.respuestas = respuestas;
        while (respuestas.length() != 20) {
            System.out.println("Numero de preguntas diferente de 20, introducelo bien");
            this.respuestas = a.nextLine();
        }

        for (int i = 0; i < preguntas.length(); i++) {
            if (preguntas.charAt(i) == this.respuestas.charAt(i)) {
                nota = nota + 0.5f;
            } else if ('z' == this.respuestas.charAt(i)) {
            } else {
                nota = nota - 0.2f;
            }
        }
        if (nota < 0) {
            nota = 0;
        }
        return nota;
    }
}
