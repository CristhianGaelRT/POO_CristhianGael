// Idioma.java
package edu.gael_rivera.reto9.ui;

/**
 * Esta Clase abstracta que define los métodos para obtener las cadenas de texto en diferentes idiomas
 */
public abstract class Idioma {
    // Método abstracto para obtener la cadena de texto que solicita al usuario que seleccione un libro
    public abstract String getSeleccione_libro();

    // Método abstracto para obtener la cadena de texto que indica al usuario cómo salir del programa
    public abstract String getSalir();

    // Método abstracto para obtener la cadena de texto que despide al usuario al salir del programa
    public abstract String getHasta_luego();

    // Método abstracto para obtener la cadena de texto que indica al usuario que la opción seleccionada no es válida
    public abstract String getOpcion_no_valida();

    // Método abstracto para obtener la cadena de texto que indica al usuario que se mostrarán las 10 palabras más comunes
    public abstract String getLas_10_palabras();

    // Método abstracto para obtener la cadena de texto que indica al usuario que las palabras se están mostrando
    public abstract String getSon();
}
