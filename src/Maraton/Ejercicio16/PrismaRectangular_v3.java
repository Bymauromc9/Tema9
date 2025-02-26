package Maraton.Ejercicio16;

public class PrismaRectangular_v3 implements Figura3D_v3 {

    private double ancho;
    private double largo;
    private double alto;

    public PrismaRectangular_v3(double ancho, double largo, double alto) {
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
        double superficie= 2*((getLargo()*getAncho())+(getAncho()*getAlto())+(getLargo()*getAlto()));
        return superficie;
    }
}
