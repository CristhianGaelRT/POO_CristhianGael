// ContarPalabraTexto.java
package edu.gael_rivera.reto9.process;

import java.util.HashMap;
import java.util.Map;


/**
 * Esta clase se encarga de contar la frecuencia de cada palabra en un arreglo de palabras
 */
public class ContarPalabraTexto {
    /**
     * Este metodo se encarga d econtar las palabras
     * @param palabras Son las palabras que tiene el libro
     * @return Contar las palabras del libro
     */
    // Método estático que cuenta la frecuencia de cada palabra en un arreglo de palabras
    public static String[] contar(String[] palabras) {
        // Se crea un mapa para almacenar las frecuencias de las palabras
        Map<String, Integer> frecuencias = new HashMap<>();

        // Se itera sobre cada palabra en el arreglo de palabras
        for (String palabra : palabras) {
            // Se incrementa la frecuencia de la palabra en el mapa o se inicializa en 1 si es la primera vez que aparece
            frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
        }

        // Se retornan las claves del mapa, que representan las palabras únicas encontradas en el texto
        return frecuencias.keySet().toArray(new String[0]);
    }
}
