package ajedrez;

public class Ajedrez implements JuegoTablero{
    @Override
    public char indiceAPosicion(int indice){ //Pasara un indice numerico a su letra correspondiente del tablero
        return (char) ('A'+indice);
    }
    @Override
    public int indiceAPosicionN(int indice){ // Pasara indice numerico a su posición numérica del tablero
        return indice+1;
    }
    @Override
    public int posicionAIndice(char posicion){ // Pasara un aletra que indica la posicion en el tablero a su correspondiente índice
        return posicion-'A';
    }
    
    @Override
    public int posicionAIndice(int posicion){ // Pasara una posicion numerica en el tablero a su correspondiente indice
        return posicion-1;
    }

    
}
