package edu.gael_rivera.reto12.process;

import java.util.*;

public class Top10 {
    /**
     * Esta clase se encarga de ordenar las palabras contadas y devolver las 10 palabras más frecuentes.
     * Ordena las palabras contadas en orden descendente por
     * su frecuencia y devuelve las 10 palabras más frecuentes.
     * @param words Mapa que contiene las palabras y su frecuencia.
     * @return Arreglo de las 10 palabras más frecuentes.
     */
    public static String[] ordenar(String[] words) {
        // Contar la frecuencia de las palabras
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Convertir el mapa a una lista de pares (palabra, frecuencia)
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Ordenar la lista en función de la frecuencia y mantener el orden original en caso de empate
        entryList.sort((a, b) -> {
            int cmp = Integer.compare(b.getValue(), a.getValue()); // Comparar por frecuencia
            if (cmp == 0) {
                // Si hay empate en la frecuencia, comparar por orden lexicográfico ascendente
                cmp = a.getKey().compareTo(b.getKey());
            }
            return cmp;
        });

        // Obtener las primeras 10 palabras ordenadas por frecuencia
        List<String> top10Words = new ArrayList<>();
        for (int i = 0; i < Math.min(entryList.size(), 10); i++) {
            top10Words.add(entryList.get(i).getKey());
        }

        // Convertir la lista a un array de strings
        return top10Words.toArray(new String[0]);
    }
}
