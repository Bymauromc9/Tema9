package Maraton.Ejercicio8;

public class TrianColor_v8 extends Triangulo_v8{
    private String color;

    public TrianColor_v8(double alto, double ancho, String estilo, String color){
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
