package Maraton.Ejercicio19;


public class Recetas extends Paciente{
    private String listaMedicamentos;
    private int tarifa;
    public Recetas(String nombre, int edad, String listaMedicamentos) {
        super(nombre, edad);
        this.listaMedicamentos = listaMedicamentos;
    }
    @Override
    public int facturar() {

        return 5;
    }    
}
