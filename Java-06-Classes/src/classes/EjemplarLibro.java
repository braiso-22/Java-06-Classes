package classes;

import java.time.LocalDate;

/**
 *
 * @author brais.fernandezvazqu
 */
public class EjemplarLibro {

    String titulo = new String();
    LocalDate fecha;
    int ejemplar;
    boolean prestado;

    public EjemplarLibro(String titulo) {
        fecha = LocalDate.now();
        this.titulo = titulo;
        ejemplar = 1;
        prestado = false;
    }

    public EjemplarLibro(EjemplarLibro l) {
        this.titulo = l.titulo;
        this.fecha = l.fecha;
        this.ejemplar = l.ejemplar + 1;
        this.prestado = l.prestado;
    }

    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }
    public boolean devolver(){
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "EjemplarLibro{" + "titulo=" + titulo + ", fecha=" +'(' + fecha + ')' +", ejemplar=" + ejemplar + '}';
    }
    
}
