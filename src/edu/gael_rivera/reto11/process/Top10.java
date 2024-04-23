/**
 * Esta clase se encarga de ordenar las palabras contadas y devolver las 10 palabras más frecuentes.
 */
package edu.gael_rivera.reto11.process;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Top10 {
    /**
     * Ordena las palabras contadas en orden descendente por su frecuencia y devuelve las 10 palabras más frecuentes.
     * @param palabrasContadas Mapa que contiene las palabras y su frecuencia.
     * @return Arreglo de las 10 palabras más frecuentes.
     */
    public static String[] ordenar(Map<String, Integer> palabrasContadas) {
        return palabrasContadas.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }
}
