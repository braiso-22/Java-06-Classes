package mains;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author brais.fernandezvazqu
 */
public class T06e09d {

    public static void main(String[] args) {
        LocalDate ahora=LocalDate.now();
        LocalDate uno;
        int cuenta=0;
        for(uno=LocalDate.of(1,1,1);uno.getYear()<=ahora.getYear();uno=uno.plus(1,ChronoUnit.YEARS)){
            if(uno.isLeapYear())cuenta+=1;
        }
        System.out.println("Ha habido " +cuenta +" años bisiestos desde el 1 dC");
        
        
        

    }
    
}
