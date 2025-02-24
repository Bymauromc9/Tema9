package Ejercicio2;

public class Gato extends Mascotas{
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo){
        super(nombre, edad, estado, fechaNacimiento);
        this.color=color;
        this.peloLargo=peloLargo;
    }

    public void muestra(){
        System.out.println("Gato: "+nombre+", Color: "+color+", Pelo largo: "+peloLargo+" ");
    }

    public void habla(){
        System.out.println(nombre+" dice: Miau miau!!");
    }
}
