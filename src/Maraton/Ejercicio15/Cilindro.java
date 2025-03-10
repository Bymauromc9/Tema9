package Maraton.Ejercicio15;

public class Cilindro extends Figura3D_v2 {

    private double radio;
    private double base;
    private double altura;

    public Cilindro(double radio, double base, double altura){
        this.radio=radio;
        this.base=base;
        this.altura=altura;
    }
    
    public double getRadio() {
        return radio;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double volumen() {
       double volumen = Math.PI*Math.pow(getRadio(), 2)*getAltura();
       return volumen;
    }

    @Override
    public double superficie() {
        double superficie = (2*Math.PI*getAltura())+2*Math.PI*Math.pow(getRadio(), 2);
        return superficie;
    }

}
