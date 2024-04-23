package edu.gael_rivera.reto11.ui;

public abstract class Idioma {
    /**
     * Clase abstracta que define los métodos para obtener mensajes en diferentes idiomas.
     * Obtiene el mensaje para seleccionar un libro.
     * @return Mensaje para seleccionar un libro.
     */
    public abstract String getSeleccione_libro();

    /**
     * Obtiene el mensaje para salir.
     * @return Mensaje para salir.
     */
    public abstract String getSalir();

    /**
     * Obtiene el mensaje de despedida.
     * @return Mensaje de despedida.
     */
    public abstract String getHasta_luego();

    /**
     * Obtiene el mensaje de opción no válida.
     * @return Mensaje de opción no válida.
     */
    public abstract String getOpcion_no_valida();

    /**
     * Obtiene el mensaje para el top 10 de palabras.
     * @return Mensaje para el top 10 de palabras.
     */
    public abstract String getTop_10_palabras();

    /**
     * Obtiene el mensaje para el número de vocales.
     * @return Mensaje para el número de vocales.
     */
    public abstract String getNumero_vocales();

    /**
     * Obtiene el mensaje para las vocales en orden alfabético.
     * @return Mensaje para las vocales en orden alfabético.
     */
    public abstract String getVocales_alfabeticamente();

    /**
     * Obtiene el mensaje para la palabra más corta.
     * @return Mensaje para la palabra más corta.
     */
    public abstract String getPalabra_mas_corta();

    /**
     * Obtiene el mensaje para la palabra más larga.
     * @return Mensaje para la palabra más larga.
     */
    public abstract String getPalabra_mas_larga();

    /**
     * Obtiene el mensaje para las palabras con letra impar.
     * @return Mensaje para las palabras con letra impar.
     */
    public abstract String getPalabras_con_letra_impar();

    /**
     * Obtiene el mensaje para las palabras con vocales terminadas.
     * @return Mensaje para las palabras con vocales terminadas.
     */
    public abstract String getPalabras_con_vocales_terminadas();
}
