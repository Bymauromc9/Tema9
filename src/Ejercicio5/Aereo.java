package Ejercicio5;

public class Aereo extends Vehiculo {
    private final int nAsientos;

    public Aereo(String matricula, String modelo, int nAsientos) {
        super(matricula, modelo);
        if (matricula.matches("[a-zA-Z]{4}[0-9]{6}"))
            this.nAsientos = nAsientos;
        else {
            this.nAsientos = 0;
            System.err.println("ERROR. Matricula incorrecta");
        }

    }

    public int getnAsientos() {
        return nAsientos;
    }

    @Override
    public void imprimir() {
        System.out.print("Aereo -> Matricula: " + this.getMatricula() + " Modelo: " + this.getModelo()
                + " NºAsientos: " + this.getnAsientos() + " ");
    }
}
