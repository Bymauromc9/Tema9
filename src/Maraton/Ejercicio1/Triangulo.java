package Maraton.Ejercicio1;

public class Triangulo extends Figura2D{
    private String estilo;

    public Triangulo(double ancho, double alto, String estilo) {
        super(ancho, alto);
        if(estilo.equalsIgnoreCase("Isósceles")||estilo.equalsIgnoreCase("Rectángulo")||estilo.equalsIgnoreCase("Equilátero"))
            this.estilo = estilo;
        else
            System.err.println("Estilo no definidio bien");
    }
    
    public String getEstilo() {
        return estilo;
    }

    public void area(){
       System.out.println("Area: "+(ancho*alto)/2);
    }
    public void verEstilo(){
        System.out.println("Estilo: "+estilo);
    }

    
}
