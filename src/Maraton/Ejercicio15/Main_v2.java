package Maraton.Ejercicio15;

public class Main_v2 {
    public static void main(String[] args) {
        Esfera_v2 e1 = new Esfera_v2(60);
        PrismaRectangular_v2 p1 = new PrismaRectangular_v2(150, 128, 125);
        Cilindro c1= new Cilindro(5, 20, 35);

        if(e1.superficie()>p1.superficie()&&e1.superficie()>c1.superficie())
            System.out.println("Ocupa mas espacio la esfera 1");
        else if(p1.superficie()>e1.superficie()&& p1.superficie()>c1.superficie())
            System.out.println("Ocupa mas espacio el prisma 1");
        else if(c1.superficie()>p1.superficie()&&c1.superficie()>e1.superficie())
            System.out.println("Ocupa mas espacio el cilindro");
    }
}
