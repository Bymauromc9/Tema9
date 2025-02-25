package ajedrez;

public class Torre extends Pieza {

    public Torre(ColorPieza color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void mover(int x, int y) {
        if ((x == this.posicion.x || y == this.posicion.y) && comprobarPosicion(x) && comprobarPosicion(y)) {
            this.posicion.x = x;
            this.posicion.y = y;
        }
    }

}
