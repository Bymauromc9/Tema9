package Ejercicio5;

public class Submarino extends Acuatico {
    private double profundidadMaxima;

    public Submarino(String matricula, String modelo, double eslora, double profundidadMaxima) {
        super(matricula, modelo, eslora);
        this.profundidadMaxima = profundidadMaxima;
    }

    public double getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(double profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Submarino -> Profundidad maxima: " + this.getProfundidadMaxima());
    }

}
