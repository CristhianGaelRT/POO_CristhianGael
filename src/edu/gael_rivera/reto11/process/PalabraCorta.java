/**
 * Esta clase se encarga de encontrar la palabra más corta en un arreglo de palabras.
 */
package edu.gael_rivera.reto11.process;

import java.util.Comparator;
import java.util.stream.Stream;

public class PalabraCorta {
    /**
     * Encuentra la palabra más corta en un arreglo de palabras.
     * @param palabras Arreglo de palabras.
     * @return La palabra más corta encontrada.
     */
    public static String palabraCorta(String[] palabras) {
        // Utiliza Stream para encontrar la palabra más corta usando la longitud de las palabras
        return Stream.of(palabras)
                .min(Comparator.comparingInt(String::length))
                .orElse(null); // Si no se encuentra ninguna palabra, retorna null
    }
}
