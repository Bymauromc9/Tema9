package Ejercicio2;

public abstract class Mascotas {
    protected String nombre;
    protected int edad;
    public String estado;
    protected String fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento){
        this.nombre=nombre;
        this.edad=edad;
        this.estado=estado;
        this.fechaNacimiento=fechaNacimiento;
    }

    public abstract void muestra();
    public abstract void habla();

    public void cumpleanos(){
        this.edad++;
        System.out.println(nombre+" ha cumplido un año mas! Ahora tiene "+edad+" años");
    }
    public void morir(){
        this.estado="Fallecido";
        System.out.println(nombre+" ha fallecido");
    }
    public String getNombre(){
        return nombre;
    }
}
