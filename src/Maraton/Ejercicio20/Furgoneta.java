package Maraton.Ejercicio20;

public class Furgoneta extends Vehiculo{
    private double longitud;

    private static final double LONGITUD=0.2;

    public Furgoneta(String matricula, double longitud) {
        super(matricula);
        this.longitud = longitud;
    }
    @Override
    public double calcularImporte(){
        return super.calcularImporte()+(longitud*LONGITUD);
    }

    
    
}
