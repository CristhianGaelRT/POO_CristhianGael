package edu.gael_rivera.reto4.data;

public class Ticket {
    private String comprador;
    private int cantidadBoletos;
    private double importeTotal;

    public Ticket(String comprador, int cantidadBoletos, double importeTotal) {
        this.comprador = comprador;
        this.cantidadBoletos = cantidadBoletos;
        this.importeTotal = importeTotal;
    }

    public void mostrarTicket() {
        System.out.println("----------Ticket de venta----------");
        System.out.println("Cantidad de boletos: " + cantidadBoletos);
        System.out.println("Importe de venta: $" + importeTotal);
        System.out.println("Nombre del comprador: " + comprador);
        System.out.println("Pasajeros adicionales: " + (cantidadBoletos - 1));
        System.out.println("-------------------------------------------");
    }
}
