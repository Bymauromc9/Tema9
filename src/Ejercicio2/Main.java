package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Inventario tienda = new Inventario();

        tienda.insertarAnimal(new Perro("Rex", 5, "Saludable", "01/01/2019", "Labrador", true));
        tienda.insertarAnimal(new Gato("Michi", 3, "Feliz", "15/06/2020", "Blanco", true));
        tienda.insertarAnimal(new Loro("Paco", 2, "Activo", "10/02/2022", true, true, "Amazonas", false));
        tienda.insertarAnimal(new Canario("Piolín", 1, "Cantando", "05/07/2023", true, false, "Amarillo", true));

        System.out.println("Lista de animales en la tienda:");
        tienda.mostrarAnimales();

        System.out.println("Datos de un animal específico:");
        tienda.mostrarDatosAnimal("Paco");

        System.out.println("Datos de todos los animales:");
        tienda.mostrarTodo();
    }
}
