package edu.gael_rivera.reto4.data;

/**
 * Esta Clase encapsula la información relacionada con la venta de boletos
 * y proporciona un método para mostrar los detalles de
 * la venta de manera estructurada.
 */

public class Ticket {
    private String comprador; // Almacena el nombre del comprador del boleto
    private int cantidadBoletos; // Almacena la cantidad total de boletos vendidos en la transacción
    private double importeTotal; // Almacena el importe total de la venta


    /**
     * Constructor de la clase Ticket que recibe el nombre
     * del comprador, la cantidad de boletos y el importe total como parámetros
     * @param comprador Es la persona que compra los boletos
     * @param cantidadBoletos Es la cantidad de boletos que compra el comprador
     * @param importeTotal Es el total de los boletos comprados
     */
    public Ticket(String comprador, int cantidadBoletos, double importeTotal) {
        this.comprador = comprador; // Asigna el nombre del comprador recibido al atributo comprador de la instancia
        this.cantidadBoletos = cantidadBoletos; // Asigna la cantidad de boletos recibida
        // al atributo cantidadBoletos de la instancia
        this.importeTotal = importeTotal; // Asigna el importe total recibido al atributo importeTotal de la instancia
    }

    /**
     * Método para mostrar el ticket de venta
     * muestra los detalles de la venta, incluyendo la cantidad
     * de boletos vendidos, el importe total de la venta, el nombre del
     * comprador y la cantidad de pasajeros adicionales
     * (se resta 1 de la cantidad total de boletos ya que el comprador se cuenta aparte).
     */
    public void mostrarTicket() {
        System.out.println("----------Ticket de venta----------");
        System.out.println("Cantidad de boletos: " + cantidadBoletos); // Muestra la cantidad de boletos vendidos
        System.out.println("Importe de venta: $" + importeTotal); // Muestra el importe total de la venta
        System.out.println("Nombre del comprador: " + comprador);  // Muestra el nombre del comprador
        System.out.println("Pasajeros adicionales: " + (cantidadBoletos - 1)); // Muestra la cantidad de pasajeros
        // adicionales (se resta 1 porque el comprador ya se cuenta)
        System.out.println("-------------------------------------------");
    }
}
