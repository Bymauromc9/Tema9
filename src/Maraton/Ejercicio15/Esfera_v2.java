package Maraton.Ejercicio15;

public class Esfera_v2 extends Figura3D_v2 {

    private double radio;

    public Esfera_v2(double radio) {
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

    @Override
    public double superficie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'superficie'");
    }

}
