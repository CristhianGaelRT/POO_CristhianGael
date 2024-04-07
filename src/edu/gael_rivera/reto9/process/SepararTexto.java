// SepararTexto.java
package edu.gael_rivera.reto9.process;

/**
 * Esta Clase que se encarga de separar un texto en palabras
 */
public class SepararTexto {
    /**
     * Método estático que separa un texto dado en palabras
     * utilizando espacios en blanco como delimitador
     * @param texto Es el texto que contiene el libro seleccionado
     * @return Separa el texto en palabras
     */
    public static String[] separar(String texto) {
        // Se utiliza el método split() de la clase String para dividir el texto en palabras utilizando espacios en blanco como delimitador
        return texto.split("\\s+"); // Separar por espacios en blanco
    }
}
