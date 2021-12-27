package mains;

import classes.EjemplarLibro;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e08 {

    public static void main(String[] args) {
        
        EjemplarLibro l1=new EjemplarLibro("Don Quijote");
        EjemplarLibro l2=new EjemplarLibro(l1);
        EjemplarLibro l3=new EjemplarLibro(l2);
        EjemplarLibro l4=new EjemplarLibro(l3);
        
        l2.prestar();
        l4.prestar();
        l2.devolver();
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        System.out.println(l4.toString());

    }
    
}
