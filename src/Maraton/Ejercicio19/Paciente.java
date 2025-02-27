package Maraton.Ejercicio19;

public abstract class Paciente {
    public String nombre;
    private int edad;

    public Paciente(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int facturar();

    public int getEdad() {
        return edad;
    }
}
