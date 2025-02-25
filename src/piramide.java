import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número de filas de la pirámide
        System.out.print("Introduce el número de filas para la pirámide: ");
        int num = scanner.nextInt();
        
        // Construcción de la pirámide
        for (int i = 1; i <= num; i++) {
            // Espacios en blanco
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Nueva línea
            System.out.println();
        }
        
        scanner.close();
    }
}

