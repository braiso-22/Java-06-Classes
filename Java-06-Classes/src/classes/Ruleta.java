package classes;

import java.util.Random;

/**
 *
 * @author brais.fernandezvazqu
 */
public class Ruleta {

    private Random r = new Random();
    private int posicionBola;
    private int apuesta;
    private int saldo;
    private int premio;

    public Ruleta() {
        apuesta = 3;
        saldo=0;
    }

    public void apostar(int apuesta, int dinero) {
        if (saldo >= dinero && apuesta <= 2 && apuesta >= 0) {
            this.apuesta = apuesta;
            this.premio = dinero * 2;
            this.saldo = this.saldo - dinero;
        } else {
            System.out.println("No te queda dinero o no has indicado bien tu apuesta");
        }

    }

    public void setSaldoInicial(int dineroInicial) {
        this.saldo = dineroInicial;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void girarRuleta() {
        posicionBola = r.nextInt(37);
        switch (apuesta) {
            case 0:
                if (apuesta == posicionBola) {
                    this.saldo = this.saldo + premio;
                    System.out.println("Felicidades, ha salido: " + posicionBola);
                } else {
                    System.out.println("Lo siento, ha salido: " + posicionBola);
                }
                break;
            case 1:
                if (posicionBola % 2 != 0 && posicionBola != 0) {
                    this.saldo = this.saldo + premio;
                    System.out.println("Felicidades, ha salido: " + posicionBola);
                } else {
                    System.out.println("Lo siento, ha salido: " + posicionBola);
                }
                break;
            case 2:
                if (posicionBola % 2 == 0 && posicionBola != 0) {
                    this.saldo = this.saldo + premio;
                    System.out.println("Felicidades, ha salido: " + posicionBola);
                } else {
                    System.out.println("Lo siento, ha salido: " + posicionBola);
                }
                break;
            default:
                System.out.println("Error en la entrada de datos");
                break;
        }
        this.apuesta = 3;
            this.premio = 0;
           
    }
}
