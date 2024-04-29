package edu.gael_rivera.reto12.process;

import java.util.HashMap;
import java.util.Map;

public class ContarPalabraTexto {
    /**
     * Esta clase se encarga de contar la frecuencia de las palabras en un texto dado.
     * Cuenta la frecuencia de las palabras en un arreglo de palabras.
     * @param palabras Arreglo de palabras.
     * @return Arreglo de palabras con su frecuencia.
     */
    public static String[] contar(String[] palabras) {
        if (palabras.length == 0) {
            // Devolver un array con una cadena indicando que no hay palabras
            return new String[]{"No hay palabras"};
        }

        // Mapa para almacenar el contador de palabras
        Map<String, Integer> contadorPalabras = new HashMap<>();

        // Contar las ocurrencias de cada palabra
        for (String palabra : palabras) {
            contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
        }

        // Convertir el mapa en un arreglo de cadenas
        return contadorPalabras.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .toArray(String[]::new);
    }
}
