package Maraton.Ejercicio1;

public class Figura2D {
    public double ancho;
    public double alto;
    public Figura2D(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getAlto() {
        return alto;
    }

    public void verDim(){
        System.out.println("Dimensiones -- Ancho: "+this.getAncho()+" Alto: "+this.getAlto());
    }
    
    
}
