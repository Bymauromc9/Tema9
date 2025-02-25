package Maraton.Ejercicio4;

public class Triangulo_v3 extends Figura2D_v4{
    private String estilo;

    public Triangulo_v3(double ancho, double alto, String estilo) {
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
       System.out.println("Area: "+(this.getAncho()*this.getAncho())/2);
    }
    public void verEstilo(){
        System.out.println("Estilo: "+this.getEstilo());
    }

    
}
