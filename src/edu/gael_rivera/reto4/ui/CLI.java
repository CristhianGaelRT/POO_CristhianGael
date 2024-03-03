package edu.gael_rivera.reto4.ui;

import edu.gael_rivera.reto4.process.VentaBoletos;
import java.util.Scanner;

public class CLI {
    /**
     * Esta clase es para toda la interaccion con el usuario
     */
    public static void showMenu() {
        /**
         * En este metodo le damos el menu al usuario, a continuacion
         * se le debera mostrar al usuario varias opciones que debera seleccionar
         * desde la letra A a la S
         */
        Scanner scanner = new Scanner(System.in);
        String opcion;
        VentaBoletos ventaBoletos = new VentaBoletos();
        /**
         * Se ejecutará un bucle al menos una vez y continuará
         * ejecutándose mientras la opción ingresada por el usuario
         * no sea "S" (para finalizar el programa).
         */

        do {
            System.out.println("---Sistema de registro de ventas---");
            System.out.println("A. Realizar venta de boleto.");
            System.out.println("B. Mostrar datos de la lista de ventas.");
            System.out.println("S. Finalizar programa.");
            System.out.print("Elegir opción: ");
            opcion = scanner.nextLine();

            /**
             * Se utiliza una estructura switch para determinar qué acción
             * realizar basada en la opción elegida por el usuario.
             * Convertimos la opción a mayúsculas para hacer la
             * comparación de manera insensible a mayúsculas/minúsculas
             */

            switch (opcion.toUpperCase()) {
                case "A": // Si la opción es "A", realizamos una venta de boleto
                    ventaBoletos.registrarVenta();
                    break;
                case "B": // Si la opción es "B", mostramos los datos de la lista de ventas
                    ventaBoletos.mostrarDatos();
                    break;
                case "S": // Si la opción es "S", finalizamos el programa
                    System.out.println("----------Fin del programa----------");
                    break;
                default: // Si la opción no es válida, mostramos un mensaje de error
                    System.out.println("Opción inválida.");
            }
            /**
             * Continuamos el bucle mientras la opción ingresada no sea
             * "S" (ignorando mayúsculas/minúsculas)
             */
        } while (!opcion.equalsIgnoreCase("S"));
    }
}

