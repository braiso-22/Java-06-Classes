package mains;

import classes.Alumno;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e12 {

    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Brais Fernández Vázquez","54157611F","Fernado Wirtz","2002-03-22");
        Alumno alumno2=new Alumno("Adrián Fernández Vázquez","54456456V","Grande Obra De Atocha","2007-01-07");
        Alumno alumno3=new Alumno("Raúl Fernández García","12345666N","Grande Obra De Atocha","2002-07-07");
        Alumno alumno4=new Alumno("Blas Fernández Vázquez","54157611F","Fernado Wirtz","2002-03-22");
        
        System.out.println(alumno1.getDNI());
        System.out.println(alumno1.getEscuela());
        System.out.println(alumno1.getNombreCompleto());
        System.out.println(alumno1.getNacimiento());
        
        System.out.println(alumno1.mayorDeEdad());
        System.out.println(alumno1.mayorQue(alumno2));
        System.out.println(alumno1.duplicadoDe(alumno4));//Había que crear un Metodo Equals :(
        alumno4.setNombreCompleto("Brais Fernández Vázquez");
        System.out.println(alumno1.duplicadoDe(alumno4));
                
    }
    
}
