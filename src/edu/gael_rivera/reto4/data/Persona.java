package edu.gael_rivera.reto4.data;

/**
 * Esta clase sirve para almacenar los datos del usuario
 */

public class Persona {
    private String nombreCompleto;
    // Usamos un constructor de la clase Persona que recibe el nombre completo como parámetro
    public Persona(String nombreCompleto) {
        // Asigna el nombre completo recibido al nombre nombreCompleto de la instancia
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * // Método permiten acceder al valor de un atributo para obtener
     * el nombre completo de la persona
     * @return Nombre completo de la persona
     */
    public String getNombreCompleto() {
        // Devuelve el nombre completo almacenado en el atributo nombreCompleto
        return nombreCompleto;
    }

    /**
     * Método setter para establecer el nombre completo de la persona
     * @param nombreCompleto Nombre completo de la persona
     */
    public void setNombreCompleto(String nombreCompleto) {
        // Establece el nombre completo recibido como parámetro en el atributo nombreCompleto
        this.nombreCompleto = nombreCompleto;
    }
}
