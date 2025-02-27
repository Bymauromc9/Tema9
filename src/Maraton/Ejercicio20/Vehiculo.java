package Maraton.Ejercicio20;

import java.util.Date;
import java.util.Objects;
import java.util.zip.DataFormatException;

public class Vehiculo {
    private String matricula;
    public long horaEntrada;

    public Vehiculo(String matricula){
        this.matricula=matricula;
        this.horaEntrada=System.currentTimeMillis();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public long getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public double calcularImporte(){
        long tiempoEstacionado=(System.currentTimeMillis()-horaEntrada)/1000;
        return tiempoEstacionado;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        return Objects.equals(matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", horaEntrada=" + new Date(horaEntrada) + "]";
    }
    

    
 
}
