// OrdenarTop10Palabras.java
package edu.gael_rivera.reto9.process;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 *  Clase que se encarga de ordenar las palabras
 *  contadas por frecuencia y seleccionar las 10 palabras más comunes
 */
public class OrdenarTop10Palabras {
    /**
     * Método estático que ordena las palabras contadas por frecuencia
     * y selecciona las 10 palabras más comunes
     * @param palabrasContadas Cuenta las 10 palabras mas comunes que tiene el libro
     * @return 10 palabras mas comunes
     */
    public static String[] ordenar(String[] palabrasContadas) {
        // Se convierte el arreglo de palabras contadas en un flujo de palabras
        Stream<String> stream = Stream.of(palabrasContadas);

        // Se define un comparador personalizado para ordenar las palabras por longitud
        Comparator<String> comparator = (s1, s2) -> Integer.compare(palabrasContadas.length, s2.length());

        // Se ordena el flujo de palabras según el comparador, en orden descendente, y se limita a las 10 primeras palabras
        return stream.sorted(comparator.reversed()).limit(10).toArray(String[]::new);
    }
}
