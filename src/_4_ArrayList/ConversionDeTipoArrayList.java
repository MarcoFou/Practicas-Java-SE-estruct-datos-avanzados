package _4_ArrayList;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class ConversionDeTipoArrayList {

    public static void main(String[] args) {
        ArrayList<String>lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println("Lista: " + lista);
//-------------------------------------------------------------------
        // Convertir ArrayList a Array:

        // Inicializo el array:
        String array[] = new String[lista.size()];

        // Relleno el array:
        for (int i = 0; i<lista.size();i++){
            array[i] = lista.get(i);
        }
//----------------------------------------------------------------------

        for (String elemento : array){
            System.out.println("Elemento es: " + elemento);
        }

        // otra forma:
        for (Object arrayObjeto : lista.toArray()){
            System.out.println("\nUtilizando la clase Object: " + arrayObjeto.toString());
        }
    }
}
