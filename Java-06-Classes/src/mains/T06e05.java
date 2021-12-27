package mains;


import classes.Ahorcado;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e05 {

   

    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado("palabra", "un sustantivo");
        while (!juego.perdio() && !juego.adivinada()) {
            juego.pintar();

            juego.probarLetra(juego.leerLetra());
        }
        juego.pintar();
        if (juego.adivinada()) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }

    }  // fin main    

}
