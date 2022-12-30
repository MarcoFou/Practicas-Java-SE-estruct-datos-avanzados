package _4_ArrayList;

import java.util.ArrayList;

/**
 * Un Arraylist es una implementacion de la Clase List
 *
 * la diferencia con los vectores esta en el manejo de la capacidad:
 */
// Capacidad ArrayList = capacidadArrayList + (capacidadArrayList * 0.5)

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String>lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println("Lista: " + lista);

        lista.remove("Elemento B");
        System.out.println("Lista: " + lista);

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        for ( int i = 0; i < lista.size(); i++){
            System.out.println("\n" + lista);
        }

    }
}
