// Esp.java
package edu.gael_rivera.reto9.ui;

/**
 * Clase que proporciona las cadenas de texto en espa�ol extendiendo la clase Idioma
 */
public class Esp extends Idioma {
    // M�todo sobreescrito para obtener la cadena de texto que solicita al usuario que seleccione un libro
    @Override
    public String getSeleccione_libro() {
        return "Seleccione un libro para analizar (1-5), o ingrese '0' para salir:";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario c�mo salir del programa
    @Override
    public String getSalir() {
        return "Salir";
    }

    // M�todo sobreescrito para obtener la cadena de texto que despide al usuario al salir del programa
    @Override
    public String getHasta_luego() {
        return "�Hasta luego!";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario que la opci�n seleccionada no es v�lida
    @Override
    public String getOpcion_no_valida() {
        return "Opci�n no v�lida. Intente de nuevo.";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario que se mostrar�n las 10 palabras m�s comunes
    @Override
    public String getLas_10_palabras() {
        return "Las 10 palabras m�s usadas en ";
    }

    // M�todo sobreescrito para obtener la cadena de texto que indica al usuario que las palabras se est�n mostrando
    @Override
    public String getSon() {
        return " son:";
    }
}
