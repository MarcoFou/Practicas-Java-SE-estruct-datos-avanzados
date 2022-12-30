package _5_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Una linkedList se diferencia del arrayList xq en vez de utilizar arrays por debajo
 * la linkedList utiliza listas doble enlazadas.
 *
 * el arraylist es mucho mas rapido para almacenar y buscar datos
 *
 * la linked list es mas rapida para modificar datos
 *
 * la linked list utiliza dos interfaces, la interfaz List y la interfaz Deque.
 */

public class LinkedLists {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println("Lista: " + lista);

        LinkedList<String>listaEnlazada = new LinkedList<String>();
    }
}
