package edu.gael_rivera.Evidencia_2.data;

public class Articulo {
    private String nombre; // Nombre del artículo
    private String tipo; // Tipo del artículo (Música, Videojuego, Libro, Película)
    private String genero; // Género del artículo (si aplica)
    private boolean esEstreno; // Indicador si el artículo es un estreno o no

    /**
     * Constructor para inicializar un artículo con nombre, tipo, género y si es un estreno
     * @param nombre Es el nombre del usuario
     * @param tipo Tipo de articulo que consumira
     * @param genero Genero del articulo
     * @param esEstreno Si el articulo recien se estreno
     */
    public Articulo(String nombre, String tipo, String genero, boolean esEstreno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.esEstreno = esEstreno;
    }

    /**
     * Método para obtener el nombre del artículo
     * @return Nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el tipo del artículo
     * @return Tipo de articulo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método para obtener el género del artículo
     * @return Tipo de genero del articulo
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Método para verificar si el artículo es un estreno
     * @return Si el articulo recien se estreno
     */
    public boolean esEstreno() {
        return esEstreno;
    }
}
