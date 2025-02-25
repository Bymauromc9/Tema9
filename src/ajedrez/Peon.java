package ajedrez;

public class Peon extends Torre {
  public Peon(ColorPieza color, int x, int y) {
    super(color, x, y);
  }

  @Override
  public void mover(int x, int y) {
    int avance;
    if (this.color == ColorPieza.NEGRO || this.color == ColorPieza.BLANCO)
      avance = 1;
    else
      avance = -1;
    if ((x == this.posicion.x && y == this.posicion.y + avance) && comprobarPosicion(x) && comprobarPosicion(y)) {
      this.posicion.x = x;
      this.posicion.y = y;
    }
  }
}
