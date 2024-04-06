// ContarPalabraTexto.java
package edu.gael_rivera.reto9.process;

import java.util.HashMap;
import java.util.Map;

public class ContarPalabraTexto {
    public static String[] contar(String[] palabras) {
        Map<String, Integer> frecuencias = new HashMap<>();
        for (String palabra : palabras) {
            frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
        }
        return frecuencias.keySet().toArray(new String[0]);
    }
}
