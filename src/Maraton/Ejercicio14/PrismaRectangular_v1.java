package Maraton.Ejercicio14;

public class PrismaRectangular_v1 extends Figura3D_v1 {

    private double ancho;
    private double largo;
    private double alto;

    public PrismaRectangular_v1(double ancho, double largo, double alto) {
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
}
