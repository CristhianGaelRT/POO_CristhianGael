// LeerTexto.java
package edu.gael_rivera.reto9.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Esta clase que se encarga de leer el contenido de un archivo de texto
 */
public class LeerTexto {
    /**
     * Método estático que lee el contenido de un archivo dado
     * @param archivo Es el archivo del libro adjuntado
     * @return
     */
    public static String leer(String archivo) {
        // Se construye la ruta del archivo a partir del directorio resources dentro del proyecto
        Path path = Paths.get("src", "edu", "gael_rivera", "reto9", "resources", archivo);
        try {
            // Se lee el contenido del archivo y se retorna como una cadena de caracteres
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            // En caso de error al leer el archivo, se muestra un mensaje de error y se retorna una cadena vacía
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }
    }
}
