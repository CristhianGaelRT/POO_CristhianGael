// Esp.java
package edu.gael_rivera.reto9.ui;

/**
 * Clase que proporciona las cadenas de texto en español extendiendo la clase Idioma
 */
public class Esp extends Idioma {
    // Método sobreescrito para obtener la cadena de texto que solicita al usuario que seleccione un libro
    @Override
    public String getSeleccione_libro() {
        return "Seleccione un libro para analizar (1-5), o ingrese '0' para salir:";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario cómo salir del programa
    @Override
    public String getSalir() {
        return "Salir";
    }

    // Método sobreescrito para obtener la cadena de texto que despide al usuario al salir del programa
    @Override
    public String getHasta_luego() {
        return "¡Hasta luego!";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario que la opción seleccionada no es válida
    @Override
    public String getOpcion_no_valida() {
        return "Opción no válida. Intente de nuevo.";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario que se mostrarán las 10 palabras más comunes
    @Override
    public String getLas_10_palabras() {
        return "Las 10 palabras más usadas en ";
    }

    // Método sobreescrito para obtener la cadena de texto que indica al usuario que las palabras se están mostrando
    @Override
    public String getSon() {
        return " son:";
    }
}
