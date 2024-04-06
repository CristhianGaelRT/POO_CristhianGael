// LeerTexto.java
package edu.gael_rivera.reto9.process;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerTexto {
    public static String leer(String archivo) {
        try {
            return new String(Files.readAllBytes(Paths.get("resources", archivo)));
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }
    }
}
