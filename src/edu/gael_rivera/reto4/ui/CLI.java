package edu.gael_rivera.reto4.ui;

import edu.gael_rivera.reto4.process.VentaBoletos;
import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        VentaBoletos ventaBoletos = new VentaBoletos();

        do {
            System.out.println("---Sistema de registro de ventas---");
            System.out.println("A. Realizar venta de boleto.");
            System.out.println("B. Mostrar datos de la lista de ventas.");
            System.out.println("S. Finalizar programa.");
            System.out.print("Elegir opción: ");
            opcion = scanner.nextLine();

            switch (opcion.toUpperCase()) {
                case "A":
                    ventaBoletos.registrarVenta();
                    break;
                case "B":
                    ventaBoletos.mostrarDatos();
                    break;
                case "S":
                    System.out.println("----------Fin del programa----------");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!opcion.equalsIgnoreCase("S"));
    }
}

