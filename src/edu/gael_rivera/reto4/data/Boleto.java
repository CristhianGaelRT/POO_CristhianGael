package edu.gael_rivera.reto4.data;

/**
 *  Esta clase encapsula la información relacionada
 *  con el precio de un boleto y proporciona métodos para acceder
 *  y modificar este precio de manera segura y controlada.
 */

public class Boleto {
    private double precio;
    // Constructor de la clase Boleto que recibe el precio como parámetro

    public Boleto(double precio) {
        this.precio = precio; // Asigna el precio recibido al atributo precio de la instancia
    }
    // Método getter para obtener el precio del boleto
    public double getPrecio() {
        return precio; // Devuelve el precio almacenado en el atributo precio
    }

    // Método setter para establecer el precio del boleto
    public void setPrecio(double precio) {
        this.precio = precio; // Establece el precio recibido como parámetro en el atributo precio
    }
}
