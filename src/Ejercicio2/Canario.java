package Ejercicio2;

public class Canario extends Aves{
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, boolean vuela, boolean pico, String color, boolean canta){
        super(nombre, edad, estado, fechaNacimiento, vuela, pico);
        this.color=color;
        this.canta=canta;
    }

    public void muestra(){
        System.out.println("Canario: "+nombre+", Color: "+color+", Canta: "+canta);
    }
    public void habla(){
        if(canta)
            System.out.println(nombre+ " está hablando");
        else
            System.out.println(nombre+" no habla");
    }
    public void volar(){
        if(vuela)
            System.out.println(nombre+" está volando!");
        else
            System.out.println(nombre+" no puede volar.");
    }
}
