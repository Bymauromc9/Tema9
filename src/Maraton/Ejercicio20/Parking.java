package Maraton.Ejercicio20;

import java.util.ArrayList;

public class Parking {
    private static final int CAPACIDAD_MAX=100;
    private ArrayList<Vehiculo> vehiculos;

    public Parking(){
        this.vehiculos=new ArrayList<>();
    }
    public boolean entradaVehiculo(Vehiculo vehiculo){
        if(vehiculos.size()<100){
            vehiculos.add(vehiculo);
            return true;
        }    
        return false;
    }
    public boolean salidaVehiculo(String matricula){
        Vehiculo vehiculo=new Vehiculo(matricula);
        int indice= vehiculos.indexOf(vehiculo);
        if(indice!=-1){
            System.out.println("El vehiculo con matricula "+matricula+" debe pagar: "+vehiculo.calcularImporte());
            vehiculos.remove(indice);
            return true;
        }
        return false;
    }
    public void mostrarVehiculos(){
        if(vehiculos.isEmpty())
            System.out.println("Parking vacio");
        else{
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
            System.out.println("Plazas ocupadas: "+vehiculos.size());
        }
    }
}
