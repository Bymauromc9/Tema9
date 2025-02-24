package Ejercicio5;

public class Terrestre extends Vehiculo {
    private final int nRuedas;

    public Terrestre(String matricula, String modelo, int nRuedas) {
        super(matricula, modelo);
        if (matricula.matches("[0-9]{4}[a-zA-Z]{3}"))
            this.nRuedas = nRuedas;
        else {
            this.nRuedas = 0;
            System.err.println("ERROR. Matricula invalida");
        }
    }

    public int getnRuedas() {
        return nRuedas;
    }

    @Override
    public void imprimir() {
        System.out.print("Terrestre -> Matricula: " + this.getMatricula() + " Modelo: " + this.getModelo()
                + " NºRuedas: " + this.getnRuedas() + " ");
    }
}
