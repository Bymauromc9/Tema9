package ajedrez;

public class Peon extends Torre {
  public Peon(ColorPieza color, int x, int y) {
    super(color, x, y);
  }

  @Override
  public void mover(int x, int y) {
    boolean movimientoMal = false;
    if (Pieza.comprobarPosicion(x) && Pieza.comprobarPosicion(y)) {
      if (color == ColorPieza.BLANCO) {
        // Si es la primera fila puede moverse 1 o 2 en la misma columna x
        if (this.posicion.x == x && this.posicion.y == 1 && y == 3)
          posicion.move(x, y);
        else if (this.posicion.x == x && this.posicion.y == (y - 1))
          posicion.move(x, y);
        else if ((this.posicion.x == x - 1 || this.posicion.x == x + 1) && this.posicion.y == y - 1)
          posicion.move(x, y);
        else
          movimientoMal = true;
      } else {
        if (color == ColorPieza.BLANCO) {
          // Si es la primera fila puede moverse 1 o 2 en la misma columna x
          if (this.posicion.x == x && this.posicion.y == 6 && y == 4)
            posicion.move(x, y);
          else if (this.posicion.x == x && this.posicion.y == (y + 1))
            posicion.move(x, y);
          else if ((this.posicion.x == x + 1 || this.posicion.x == x - 1) && this.posicion.y == y - 1)
            posicion.move(x, y);
          else
            movimientoMal = true;
        }
      }
    } else
      movimientoMal = true;
    if (movimientoMal)
      System.err.println("Movimiento peon incorrecto");
  }
}
