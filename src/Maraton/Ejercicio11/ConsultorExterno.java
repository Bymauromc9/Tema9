package Maraton.Ejercicio11;

public class ConsultorExterno extends Trabajador {
    private int horasTrabajadas;
    private double salarioFinal;

    public ConsultorExterno(int id, String nombre, int dia, int mes, int anyo, int horasTrabajadas,double salarioFinal) {
        super(horasTrabajadas, nombre, dia, anyo, mes, salarioFinal);
        this.horasTrabajadas = 0;  
    }
}
