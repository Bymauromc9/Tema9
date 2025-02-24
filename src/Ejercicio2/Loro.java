package Ejercicio2;

public class Loro extends Aves{
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, boolean vuela, boolean pico, String origen, boolean habla){
        super(nombre, edad, estado, fechaNacimiento, vuela, pico);
        this.origen=origen;
        this.habla=habla;
    }

    public void muestra(){
        System.out.println("Loro: "+nombre+", Origen: "+origen+", Habla: "+habla+" ");
    }
    public void habla(){
        if(habla)
            System.out.println(nombre+ " saluda");
        else
            System.out.println(nombre+" no saluda");
    }
    public void volar(){
        if(vuela)
            System.out.println(nombre+" está volando!");
        else
            System.out.println(nombre+" no puede volar.");
    }
}
