package Ejercicio3;

public class Banco {
    public static void main(String[] args) {
        // Creamos las cuentas
        CuentaAhorro cuenta1 = new CuentaAhorro("123456789", 50);
        CuentaCorriente cuenta2 = new CuentaCorriente("5346435674568", 3000);
        // Mostramos la informacion de las cuentas
        cuenta1.mostrar();
        cuenta2.mostrar();
        System.out.println();
        // Ingreso y retirada de dinero
        cuenta1.ingresarDinero(3500);
        cuenta2.retirarDinero(2999);
        cuenta1.mostrar();
        cuenta2.mostrar();
        System.out.println();
        // Probamos a traspasar dinero de una cuenta a otra
        cuenta1.traspasarDinero(cuenta2, 500);
        cuenta1.mostrar();
        cuenta2.mostrar();
        System.out.println();
        // Calculamos intereses de las 2 cuentas
        cuenta1.calcularIntereses();
        cuenta2.calcularIntereses();
        cuenta1.mostrar();
        cuenta2.mostrar();
        System.out.println();
    }
}
