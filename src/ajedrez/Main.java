package ajedrez;

public class Main {
    public static void main(String[] args) {
        Torre torre = new Torre(ColorPieza.BLANCO, 4, 4);
        Peon peon = new Peon(ColorPieza.NEGRO, 2, 4);

        System.out.println("Posición inicial de la torre: " + torre.getPosicion());
        torre.mover(4, 5);
        System.out.println("Posición después de mover: " + torre.getPosicion());

        System.out.println("Posición inicial del peón: " + peon.getPosicion());
        peon.mover(1, 1);
        System.out.println("Posición después de mover: " + peon.getPosicion());
    }
}
