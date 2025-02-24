package Ejercicio1;

public class Satelites extends Astros {
    private Planetas planeta;

    public Satelites(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, Planetas planeta){
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.planeta=planeta;
    }

    @Override
    public void muestra(){
        System.out.println("Satelite: "+nombre);
        System.out.println("Masa: "+masa+" kg");
        System.out.println("Diametro: "+diametro);
        System.out.println("Periodo de rotación: "+periodoRotacion+" dias");
        System.out.println("Periodo de Traslación: "+periodoTraslacion+" días");
        System.out.println("Distancia media a "+planeta.getNombre()+": "+distanciaMedia);
    }
    public String getNombre(){
        return nombre;
    }


    
}
