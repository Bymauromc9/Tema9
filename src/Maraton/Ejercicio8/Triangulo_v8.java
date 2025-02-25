package Maraton.Ejercicio8;

public class Triangulo_v8 extends Figura2D_v8{
    private String estilo;

    public Triangulo_v8(double ancho, double alto, String estilo) {
        super(ancho, alto);
        if(estilo.equalsIgnoreCase("Isósceles")||estilo.equalsIgnoreCase("Rectángulo")||estilo.equalsIgnoreCase("Equilátero"))
            this.estilo = estilo;
        else
            System.err.println("Estilo no definidio bien");
    }
    public Triangulo_v8(){
        super();
        this.estilo=null;
    }
    public Triangulo_v8(Triangulo_v8 triangulo){
        super(triangulo);
        this.estilo=triangulo.estilo;
    }
    public Triangulo_v8(double lado){
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
