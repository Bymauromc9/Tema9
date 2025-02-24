package zoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> listaAnimales;

    public Zoo() {
        listaAnimales = new ArrayList<>();
    }

    public boolean añadirAnimal(Animal a) {
        if (listaAnimales.contains(a))
            return false;
        else
            listaAnimales.add(a);
        return true;
    }

    public boolean eliminarAnimal(String nombre) {
        int indiceAnimal = buscarAnimal(nombre);
        if (indiceAnimal != -1) {
            listaAnimales.remove(indiceAnimal);
            return true;
        }

        return false;
    }

    int buscarAnimal(String nombre) {
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (listaAnimales.get(i).getNombre().equals(nombre))
                return i;
        }
        return -1;
    }

    public void listaAnimales() {
        System.out.println("Animales en el Zoo");

        for (Animal animal : listaAnimales) {
            System.out.println(animal);
        }
    }

}
