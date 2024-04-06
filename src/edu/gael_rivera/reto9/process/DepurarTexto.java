// DepurarTexto.java
package edu.gael_rivera.reto9.process;

import java.text.Normalizer;

public class DepurarTexto {
    public static String depurar(String texto) {
        texto = texto.toLowerCase(); // Convertir a minúsculas
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD); // Quitar acentos
        texto = texto.replaceAll("[^\\p{ASCII}]", ""); // Quitar caracteres no ASCII
        texto = texto.replaceAll("[^a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]", ""); // Quitar caracteres no alfabéticos
        return texto;
    }
}
