// Idioma.java
package edu.gael_rivera.reto9.ui;

/**
 * Esta Clase abstracta que define los m�todos para obtener las cadenas de texto en diferentes idiomas
 */
public abstract class Idioma {
    // M�todo abstracto para obtener la cadena de texto que solicita al usuario que seleccione un libro
    public abstract String getSeleccione_libro();

    // M�todo abstracto para obtener la cadena de texto que indica al usuario c�mo salir del programa
    public abstract String getSalir();

    // M�todo abstracto para obtener la cadena de texto que despide al usuario al salir del programa
    public abstract String getHasta_luego();

    // M�todo abstracto para obtener la cadena de texto que indica al usuario que la opci�n seleccionada no es v�lida
    public abstract String getOpcion_no_valida();

    // M�todo abstracto para obtener la cadena de texto que indica al usuario que se mostrar�n las 10 palabras m�s comunes
    public abstract String getLas_10_palabras();

    // M�todo abstracto para obtener la cadena de texto que indica al usuario que las palabras se est�n mostrando
    public abstract String getSon();
}
