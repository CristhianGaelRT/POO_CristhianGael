package edu.gael_rivera.reto12.process;

import java.util.*;

public class VocalesSemejantes {
    /**
     * Esta clase se encarga de filtrar las palabras que empiezan y terminan con una vocal y tienen al menos 5 letras.
     * Filtra las palabras que empiezan y terminan con una vocal y tienen al menos 5 letras.
     * @param palabras Arreglo de palabras a filtrar.
     * @return Arreglo de palabras que cumplen con las condiciones.
     */
    public static String[] palabrasConVocalesSemejantes(String[] palabras) {
        List<String> resultado = new ArrayList<>();

        // Verificar si cada palabra contiene solo vocales y si todas son iguales
        for (String palabra : palabras) {
            // Convertir la palabra a minúsculas para facilitar la comparación
            String palabraEnMinusculas = palabra.toLowerCase();

            // Verificar si la palabra contiene solo vocales
            boolean soloVocales = palabraEnMinusculas.matches("[aeiou]+");

            // Verificar si todas las vocales son iguales
            Set<Character> conjuntoVocales = new HashSet<>();
            for (char c : palabraEnMinusculas.toCharArray()) {
                if ("aeiou".indexOf(c) >= 0) {
                    conjuntoVocales.add(c);
                }
            }
            boolean todasIguales = conjuntoVocales.size() == 1;

            // Si la palabra cumple ambas condiciones, agregarla al resultado
            if (soloVocales && todasIguales) {
                resultado.add(palabra);
            }
        }

        // Si no se encontraron palabras que cumplan ambas condiciones, devolver null
        if (resultado.isEmpty()) {
            return null;
        }

        // Convertir el resultado a un array de strings
        return resultado.toArray(new String[0]);
    }
}