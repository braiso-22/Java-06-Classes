package mains;

import classes.MovilPrepago;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e01 {

    public static void main(String[] args) {

        MovilPrepago movil1 = new MovilPrepago(633171659, 0.5f, 0.2f, 0.05f, 20);

        System.out.println("Tu saldo actual es de: " + movil1.consultarSaldo());

        movil1.efectuarLlamada(30);
        System.out.println("Tu saldo actual es de: " + movil1.consultarSaldo());
        
        movil1.recargar(10);
        System.out.println("Tu saldo actual es de: " + movil1.consultarSaldo());
        
        movil1.navegar(10);
        System.out.println("Tu saldo actual es de: " + movil1.consultarSaldo());
    }

}
