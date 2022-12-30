package _2_Arrays;

/**
 * Un Array: es una coleccion de elementos de un mismo tipo de datos, tambien de objetos.
 *
 * Es una variable que tiene el mismo tipo consecutivo de datos.
 *
 * Las posiciones se empiezan a contar desde cero.
 *
 * Una vez definido su longitud, nos se puede cambiar.
 *
 * El tamano del array se debe definir teniendo en cuenta el maximo a utilizar aunque al principio se utilicen menos.
 * es decir que no es escalable.
 */

public class ArraysUnidimencionales {
    public static void main(String[] args) {

        //Declaracion de arrays:

        // Array de enteros: Cuando no conocemos los valores previamente, porque dependen de un evento que se produzca
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;


        // Array de enteros: Cuando conocemos los valores previamente
        int arrayDos[] = { 1, 2, 3, 4, 5};


        // Array de String: cambiando el valor de sus datos
        String nombress[] = { "Pepe", "Juan"};
        nombress[0] = "Victor";
        nombress[1] = "Paco";



        // Array de String:
        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

//----------------------------------------------------------------------------------------

        // Propiedades de los array:
        System.out.println("Longitud del array: " + nombres.length);
//----------------------------------------------------------------------------------------

        // Iterando el array: "for each"
        // Por cada iteracion la variable i(index) toma el valor de cada elemento del array
        for (String i : nombres) {

            System.out.println(i);

        }

        // Iterando usando el indice del arraym
        for (int i = 0; i <nombres.length; i++){

            System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);

        }

        // Iterando usando el indice del array, ejemplo 2
        String ultimoNombre = "";

        for (int i = 0; i <nombres.length; i++){

            ultimoNombre = nombres[i];

            System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);
            System.out.println("El ultimo nombre fue: " + ultimoNombre);

        }

    }

}
