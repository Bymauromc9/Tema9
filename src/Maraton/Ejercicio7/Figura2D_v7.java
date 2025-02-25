package Maraton.Ejercicio7;

public class Figura2D_v7 {
    private double ancho;
    private double alto;
    public Figura2D_v7(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public Figura2D_v7(double lado){
        this.alto=this.ancho=lado;
    }
    public Figura2D_v7(){
        this.ancho=0;
        this.alto=0;
    }
    public Figura2D_v7(Figura2D_v7 figura){
        this.ancho=figura.ancho;
        this.alto=figura.alto;
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
