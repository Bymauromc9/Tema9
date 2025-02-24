package Ejercicio2;

public class Perro extends Mascotas {
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas){
        super(nombre, edad, estado, fechaNacimiento);
        this.raza=raza;
        this.pulgas=pulgas;
    }

    public void muestra(){
        System.out.println("Perro: "+nombre+", Raza: "+raza+", Pulgas: "+pulgas+" ");
    }
    public void habla(){
        System.out.println(nombre+" dice: Guau guau!!");
    }

}
