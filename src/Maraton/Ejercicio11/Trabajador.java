package Maraton.Ejercicio11;

import java.time.LocalDate;

public class Trabajador {
    private int id;
    private String nombre;
    private LocalDate fecha;
    private double salarioBase;

    public Trabajador(int id, String nombre, int dia, int mes, int anyo, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = LocalDate.of(anyo, mes, dia);
        this.salarioBase = salarioBase;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Trabajador [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", salarioBase=" + salarioBase
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trabajador other = (Trabajador) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

}
