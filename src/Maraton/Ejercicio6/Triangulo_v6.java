package Maraton.Ejercicio6;

public class Triangulo_v6 extends Figura2D_v6{
    private String estilo;

    public Triangulo_v6(double ancho, double alto, String estilo) {
        super(ancho, alto);
        if(estilo.equalsIgnoreCase("Isósceles")||estilo.equalsIgnoreCase("Rectángulo")||estilo.equalsIgnoreCase("Equilátero"))
            this.estilo = estilo;
        else
            System.err.println("Estilo no definidio bien");
    }
    public Triangulo_v6(){
        super();
        this.estilo=null;
    }
    public Triangulo_v6(double lado){
        super(lado);
        this.estilo="igualBaseAltura";
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
