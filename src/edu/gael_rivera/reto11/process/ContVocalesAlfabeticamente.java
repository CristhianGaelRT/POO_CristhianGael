/**
 * Esta clase se encarga de agrupar palabras por vocal inicial y ordenarlas alfabéticamente.
 */
package edu.gael_rivera.reto11.process;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContVocalesAlfabeticamente {
    /**
     * Agrupa palabras por vocal inicial y las ordena alfabéticamente.
     * @param texto Texto del que se extraerán las palabras.
     * @return Arreglo de cadenas que contiene las palabras agrupadas por vocal inicial y ordenadas alfabéticamente.
     */
    public static String[] vocalesAlfabeticamente(String texto) {
        // Mapa para almacenar palabras agrupadas por vocal inicial
        Map<Character, StringBuilder> palabrasPorVocal = new TreeMap<>();
        palabrasPorVocal.put('A', new StringBuilder());
        palabrasPorVocal.put('E', new StringBuilder());
        palabrasPorVocal.put('I', new StringBuilder());
        palabrasPorVocal.put('O', new StringBuilder());
        palabrasPorVocal.put('U', new StringBuilder());

        // Separar el texto en palabras
        String[] palabras = texto.split("\\s+");
        // Iterar sobre las palabras y agruparlas por vocal inicial
        for (String palabra : palabras) {
            char primeraLetra = palabra.toUpperCase().charAt(0);
            if (palabrasPorVocal.containsKey(primeraLetra)) {
                palabrasPorVocal.get(primeraLetra).append(palabra).append(" ");
            }
        }

        // Convertir el mapa a un arreglo de cadenas y retornarlo
        return palabrasPorVocal.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().toString().trim())
                .toArray(String[]::new);
    }
}
