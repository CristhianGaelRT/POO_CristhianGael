/**
 * Esta clase se encarga de filtrar las palabras que empiezan y terminan con una vocal y tienen al menos 5 letras.
 */
package edu.gael_rivera.reto11.process;

import java.util.stream.Stream;

public class VocalesSemejantes {
    /**
     * Filtra las palabras que empiezan y terminan con una vocal y tienen al menos 5 letras.
     * @param palabras Arreglo de palabras a filtrar.
     * @return Arreglo de palabras que cumplen con las condiciones.
     */
    public static String[] palabrasConVocalesSemejantes(String[] palabras) {
        return Stream.of(palabras)
                .filter(word -> word.matches("^[aeiouAEIOU].*[aeiouAEIOU]$"))
                .filter(word -> word.length() >= 5)
                .toArray(String[]::new);
    }
}
