package Maraton.Ejercicio11;

public class Asalariado extends Trabajador {
    private double salarioFinal;
    private int horasExtra;

    public Asalariado(int id, String nombre, int dia, int mes, double salarioBase, double horasExtra) {
        super(id, nombre, dia, mes, mes, salarioBase);
        this.horasExtra = 0;
        this.salarioFinal = getSalarioBase();
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    double calcularSalarioFinal(double precioHoraExtra) {
        return getSalarioBase() + (getHorasExtra() * precioHoraExtra);
    }

}
