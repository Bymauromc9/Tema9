package ajedrez;

import java.awt.Point;

public abstract class Pieza {

    // Definicion Atributos
    protected ColorPieza color;
    protected Point posicion;
    protected boolean comida;

    // Getters y Setters

    public ColorPieza getColor() {
        return color;
    }
    public void setColor(ColorPieza color) {
        this.color = color;
    }
    public Point getPosicion() {
        return posicion;
    }
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    public boolean isComida() {
        return comida;
    }
    public void setComida(boolean comida) {
        this.comida = comida;
    }

    // Metodo equals (Equals si la pieza es igual a la otra si es el mismo tipo de pieza, del mismo color y se encuentra en la misma posicion)
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pieza other = (Pieza) obj;
        if (color != other.color)
            return false;
        if (posicion == null) {
            if (other.posicion != null)
                return false;
        } else if (!posicion.equals(other.posicion))
            return false;
        return true;
    }

    /** Metodo comprobar posicion
     * 	
     * @param p
     * @return
     */
    protected static boolean comprobarPosicion(int p){
        if(p>=0 && p<=7)
            return true;
        return false;
    }

    /**
     *  Constructor principal
     * @param color
     * @param x
     * @param y
     */
    public Pieza(ColorPieza color,int x, int y){
        this.color=color;
        this.posicion=new Point(x,y);
        if(comprobarPosicion(x)&&comprobarPosicion(y)){
            this.comida=false;
        }else
            this.comida=true;
    }
    // Segundo constructor
    public Pieza(){
        this(ColorPieza.BLANCO, 10, 10);
    }
    /**
     * Constructor copia
     * @param p
     */
    public Pieza(Pieza p){
        this(p.getColor(),p.posicion.x, p.posicion.y);
        this.comida=p.comida;
    }

    // Metodo abstracto para mover
    public abstract void mover(int x, int y); 
}