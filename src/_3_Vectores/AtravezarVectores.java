package _3_Vectores;

import java.util.Vector;

public class AtravezarVectores {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        // For each:
        // Por cada iteracion la variable i(index) toma el valor de cada elemento del vector
        for(int i : vector){
            System.out.println("valor actual del vector" + i );
        }

        //for: por indice
        for (int i=0; i<vector.size(); i++){
           if (i % 2 == 0){
               vector.remove(i);
               continue; // vuelve a preguntar al for
           }
            System.out.println("\nEl valor actual es: " + vector.get(i) + " en posicion: " + i);

        }
    }
}
