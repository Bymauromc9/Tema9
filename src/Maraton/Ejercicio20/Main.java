package Maraton.Ejercicio20;

import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Parking parking = new Parking();
        int opcion=0;

        do {
            System.out.println("MENU PARKING");
            System.out.println("1. Entrada de un vehiculo");
            System.out.println("2. Salida del vehiculo");
            System.out.println("3. Mostrar lista de vehiculos en el parking");
            System.out.println("4. Salir");
            opcion= entrada.nextInt();
            Vehiculo vehiculo= null;
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Matricula: ");
                    String matricula=entrada.nextLine();
                    System.out.println("Tipo de veh: 1. General 2. Furgoneta 3. Autobus");
                    int tipo = entrada.nextInt();
                    if(tipo==1){
                        vehiculo = new Vehiculo(matricula);
                    }else if (tipo==2) {
                        System.out.println("Ingrese longitud de la furgoneta en metros");
                        double longitud=entrada.nextDouble();
                        vehiculo=new Furgoneta(matricula, longitud);
                    }else if(tipo==3){
                        System.out.println("Ingrese el numero de asientos del autobus");
                        int numAsientos = entrada.nextInt();
                        vehiculo= new Autobus(matricula, numAsientos);
                    }else
                        System.out.println("Tipo invalido, volviendo al menu...");

                    if(vehiculo!=null && parking.entradaVehiculo(vehiculo))
                        System.out.println("Vehiculo registrado con exito");
                    else
                        System.out.println("Parking completo");
                    break;
                case 2:
                    System.out.println("Introduce la matricula");
                    String matriculaSalida=entrada.nextLine();
                    if(parking.salidaVehiculo(matriculaSalida))
                        parking.salidaVehiculo(matriculaSalida);
                    else
                        System.out.println("Vehiculo no encontrado");
                    break;
                case 3:
                    parking.mostrarVehiculos();
                    break;
                case 4:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion!=4);
    }
}
