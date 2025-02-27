package GuerraGalactica;

public class Nave {
    private Guerrero[] tripulacion=new Guerrero[10];
    private final String nombre;

    public Nave(String nombre){
        if(nombre.equalsIgnoreCase("Terricola")){
            this.nombre="Nave estelar";
            for (int i = 0; i < tripulacion.length; i++) {
                tripulacion[i]=new Terricola("Terricola "+(i+1));
            }
            System.out.println("Nave creada con exito");
        }else if(nombre.equalsIgnoreCase("Cyborg")){
            this.nombre="Cubo Borg";
            for (int i = 0; i < tripulacion.length; i++) {
                tripulacion[i]=new Cyborg();
            }
        }else{
            this.nombre="Nombre inválido";
            System.err.println("ERROR: Nombre de nave incorrecto.");
        }
    }

    public void recibeDisparo(int posicion){
        if(posicion>=0&& posicion<tripulacion.length&&tripulacion[posicion].estoyVivo())
            tripulacion[posicion].alcanzado();
    }
    public void generaDisparo(int maximo, int posicion){
        if(posicion>=0&& posicion<tripulacion.length&&tripulacion[posicion].estoyVivo())
            tripulacion[posicion].dispara(maximo);
    }
    public int cuantosQuedan(){
        int vivos=0;
        for (int i = 0; i < tripulacion.length; i++) {
            if((tripulacion[i].estoyVivo()))
                vivos++;
        }
        return vivos;
    }
}
