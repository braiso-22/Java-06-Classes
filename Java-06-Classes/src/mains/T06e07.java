package mains;

import classes.Circulo;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e07 {

    public static void main(String[] args) {

        /*
            El atributo radio de la clase circulo si puede ser privado ya que 
            contamos con unos metodos get y set que nos permiten obtenerlos y 
            modificarlos
         */
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(4);

        System.out.println("Primer círculo");
        c1.setRadio(5);
        c1.mostrarTodo();

        System.out.println("Segundo círculo");
        c2.mostrarTodo();

    }

}
