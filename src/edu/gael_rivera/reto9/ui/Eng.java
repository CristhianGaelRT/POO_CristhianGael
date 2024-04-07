// Eng.java
package edu.gael_rivera.reto9.ui;

/**
 * // Clase que proporciona las cadenas de texto en inglés extendiendo la clase Idioma
 */
public class Eng extends Idioma {
    // Método sobreescrito para obtener la cadena de texto que solicita al usuario que seleccione un libro
    @Override
    public String getSeleccione_libro() {
        return "Select a book to analyze (1-5), or enter '0' to exit:";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario cómo salir del programa
    @Override
    public String getSalir() {
        return "Exit";
    }

    // Método sobreescrito para obtener la cadena de texto que despide al usuario al salir del programa
    @Override
    public String getHasta_luego() {
        return "Goodbye!";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario que la opción seleccionada no es válida
    @Override
    public String getOpcion_no_valida() {
        return "Invalid option. Try again.";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario que se mostrarán las 10 palabras más comunes
    @Override
    public String getLas_10_palabras() {
        return "The 10 most used words in ";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario que las palabras se están mostrando
    @Override
    public String getSon() {
        return " are:";
    }
}
