package GuerraGalactica;

import java.util.concurrent.ThreadLocalRandom;

public class Terricola extends SerVivo implements Guerrero{
    private final String nombre;
    protected static int contador=0 ;

    public Terricola(String nombre){
        super(++contador);
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public int dispara(int maximo){
        int disparo=ThreadLocalRandom.current().nextInt(maximo);
        System.out.println("Soy "+nombre+" y estoy disparando a una potencia de"+disparo);
        return disparo;
    }
    @Override
    public void alcanzado(){
        vivo=false;
        System.out.println(nombre+" ha sido alcanzado y ha muerto");
    }
    
}
