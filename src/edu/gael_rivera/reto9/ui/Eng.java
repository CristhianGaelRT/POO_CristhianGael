// Eng.java
package edu.gael_rivera.reto9.ui;

/**
 * // Clase que proporciona las cadenas de texto en ingl�s extendiendo la clase Idioma
 */
public class Eng extends Idioma {
    // M�todo sobreescrito para obtener la cadena de texto que solicita al usuario que seleccione un libro
    @Override
    public String getSeleccione_libro() {
        return "Select a book to analyze (1-5), or enter '0' to exit:";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario c�mo salir del programa
    @Override
    public String getSalir() {
        return "Exit";
    }

    // M�todo sobreescrito para obtener la cadena de texto que despide al usuario al salir del programa
    @Override
    public String getHasta_luego() {
        return "Goodbye!";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario que la opci�n seleccionada no es v�lida
    @Override
    public String getOpcion_no_valida() {
        return "Invalid option. Try again.";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario que se mostrar�n las 10 palabras m�s comunes
    @Override
    public String getLas_10_palabras() {
        return "The 10 most used words in ";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario que las palabras se est�n mostrando
    @Override
    public String getSon() {
        return " are:";
    }
}
