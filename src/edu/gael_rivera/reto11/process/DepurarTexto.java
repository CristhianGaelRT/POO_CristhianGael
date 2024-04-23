/**
 * Esta clase se encarga de depurar un texto, eliminando acentos, caracteres no ASCII y no alfabéticos.
 */
package edu.gael_rivera.reto11.process;

import java.text.Normalizer;

public class DepurarTexto {
    /**
     * Depura un texto, eliminando acentos, caracteres no ASCII y no alfabéticos.
     * @param texto Texto que se va a depurar.
     * @return Texto depurado.
     */
    public static String depurar(String texto) {
        // Convertir el texto a minúsculas
        texto = texto.toLowerCase();

        // Quitar acentos
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);

        // Quitar caracteres no ASCII
        texto = texto.replaceAll("[^\\p{ASCII}]", "");

        // Quitar caracteres no alfabéticos
        texto = texto.replaceAll("[^a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]", "");

        // Retornar el texto depurado
        return texto;
    }
}
