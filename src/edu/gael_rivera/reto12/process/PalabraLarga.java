/**
 * Esta clase se encarga de encontrar la palabra más larga en un arreglo de palabras.
 */
package edu.gael_rivera.reto12.process;

import java.util.Comparator;
import java.util.stream.Stream;

public class PalabraLarga {
    /**
     * Encuentra la palabra más larga en un arreglo de palabras.
     * @param palabras Arreglo de palabras.
     * @return La palabra más larga encontrada.
     */
    public static String palabraLarga(String[] palabras) {
        // Utiliza Stream para encontrar la palabra más larga usando la longitud de las palabras
        return Stream.of(palabras)
                .max(Comparator.comparingInt(String::length))
                .orElse(""); // Si no se encuentra ninguna palabra, retorna una cadena vacía
    }
}
