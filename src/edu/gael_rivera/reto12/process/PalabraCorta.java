/**
 * Esta clase se encarga de encontrar la palabra más corta en un arreglo de palabras.
 */
package edu.gael_rivera.reto12.process;

import java.util.Comparator;
import java.util.stream.Stream;

public class PalabraCorta {
    /**
     * Encuentra la palabra más corta en un arreglo de palabras.
     *
     * @param palabras Arreglo de palabras.
     * @return La palabra más corta encontrada.
     */
    public static String palabraCorta(String[] palabras) {
        String palabraMasCorta = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
        }
        return palabraMasCorta;
    }

}