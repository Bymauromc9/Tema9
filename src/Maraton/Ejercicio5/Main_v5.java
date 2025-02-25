package Maraton.Ejercicio5;

public class Main_v5 {
    public static void main(String[] args) {
        Triangulo_v5 triangulo= new Triangulo_v5(20, 5, "isósceles");
        Triangulo_v5 triangulo2= new Triangulo_v5(20);
        

        triangulo.verDim();
        triangulo.verEstilo();
        triangulo.area();

        triangulo2.verDim();
        triangulo2.verEstilo();
        triangulo2.area();
    }
    
}
