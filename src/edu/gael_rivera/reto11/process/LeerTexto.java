/**
 * Esta clase se encarga de leer un archivo de texto.
 */
package edu.gael_rivera.reto11.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerTexto {
    /**
     * Lee un archivo de texto.
     * @param archivo Nombre del archivo a leer.
     * @return Contenido del archivo como una cadena de texto.
     */
    public static String leer(String archivo) {
        // Obtener la ruta del archivo
        Path path = Paths.get("src", "edu", "gael_rivera", "reto11", "resources", archivo);
        try {
            // Leer el contenido del archivo y retornarlo como una cadena de texto
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            // Manejar cualquier excepción de IO mostrando un mensaje de error
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return ""; // Retornar una cadena vacía en caso de error
        }
    }
}
