package Maraton.Ejercicio6;

public class TrianColor_v6 extends Triangulo_v6{
    private String color;

    public TrianColor_v6(double alto, double ancho, String estilo, String color){
        super(ancho, alto, estilo);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
