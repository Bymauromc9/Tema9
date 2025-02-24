package Ejercicio3;

public class CuentaAhorro extends CuentaBancaria {
    final double saldoMinimo = 2000;

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    public void calcularIntereses() {
        double interes;
        if (this.getSaldo() < saldoMinimo)
            interes = this.getSaldo() * ((interesAnualBasico / 2) / 100);
        else
            interes = this.getSaldo() * ((interesAnualBasico * 2) / 100);
        this.ingresarDinero(interes);
    }

    public void mostrar() {
        System.out.println("Cuenta Ahorro IBAN:" + this.getIban() + " Saldo: " + this.getSaldo());
    }
}