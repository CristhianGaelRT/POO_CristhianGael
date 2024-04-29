/**
 * Esta clase se encarga de contar el número de vocales en un texto dado.
 */
package edu.gael_rivera.reto12.process;

public class ContarVocales {
    /**
     * Cuenta el número de vocales en un texto.
     * @param texto Texto en el que se contarán las vocales.
     * @return Número total de vocales en el texto.
     */
    public static int contar(String texto) {
        long count = texto.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
        return (int) count;
    }
}
