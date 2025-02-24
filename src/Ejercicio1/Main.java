package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Astros> astros=new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        // Planetas
        Planetas tierra = new Planetas("Tierra", 5.97e24, 12742, 1, 365.25, 149600000);
        Planetas marte = new Planetas("Marte", 6.39e23, 6779, 1.03, 687, 227900000);
        // Satelites
        Satelites luna = new Satelites("Luna", 7.35e22, 3474, 27.3, 27.3, 384400, tierra);
        Satelites fobos = new Satelites("Fobos", 1.07e16, 22.4, 0.3, 0.3, 9377, marte);
        Satelites deimos = new Satelites("Deimos", 1.48e15, 12.4, 1.26, 1.26, 23460, marte);
        Satelites europa = new Satelites("Europa", 4.80e22, 3122, 3.55, 3.55, 670900, tierra);
        Satelites titan = new Satelites("Titán", 1.35e23, 5150, 15.9, 15.9, 1221870, marte);

        // Añadirt satelites a los planetas

        tierra.agregarSatelite(luna);
        tierra.agregarSatelite(europa);
        marte.agregarSatelite(titan);
        marte.agregarSatelite(fobos);
        marte.agregarSatelite(deimos);

        // Añadir a la lista 
         
        astros.add(tierra);
        astros.add(marte);
        astros.add(luna);
        astros.add(fobos);
        astros.add(deimos);
        astros.add(europa);
        astros.add(titan);

        while (true) {
            System.out.println("1. Ver informacion de un astro");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = entrada.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Lista de astros: ");
                    for (int i = 0; i < astros.size(); i++) {
                        System.out.println((i+1)+". "+astros.get(i).nombre);
                    }
                    System.out.print("Selecciona un astro: ");
                    int seleccion = entrada.nextInt();
                    seleccion--;
                    System.out.println();
                    if(seleccion>=0 && seleccion<astros.size())
                        astros.get(seleccion).muestra();
                    else
                        System.out.println("Opcion invalida");
                    break;
                case 2:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Introduce una opcion valida");
                    break;
            }
            if(opcion==2)
                break;
            System.out.println();
        }
        entrada.close();
        
    }
}
