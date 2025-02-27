package Maraton.Ejercicio18;

import java.util.Scanner;

public class Consola {
    private static Scanner entrada = new Scanner(System.in);

    /**
     * Metodo para leer un numero entero sin param
     * @return
     */
    public static int leerEntero(){
        return entrada.nextInt();
    }
    /**
     * Metodo para leer entero con 1 param
     * @param introducir
     * @return
     */
    public static int leerEntero(String introducir){
        System.out.print(introducir+":");
        return entrada.nextInt();
    }
    
    
    public static int leerEntero(String texto, int min, int max){
        int numero;
            do {
                System.out.print(texto+" Entre: ("+min+" - "+max+")");
                numero = entrada.nextInt();
                if(numero<=min||numero>=max)
                System.out.println("Vuelve a introducir el valor, hasta que sea mayor que "+min+" y menor que "+max);
            } while (numero<=min || numero>=max);

            return numero;
    }

    public static int leerEntero(int min, int max){
        int numero;
        do {
            numero=entrada.nextInt();
            if(numero<=min || numero>=max)
                System.out.println("Vuelve a introducir el valor, hasta que sea mayor que "+min+" y menor que "+max);
        } while (numero<=min || numero>=max);
        return numero;
    }

}