package Maraton.Ejercicio19;

import java.time.LocalDate;

public class Revision extends Paciente{
    private String fechaVisitaAnterior;
    private int tarifa;
    public Revision(String nombre, int edad, String fechaVisitaAnterior) {
        super(nombre, edad);
        this.fechaVisitaAnterior = fechaVisitaAnterior;
    }
    @Override
    public int facturar() {
        return (getEdad()>65)?30:50;
    }

    
}
