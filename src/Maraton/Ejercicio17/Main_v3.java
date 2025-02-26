package Maraton.Ejercicio17;

public class Main_v3 {
    public static void main(String[] args) {
        Esfera_v3 e1 = new Esfera_v3(60);
        PrismaRectangular_v3 p1 = new PrismaRectangular_v3(150, 128, 125);
        Cilindro_v4 c1= new Cilindro_v4(5, 20, 35);

        if(e1.superficie()>p1.superficie()&&e1.superficie()>c1.superficie())
            System.out.println("Ocupa mas espacio la esfera 1");
        else if(p1.superficie()>e1.superficie()&& p1.superficie()>c1.superficie())
            System.out.println("Ocupa mas espacio el prisma 1");
        else if(c1.superficie()>p1.superficie()&&c1.superficie()>e1.superficie())
            System.out.println("Ocupa mas espacio el cilindro");
    }
}
