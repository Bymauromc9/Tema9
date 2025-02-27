package GuerraGalactica;

public abstract class SerVivo {
    protected boolean vivo;
    protected final int identificador;

    public SerVivo(int identificador){
        this.identificador=identificador;
        this.vivo=true;
    }

    public boolean estoyVivo() {
        return vivo;
    }
    public int getIdentificador() {
        return identificador;
    }
  

    
}
