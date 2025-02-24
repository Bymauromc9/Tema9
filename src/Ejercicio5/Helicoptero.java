package Ejercicio5;

public class Helicoptero extends Aereo {
    private int numeroHelices;

    public Helicoptero(String matricula, String modelo, int nAsientos, int numeroHelices) {
        super(matricula, modelo, nAsientos);
        this.numeroHelices = numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Avion -> Numero de helices: " + this.getNumeroHelices());
    }

}
