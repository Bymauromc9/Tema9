package Maraton.Ejercicio3;

public class Figura2D_v3 {
    private double ancho;
    private double alto;
    public Figura2D_v3(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public void setAlto(double alto) {
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
