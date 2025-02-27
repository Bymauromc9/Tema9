package GuerraGalactica;

public interface Guerrero {
    public int dispara(int maximo); /*// Implementar en clase Terricolas y cyborg, 
                                        mostrara mensaje diciendo quien es y a quien dispara. 
                                        Generara un numero aleatoriop entre 0 y maximo, con maximo no incluido */
    public void alcanzado(); // Terricolas y cyborg, y mostrara mensaje diciendo quien es, para saber que ha muerto
    public boolean estoyVivo();

}
