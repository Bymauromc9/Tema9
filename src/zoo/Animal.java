package zoo;

public abstract class Animal {
    private String nombre;
    private int estancia;

    public Animal(String nombre, int estancia) {
        this.nombre = nombre;
        this.estancia = estancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstancia() {
        return estancia;
    }

    public void setEstancia(int estancia) {
        this.estancia = estancia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;
        return this.nombre.equals(((Animal) obj).nombre);
    }

    public abstract void ejercicio();

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", estancia=" + estancia + "]";
    }

}
