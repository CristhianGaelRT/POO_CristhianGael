package edu.gael_rivera.reto4.process;

import edu.gael_rivera.reto4.data.Ticket;
import java.util.ArrayList;
import java.util.Scanner;

public class VentaBoletos {
    private final double COSTO_BOLETO = 1250.50;
    private ArrayList<String> listaPasajeros = new ArrayList<>();

    public void registrarVenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar nombre del comprador:");
        String comprador = scanner.nextLine();
        System.out.println("Ingresar cantidad de pasajeros adicionales:");
        int cantidadPasajeros = scanner.nextInt();
        scanner.nextLine(); // Limpiamos el buffer

        listaPasajeros.add(comprador); // Añadimos el comprador a la lista de pasajeros

        for (int i = 0; i < cantidadPasajeros; i++) {
            System.out.println("Ingresar nombre del pasajero adicional " + (i+1) + ":");
            String pasajero = scanner.nextLine();
            listaPasajeros.add(pasajero); // Añadimos los pasajeros adicionales a la lista
        }

        double importeTotal = COSTO_BOLETO * (cantidadPasajeros + 1);
        Ticket ticket = new Ticket(comprador, cantidadPasajeros + 1, importeTotal);
        ticket.mostrarTicket();
    }

    public void mostrarDatos() {
        System.out.println("----------Lista de pasajeros----------");
        for (int i = 0; i < listaPasajeros.size(); i++) {
            String pasajero = listaPasajeros.get(i);
            System.out.println("Pasajero " + (i+1) + ": " + pasajero);
        }
        System.out.println("Total de pasajeros: " + listaPasajeros.size());
        double montoTotal = COSTO_BOLETO * listaPasajeros.size();
        System.out.println("Monto total de las ventas: $" + montoTotal);
        System.out.println("-----------------------------------------");
    }
}
