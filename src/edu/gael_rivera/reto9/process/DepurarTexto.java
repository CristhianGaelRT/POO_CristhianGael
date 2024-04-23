// DepurarTexto.java
package edu.gael_rivera.reto9.process;

import java.text.Normalizer;

/**
 * Clase que se encarga de depurar un texto eliminando caracteres no deseados y convirtiendo en minusculas
 */
public class DepurarTexto {

    /**
     * M�todo est�tico que depura un texto dado
     * @param texto Es el texto del libro
     * @return depurar texto
     */
    public static String depurar(String texto) {
        // Se convierte a minusculas
        texto = texto.toLowerCase(); // Convertir a min�sculas

        // Se quitan los acentos del texto
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD); // Quitar acentos

        // Se eliminan los caracteres no ASCII
        texto = texto.replaceAll("[^\\p{ASCII}]", ""); // Quitar caracteres no ASCII

        // Se eliminan los caracteres no alfab�ticos, incluyendo letras con acentos
        texto = texto.replaceAll("[^a-zA-Z������������\\s]", ""); // Quitar caracteres no alfab�ticos

        // Se retorna el texto depurado
        return texto;
    }
}
