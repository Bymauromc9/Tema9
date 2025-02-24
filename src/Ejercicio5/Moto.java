package Ejercicio5;

public class Moto extends Terrestre {
    private String color;

    public Moto(String matricula, String modelo, int nRuedas, String color) {
        super(matricula, modelo, nRuedas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Moto -> Color: " + this.getColor());
    }

}
