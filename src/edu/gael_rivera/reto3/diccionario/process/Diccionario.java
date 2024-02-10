package edu.gael_rivera.reto3.diccionario.process;

import java.util.Arrays;

public class Diccionario {
    private String[] palabras;
    private String[] significados;

    public Diccionario(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }

    public String buscarSignificado(String palabra) {
        int indice = obtenerIndice(palabra);
        if (indice != -1) {
            return significados[indice];
        } else {
            return "La palabra que busca no está en el diccionario";
        }
    }

    public void listarPalabras() {
        System.out.println("Contenido del diccionario:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("%d. %s%n", i + 1, palabras[i]);
        }
    }

    public void detalleDiccionario() {
        System.out.println("Cantidad de palabras en el diccionario: " + palabras.length);
        System.out.println("Detalle del diccionario:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("%d. %s, cantidad caracteres: %d, cantidad caracteres significado: %d%n",
                    i + 1, palabras[i], palabras[i].length(), significados[i].length());
        }
    }

    private int obtenerIndice(String palabra) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                return i;
            }
        }
        return -1;
    }
}
