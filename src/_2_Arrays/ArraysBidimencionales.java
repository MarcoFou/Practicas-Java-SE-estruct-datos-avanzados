package _2_Arrays;

public class ArraysBidimencionales {

    public static void main(String[] args) {

        // Inicializacion del array bi: Cuando no conocemos los valores previamente, porque dependen de un evento que se produzca
        int arrayBidi[][] = new int[2][4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        // Inicializacion del array bi: Cuando conocemos previamente los valores.
        int arrayBidi2[][] = {
                { 1, 2, 3, 4 },
                {10, 20, 30, 40}
        };

//----------------------------------------------------------------------------------------------------------------------
        // Recorrer el array Bidi: con for anidados por cada dimension.
        for (int i = 0; i < arrayBidi.length; i++){

            System.out.println("Valor de i: " + i);

            for (int j = 0; j < arrayBidi[i].length; j++){

                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }
    }

}
