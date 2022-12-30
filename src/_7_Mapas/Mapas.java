package _7_Mapas;

import java.util.HashMap;

/**
 * Un Mapa es un array asociativo, es una especie de diccionario donde se tiene una clave y un valor.
 *
 * su forma mas primitiva es HashMap.
 *
 * no pueden tener su clave duplicada.
 *
 * sus valores se pueden sustituir.
 */

public class Mapas {

    public static void main(String[] args) {

        // Inicializacion
        HashMap<String, Integer> mapa = new HashMap<>();

        // Relleno: metodo put: actualiza y si no existe esa clave la crea
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);

        System.out.println(mapa);

        // Reemplazar: si existe, reemplaza el valor y si no existe la ignora.
        mapa.replace("clave3",90);

        // Remove:
        mapa.remove("clave4");

        // ver el valor de una clave concreta:
        System.out.println(mapa.get("clave1"));
    }
}
