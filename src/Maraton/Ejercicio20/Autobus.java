package Maraton.Ejercicio20;

public class Autobus extends Vehiculo{
    private int numAsientos;
    private static final double ASIENTO=0.25;

    public Autobus(String matricula, int numAsientos) {
        super(matricula);
        this.numAsientos = numAsientos;
    }
    public double calcularImporte(){
        return super.calcularImporte()+(numAsientos*ASIENTO);
    }
    
}
