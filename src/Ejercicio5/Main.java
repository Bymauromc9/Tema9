package Ejercicio5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        Coche c1 = new Coche("5674GTR", "Sedan", 4, true);
        Moto m1 = new Moto("3487ALB", "Cross", 2, "Azul");
        Barco b1 = new Barco("jhfhh23", "Moto de agua", 5.4, true);
        Submarino s1 = new Submarino("abcdefghij", "Sumergible", 25.4, 300);
        Avion a1 = new Avion("kkKK654852", "Aeroplaneador", 47, 2500);
        Helicoptero h1 = new Helicoptero("BeAB987123", "Helicop99", 8, 4);

        listaVehiculos.add(c1);
        listaVehiculos.add(m1);
        listaVehiculos.add(b1);
        listaVehiculos.add(s1);
        listaVehiculos.add(a1);
        listaVehiculos.add(h1);

        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo veh = listaVehiculos.get(i);
            veh.imprimir();
        }

    }

}
