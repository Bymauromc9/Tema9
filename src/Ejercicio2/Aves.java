package Ejercicio2;

public abstract class Aves extends Mascotas{
    protected boolean vuela;
    protected boolean pico;
    
    public Aves(String nombre, int edad, String estado, String fechaNacimiento, boolean vuela, boolean pico){
        super(nombre, edad, estado, fechaNacimiento);
        this.vuela=vuela;
        this.pico=pico;
    }
    public abstract void volar();
}
