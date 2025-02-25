package Maraton.Ejercicio15;

public class PrismaRectangular_v2 extends Figura3D_v2 {

    private double ancho;
    private double largo;
    private double alto;

    public PrismaRectangular_v2(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double volumen() {
        double volumen = this.getAlto() * this.getAncho() * this.getLargo();
        return volumen;
    }

    @Override
    public double superficie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'superficie'");
    }
}
