package Maraton.Ejercicio19;

public class Consulta extends Paciente{
    private String motivoConsulta;

    public Consulta(String nombre, int edad, String motivoConsulta){
        super(nombre, edad);
        this.motivoConsulta=motivoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMotivoConsulta() {
        return motivoConsulta;
    }


    @Override
    public int facturar() {
        return 100;
    }

    
}
