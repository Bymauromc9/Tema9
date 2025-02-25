package Maraton.Ejercicio7;

public class TrianColor_v7 extends Triangulo_v7{
    private String color;

    public TrianColor_v7(double alto, double ancho, String estilo, String color){
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
