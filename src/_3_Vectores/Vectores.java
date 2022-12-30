package _3_Vectores;

import java.util.Vector;

/**
 * Los vectores son como arrays pero se ajustan automaticamente al tipo de dato, son arrays dinamicos
 */
public class Vectores {

    public static void main(String[] args) {

        // Inicializacion de un vector
        Vector<Integer>vector = new Vector();

        // Metodos de la clase Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        // Los vectores tienen tamano y capacidad
        System.out.println("Vector tamano: " + vector.size() + " y Capacidad: " + vector.capacity());

        /**
         *  Cuando se crea un vector por debajo se crea un array de capacidad limitada(de esto se encarga el propio runtime)
         *
         *  el metodo [add] rellena ese array con determinada capacidad que corre por debajo.
         *
         *  El tamano del vector son los elementos que contiene
         *  La capacidad es como de grande es el array subyacente
         *
         * CapacidadVector = CapacidadVector * 2
         *
         *  el parametro inicial debe ser la capacidad maxima esperada para rellenar, ya que si los datos sobrepasan
         *  la copia y creacion del siguiente array es muy costosa en terminos de memoria y procesamiento
         *
         *  una vez que el vector crece, se queda con esa capacidad, no disminuye aunque los elementos se hayan borraoo.
         *
          */

        Vector<Integer>vector2 = new Vector(50,15);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("\nDatos del vector 2: " + vector2);
        System.out.println("Vector tamano: " + vector.size() + " y Capacidad: " + vector.capacity());

        /**
         * Cuando se llena la capacidad maxima del array por debajo, lo que ocurre es que se crea un nuevo array, se
         * copian los elementos que tengo y a continuacion se copian los elementos nuevos.
         */

        Vector<Integer>vector3 = new Vector<>();
        Vector<Integer>vector4 = new Vector<>();

        vector3.add(1);
        vector3.add(2);

        vector4.add(1);
        vector4.add(null);

        boolean resultado = vector3.equals(vector4);
        System.out.println("Son iguales? " + resultado);

        // Para reducir el tamano del vector al minimo necesario para mis datos, y liberar memoria:
        System.out.println("tamano: " + vector4.size() + " Capacidad: " + vector4.capacity());
        vector4.trimToSize(); // este metodo libera memopria pero es costoso en terminos de procesamiento
        System.out.println("tamano: " + vector4.size() + " Capacidad: " + vector4.capacity());

    }


}
