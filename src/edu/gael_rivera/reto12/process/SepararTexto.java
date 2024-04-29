package edu.gael_rivera.reto12.process;

public class SepararTexto {
    /**
     * Esta clase tiene como funcion separar el texo
     * @param text es el texto contenido del libro
     * @return separar texto
     */
    public static String[] separar(String text) {
        return text.split("\\s+");
    }
}