package Ejercicio5;

public class Barco extends Acuatico {
    private boolean motor;

    public Barco(String matricula, String modelo, double eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    public boolean getMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if (motor)
            System.out.println("Barco -> ¿Tiene motor?: Si");
        else
            System.out.println("Barco -> ¿Tiene motor?: No");
    }

}
