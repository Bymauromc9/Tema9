package Ejercicio3;

public abstract class CuentaBancaria {
    protected String iban;
    protected double saldo;

    protected static final double interesAnualBasico = 2.5;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public abstract void calcularIntereses();

    public abstract void mostrar();

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void añadir(double cantidad) {
        this.saldo += cantidad;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0)
            añadir(cantidad);
        else
            System.err.println("ERROR. Cantidad negativa");
    }

    public void retirarDinero(double cantidad) {
        if (cantidad < saldo)
            añadir(-cantidad);
        else
            System.err.println("ERROR. Saldo insuficiente");
    }

    public void traspasarDinero(CuentaBancaria cuenta, double cantidad) {
        if (cuenta == null || cantidad < 0)
            System.err.println("ERROR. cantidad invalida o cuenta NULL");
        cuenta.ingresarDinero(cantidad);
        this.retirarDinero(cantidad);
    }

}