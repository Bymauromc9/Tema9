package Ejercicio3;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    public void calcularIntereses() {
        double interes = this.getSaldo() * (interesAnualBasico / 100);
        this.ingresarDinero(interes);
    }

    public void mostrar() {
        System.out.println("Cuenta corriente IBAN: " + this.getIban() + " Saldo: " + this.getSaldo());
    }

}
