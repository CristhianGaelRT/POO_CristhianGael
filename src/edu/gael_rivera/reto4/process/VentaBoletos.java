package edu.gael_rivera.reto4.process;
/**
 * Esta clase sirve para realizar calculos de la compra y venta de los boletos.
 * A continuacion importamos la clase Ticket del paquete data
 */

import edu.gael_rivera.reto4.data.Ticket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Es una clase que sirve para gestionar las operaciones relacionadas con la venta de boletos
 */
public class VentaBoletos {
    /**
     * Declaramos el precio constante del boleto.
     */
    private final double COSTO_BOLETO = 1250.50;
    /**
     * Se unsa ArrayList para almacenar los nombres de los pasajeros
     */
    private ArrayList<String> listaPasajeros = new ArrayList<>();

    /**
     * Este método se encarga de registrar una venta de boletos. Solicita al
     * usuario los datos necesarios para realizar la venta, como el nombre del
     * comprador y la cantidad de pasajeros adicionales. Luego, crea un objeto
     * Ticket con la información de la venta y lo muestra en la consola.
     */

    public void registrarVenta() {
        Scanner scanner = new Scanner(System.in); //lee la entrada del usuario desde la consola
        System.out.println("Ingresar nombre del comprador:"); //Pedimos al usuario que ingrese el nombre del comprador
        String comprador = scanner.nextLine(); // Leemos el nombre del comprador ingresado por el usuario
        System.out.println("Ingresar cantidad de pasajeros adicionales:"); // Pedimos al usuario que ingrese
        // la cantidad de pasajeros adicionales
        int cantidadPasajeros = scanner.nextInt(); // Leemos la cantidad de pasajeros adicionales
        // ingresada por el usuario
        scanner.nextLine(); // Limpiamos el buffer

        listaPasajeros.add(comprador); // Añadimos el comprador a la lista de pasajeros
        //Solicitamos los nombres de los pasajeros adicionales y los añadimos a la lista
        for (int i = 0; i < cantidadPasajeros; i++) {
            System.out.println("Ingresar nombre del pasajero adicional " + (i+1) + ":");
            String pasajero = scanner.nextLine();
            listaPasajeros.add(pasajero); // Añadimos los pasajeros adicionales a la lista
        }

        double importeTotal = COSTO_BOLETO * (cantidadPasajeros + 1); // Calculamos el importe total de la venta
        // Creamos un objeto Ticket con la información de la venta
        Ticket ticket = new Ticket(comprador, cantidadPasajeros + 1, importeTotal);
        ticket.mostrarTicket(); // Mostramos el ticket de venta
    }

    /**
     * Este método muestra la lista de pasajeros registrados, enumerándolos uno por uno.
     * Luego, muestra el total de pasajeros registrados y calcula el monto
     * total de las ventas multiplicando el número de pasajeros por el costo del boleto.
     * Finalmente, muestra el monto total de las ventas.
     */

    public void mostrarDatos() {
        // Mostramos la lista de pasajeros registrados
        System.out.println("----------Lista de pasajeros----------");
        for (int i = 0; i < listaPasajeros.size(); i++) {
            String pasajero = listaPasajeros.get(i);
            System.out.println("Pasajero " + (i+1) + ": " + pasajero);
        }
        // Mostramos el total de pasajeros registrados y el monto total de las ventas
        System.out.println("Total de pasajeros: " + listaPasajeros.size());
        double montoTotal = COSTO_BOLETO * listaPasajeros.size();
        System.out.println("Monto total de las ventas: $" + montoTotal);
        System.out.println("-----------------------------------------");
    }
}
