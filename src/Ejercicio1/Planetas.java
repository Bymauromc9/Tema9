package Ejercicio1;

import java.util.ArrayList;

public class Planetas extends Astros {
    public ArrayList<Satelites> satelites;
    
    public Planetas(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia){
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.satelites=new ArrayList<>();
    }

    public void agregarSatelite(Satelites satelite){
        satelites.add(satelite);
    }

    public ArrayList<Satelites> getSatelites(){
        return satelites;
    }

    @Override
    public void muestra(){
        System.out.println("Planeta: "+nombre);
        System.out.println("Masa: "+masa+" kg");
        System.out.println("Diametro: "+diametro+" km");
        System.out.println("Periodo de rotación: "+periodoRotacion+" días");
        System.out.println("Periodo de traslación: "+periodoTraslacion+" días");
        System.out.println("Distancia media al sol "+distanciaMedia+" km");
        if(!satelites.isEmpty()){
            System.out.println("Satelittes");
            for (Satelites s : satelites) {
                System.out.println("- "+s.getNombre());
            }
        }else
            System.out.println("No tiene satelites");
    }
    
    public String getNombre(){
        return nombre;
    }

}
