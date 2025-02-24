package Ejercicio2;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Mascotas> animales;

    public Inventario(){
        animales=new ArrayList<>();
    }

    public void insertarAnimal(Mascotas animal){
        animales.add(animal);
    }
    public void eliminarAnimal(String nombre){
        animales.removeIf(animales->animales.getNombre().equalsIgnoreCase(nombre));
    }
    public void vaciarInventario(){
        animales.clear();
    }
    public void mostrarAnimales(){
        int contador=0;
        for (Mascotas mascota : animales) {
            contador++;
            System.out.print(contador+": ");
            System.out.println(mascota.getNombre());
        }
    }
    public void mostrarDatosAnimal(String nombre) {
        for (Mascotas animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                animal.muestra();
                return;
            }
        }
        System.out.println("No se encontró un animal con el nombre: " + nombre);
    }
    public void mostrarTodo(){
        for (Mascotas mascotas : animales) {
            mascotas.muestra();
        }
    }
}
