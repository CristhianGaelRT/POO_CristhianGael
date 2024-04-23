/**
 * Esta clase se encarga de encontrar palabras con un número impar de letras y sin letras repetidas.
 */
package edu.gael_rivera.reto11.process;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalabraLetraImpar {
    /**
     * Encuentra palabras en un arreglo de palabras que tienen un número impar de letras y no tienen letras repetidas.
     * @param palabras Arreglo de palabras.
     * @return Arreglo de palabras con un número impar de letras y sin letras repetidas.
     */
    public static String[] palabrasConLetraImpar(String[] palabras) {
        // Filtra las palabras con un número impar de letras y sin letras repetidas
        return Arrays.stream(palabras)
                .filter(word -> word.length() % 2 != 0 && !repiteLetra(word))
                .toArray(String[]::new);
    }

    /**
     * Verifica si una palabra tiene letras repetidas.
     * @param palabra Palabra a verificar.
     * @return true si la palabra tiene letras repetidas, false de lo contrario.
     */
    private static boolean repiteLetra(String palabra) {
        // Convierte la palabra a un stream de caracteres y cuenta la frecuencia de cada letra
        return palabra.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values().stream()
                .anyMatch(count -> count > 1); // Retorna true si alguna letra tiene una frecuencia mayor a 1
    }
}
