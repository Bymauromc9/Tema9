package Ejercicio4;

public class Empleado {
    protected final String nombre;
    protected final String dni;
    protected double sueldoBruto;
    protected int edad;
    protected String telefono;
    protected String direccion;

    // Constructor 1
    public Empleado(String nombre, String dni, double sueldoBruto) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = 0;
        this.telefono = "";
        this.direccion = "";
    }

    // Constructor 2
    public Empleado(String nombre, String dni, double sueldoBruto, int edad, String telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double calcularSueldoNeto() {
        double sueldoBrutoAnual = this.getSueldoBruto() * 12;
        double irpf = 0;
        if (sueldoBrutoAnual < 12000)
            irpf = 20;
        else if (sueldoBrutoAnual >= 12000 && sueldoBrutoAnual <= 25000)
            irpf = 30;
        else
            irpf = 40;
        return this.sueldoBruto * (1 - irpf / 100);
    }

    // Metodo para mostrar
    public void muestra() {
        System.out.println(
                "Empleado: " + this.getNombre() + " DNI: " + this.getDni() + " Sueldo Bruto: " + this.getSueldoBruto()
                        + " Edad: "
                        + this.getEdad()
                        + " Telefono" + this.getTelefono() + " Dirección: " + this.getDireccion());
    }

}
