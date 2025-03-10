package Maraton.Ejercicio15;

public class Esfera_v2 extends Figura3D_v2 {

    private double radio;

    public Esfera_v2(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double superficie() {
        double superficie= 4*Math.PI*Math.pow(radio, 2);
        return superficie;
    }
    @Override
    public double volumen() {
        double volumen = ((4 / 3) * Math.PI) * Math.pow(this.getRadio(), 3);
        return volumen;
    }

}
