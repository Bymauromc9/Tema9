package Maraton.Ejercicio17;

public class Cilindro_v4 implements Figura3D_v3 {

    private double radio;
    private double base;
    private double altura;

    public Cilindro_v4(double radio, double base, double altura){
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
