/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author brais.fernandezvazqu
 */
public class Alumno {

    private String nombreCompleto, DNI, escuela;
    private LocalDate nacimiento;

    public Alumno(String alumno, String DNI, String escuela, String nacimiento) {
        nombreCompleto=alumno;
        this.DNI=DNI;
        this.escuela=escuela;
        this.nacimiento=LocalDate.parse(nacimiento);
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public String getEscuela() {
        return escuela;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public boolean mayorDeEdad() {
        LocalDate now = LocalDate.now();
        return this.nacimiento.plus(18, ChronoUnit.YEARS).isBefore(now);
    }

    public boolean mayorQue(Alumno al) {
        return this.nacimiento.isBefore(al.nacimiento);
    }

    public boolean duplicadoDe(Alumno al) {
        //return this==al;
        
        return this.DNI.equals(al.DNI) && this.escuela.equals(al.escuela)
                && this.nacimiento.equals(al.nacimiento)
                && this.nombreCompleto.equals(al.nombreCompleto);

    }
}
