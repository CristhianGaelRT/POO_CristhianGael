/**
 * Esta clase se encarga de depurar un texto, eliminando acentos, caracteres no ASCII y no alfabéticos.
 */
package edu.gael_rivera.reto12.process;

import java.text.Normalizer;

public class DepurarTexto {
    /**
     * Depura un texto, eliminando acentos, caracteres no ASCII y no alfabéticos.
     * @param text Texto que se va a depurar.
     * @return Texto depurado.
     */
    public static String depurar(String text) {
        // Utilizar una expresión regular para eliminar todos los caracteres no alfabéticos y los espacios
        return text.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]", "").toLowerCase();
    }
}
