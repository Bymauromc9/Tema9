package Maraton.Ejercicio14;

public class Esfera_v1 extends Figura3D_v1 {

    private double radio;

    public Esfera_v1(double radio) {
        this.radio = radio;
    }

    @Override
    public double volumen() {
        double volumen = ((4 / 3) * Math.PI) * Math.pow(this.getRadio(), 3);
        return volumen;
    }

    public double getRadio() {
        return radio;
    }

}
