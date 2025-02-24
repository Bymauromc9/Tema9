package Ejercicio5;

public class Coche extends Terrestre {
    private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int nRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, nRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean aireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if (aireAcondicionado)
            System.out.println("El coche tiene aire acondicionado");
        else
            System.out.println("No tiene aire acondicionado");
    }

}
