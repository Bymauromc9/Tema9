package Maraton.Ejercicio15;

public class Main_v2 {
    public static void main(String[] args) {
        Esfera_v2 e1 = new Esfera_v2(1);
        PrismaRectangular_v2 p1 = new PrismaRectangular_v2(1, 1, 1);

        if (e1.volumen() == p1.volumen())
            System.out.println("Tanto la esfera como el prisma ocupan el mismo espacio");
        else if (e1.volumen() > p1.volumen())
            System.out.println("La esfera numero 1 ocupa mas que el prisma rectangular");
        else
            System.out.println("El prisma numero 1 ocupa mas que la esfera");
    }
}
