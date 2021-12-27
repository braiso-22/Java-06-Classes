package classes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brais.fernandezvazqu
 */
public class Pistola {

    private Random r = new Random();
    private int posicionBala;
    private int posicionPistola;
    private Scanner a = new Scanner(System.in);
    private boolean muerto = false;
    private int jugador;

    public Pistola() {

        posicionPistola = 1;
        jugador = 1;
    }

    public void nuevaPartida() {
        posicionBala = r.nextInt(6) + 1;
        while (!muerto) {
            if (jugador % 2 != 0) {
                System.out.println("Listo para disparar jugador 1?");
            } else {
                System.out.println("Listo para disparar jugador 2?");
            }
            a.nextLine();
            disparar();
            jugador += 1;
        }
        if (muerto) {
            posicionPistola = 1;
            jugador = 1;
            muerto=false;
        }
    }

    public void disparar() {
        if (posicionPistola == posicionBala) {
            if (jugador % 2 != 0) {
                System.out.println("Pum jugador1 muerto\n");
            } else {
                System.out.println("Pum jugador2 muerto\n");
            }
            muerto = true;
        } else {
            System.out.println("Suerte, por ahora...\n");
        }
        posicionPistola += 1;
    }

}
