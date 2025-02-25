package Maraton.Ejercicio8;

public class Main_v8 {
    public static void main(String[] args) {
        Triangulo_v8 triangulo= new Triangulo_v8(20, 5, "isósceles");
        Triangulo_v8 triangulo2= new Triangulo_v8(20);
        Triangulo_v8 triangulo3= new TrianColor_v8(20, 5, "isósceles","rojo");
        Triangulo_v8 triangulo4= new Triangulo_v8(triangulo3);
        

        triangulo.verDim();
        triangulo.verEstilo();
        triangulo.area();

        triangulo2.verDim();
        triangulo2.verEstilo();
        triangulo2.area();

        triangulo3.verDim();
        triangulo3.verEstilo();
        triangulo3.area();

        triangulo4.verDim();
        triangulo4.verEstilo();
        triangulo4.area();

        
    }
    
}
