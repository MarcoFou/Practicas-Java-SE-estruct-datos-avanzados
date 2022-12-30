package _7_Mapas;

import java.util.HashMap;
import java.util.Map;

public class IterarMapas {
    public static void main(String[] args) {
        // Inicializacion
        HashMap<String, Integer> mapa = new HashMap<>();

        // Relleno: metodo put: actualiza y si no existe esa clave la crea
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);

        for(Map.Entry elemento : mapa.entrySet()) {
            System.out.println("Elemento clave: " + elemento.getKey());
            System.out.println("Elemento valor: " + elemento.getValue());
        }
    }
}
