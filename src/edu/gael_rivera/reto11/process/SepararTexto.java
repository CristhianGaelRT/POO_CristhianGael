/**
 * Esta clase se encarga de separar un texto en palabras.
 */
package edu.gael_rivera.reto11.process;

public class SepararTexto {
    /**
     * Separa un texto en palabras utilizando espacios en blanco como delimitadores.
     * @param texto Texto a ser separado.
     * @return Arreglo de palabras obtenidas del texto.
     */
    public static String[] separar(String texto) {
        // Separa el texto utilizando espacios en blanco como delimitadores
        return texto.split("\\s+");
    }
}
