package Maraton.Ejercicio6;

public class Main_v6 {
    public static void main(String[] args) {
        Triangulo_v6 triangulo= new Triangulo_v6(20, 5, "isósceles");
        Triangulo_v6 triangulo2= new Triangulo_v6(20);
        Triangulo_v6 triangulo3= new TrianColor_v6(20, 5, "isósceles","rojo");
        

        triangulo.verDim();
        triangulo.verEstilo();
        triangulo.area();

        triangulo2.verDim();
        triangulo2.verEstilo();
        triangulo2.area();

        triangulo3.verDim();
        triangulo3.verEstilo();
        triangulo3.area();
    }
    
}
