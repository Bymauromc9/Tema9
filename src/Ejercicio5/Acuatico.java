package Ejercicio5;

public class Acuatico extends Vehiculo {
    private double eslora;

    public Acuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        if (matricula.matches("[a-zA-Z0-9]{3,10}"))
            this.eslora = eslora;
        else {
            this.eslora = 0;
            System.err.println("ERROR. Matricula invalida");
        }
    }

    public double getEslora() {
        return eslora;
    }

    @Override
    public void imprimir() {
        System.out.print("Acuatico -> Matricula: " + this.getMatricula() + " Modelo: " + this.getModelo()
                + " Eslora: " + this.getEslora() + " ");
    }
}
