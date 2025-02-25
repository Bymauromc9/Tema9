package ajedrez;

public class Torre extends Pieza {

    public Torre(ColorPieza color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public void mover(int x, int y) {
        if (!comida && comprobarPosicion(x) && comprobarPosicion(y) && (posicion.x == x || posicion.y == y)) {
            posicion.move(x, y);
        }
    }

}
