package GuerraGalactica;

import java.util.concurrent.ThreadLocalRandom;

public final class Cyborg extends SerVivo implements Guerrero{
    protected static int contador=0;
        public Cyborg(){
            super(++contador);
        }
    
    @Override
    public int dispara(int maximo){
        int disparo=ThreadLocalRandom.current().nextInt(maximo);
        System.out.println("Cyborg "+identificador+" dispara a una potencia de"+disparo);
        return disparo;
    }
    @Override
    public void alcanzado(){
        vivo=false;
        System.out.println("Cyborg"+identificador+" ha sido alcanzado y ha muerto");
    }
}
