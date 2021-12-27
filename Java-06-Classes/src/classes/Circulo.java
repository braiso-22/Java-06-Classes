package classes;

/**
 *
 * @author brais.fernandezvazqu
 */
public class Circulo {

    private int radio;
    private double circunferencia;
    private double superficie;
    private int diametro;

    public Circulo() {

    }
    public Circulo(int r) {
        radio=r;
    }
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularCircunferencia() {
        calcularDiametro();
        circunferencia=Math.PI*diametro;
        return circunferencia;
    }

    public double calcularSuperficie() {
        superficie=Math.PI*Math.pow(radio, 2);
        return superficie;
    }

    public int calcularDiametro() {
        diametro=radio*2;
        return diametro;
    }
    public void mostrarTodo(){
        System.out.println("Radio: "+getRadio());
        System.out.println("Diametro: "+calcularDiametro());
        System.out.println("Circunferencia: "+calcularCircunferencia());
        System.out.println("Superficie: "+calcularSuperficie()+"\n");
    }
}
