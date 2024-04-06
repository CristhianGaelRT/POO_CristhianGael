// OrdenarTop10Palabras.java
package edu.gael_rivera.reto9.process;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdenarTop10Palabras {
    public static String[] ordenar(String[] palabrasContadas) {
        Stream<String> stream = Stream.of(palabrasContadas);
        Comparator<String> comparator = (s1, s2) -> Integer.compare(palabrasContadas.length, s2.length());
        return stream.sorted(comparator.reversed()).limit(10).toArray(String[]::new);
    }
}
