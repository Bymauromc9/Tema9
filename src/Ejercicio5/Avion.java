package Ejercicio5;

public class Avion extends Aereo {
    private double tiempoMaximoVuelo;

    public Avion(String matricula, String modelo, int nAsientos, double tiempoMaximoVuelo) {
        super(matricula, modelo, nAsientos);
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    public double getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }

    public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Avion -> Tiempo maximo de vuelo: " + this.getTiempoMaximoVuelo());
    }

}
