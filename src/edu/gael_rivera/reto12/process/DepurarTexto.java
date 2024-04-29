/**
 * Esta clase se encarga de depurar un texto, eliminando acentos, caracteres no ASCII y no alfab�ticos.
 */
package edu.gael_rivera.reto12.process;

import java.text.Normalizer;

public class DepurarTexto {
    /**
     * Depura un texto, eliminando acentos, caracteres no ASCII y no alfab�ticos.
     * @param text Texto que se va a depurar.
     * @return Texto depurado.
     */
    public static String depurar(String text) {
        // Utilizar una expresi�n regular para eliminar todos los caracteres no alfab�ticos y los espacios
        return text.replaceAll("[^a-zA-Z��������������\\s]", "").toLowerCase();
    }
}
