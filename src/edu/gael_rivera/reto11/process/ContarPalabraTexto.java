/**
 * Esta clase se encarga de contar la frecuencia de las palabras en un texto dado.
 */
package edu.gael_rivera.reto11.process;

import java.util.HashMap;
import java.util.Map;

public class ContarPalabraTexto {
    /**
     * Cuenta la frecuencia de las palabras en un arreglo de palabras.
     * @param palabras Arreglo de palabras.
     * @return Arreglo de palabras con su frecuencia.
     */
    public static String[] contar(String[] palabras) {
        Map<String, Integer> frecuencias = new HashMap<>();
        for (String palabra : palabras) {
            frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
        }
        return frecuencias.keySet().toArray(new String[0]);
    }
}
