package Ejercicio1;

public abstract class Astros {
    protected String nombre;
    protected double masa;
    protected double diametro;
    protected double periodoRotacion;
    protected double periodoTraslacion;
    protected double distanciaMedia;

    public Astros(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia ){
        this.nombre=nombre;
        this.masa=masa;
        this.diametro=diametro;
        this.periodoRotacion=periodoRotacion;
        this.periodoTraslacion=periodoTraslacion;
        this.distanciaMedia=distanciaMedia;
    }

    public abstract void muestra();
}
