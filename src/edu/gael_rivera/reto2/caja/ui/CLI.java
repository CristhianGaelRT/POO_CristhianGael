package edu.gael_rivera.reto2.caja.ui;

import edu.gael_rivera.reto2.caja.process.CompraVenta;

import java.util.Scanner;

public class CLI {
    /**
     * En esta clase es para toda la interaccion con el usuario.
     */
    public static void showMenu() {
        /**
         * Este método muestra un menú al usuario con
         * las opciones disponibles para interactuar con el sistema.
         * Proporciona una descripción clara de cada opción, lo que facilita
         * al usuario entender las acciones disponibles.
         */
        System.out.println("*******Bienvenido*******");
        System.out.println("Escribe el numero de la opcion que desees");
        System.out.println("1. Comprar cajas de papel ");
        System.out.println("2. Vender cajas de papel ");
        System.out.println("3. Mostrar reporte ");
        System.out.println("4. Salir del programa");
    }

    public static void launchApp() {
        /**
         * Este método inicia la aplicación y gestiona el flujo de interacción con el usuario.
         * Utiliza un bucle do-while para mostrar continuamente el menú y recibir la entrada
         * del usuario hasta que decida salir del programa.
         * Utilizamos un objeto Scanner para leer la entrada del usuario desde la consola.
         * Usamos un switch-case para manejar las diferentes opciones seleccionadas por el usuario.
         */
        Scanner sc = new Scanner(System.in);
        // Creamos un objeto de la clase Scanner para leer la entrada del usuario
        double numCajasCompra = 0;
        double numCajasVenta = 0;
        double costoCaja = 0;
        double monto = 0;
        double ingresos = 0;
        double egresos = 0;
        int seleccion = 0;
        do {
            showMenu();
            seleccion = sc.nextInt();
            switch (seleccion) {
                /**
                 * Cuando el usuario elige comprar (case 1) o vender (case 2) cajas de papel,
                 * se solicita al usuario que ingrese la cantidad de cajas y su costo respectivamente.
                 * Llama a los métodos comprarcajasdepapel() y vendercajaspapel()
                 * del paquete edu.gael_rivera.reto2.process.CompraVenta para realizar las transacciones.
                 * Muestra el resultado de la compra o venta al usuario.
                 */
                case 1:
                    System.out.println("Cuantas cajas de papel deseas comprar");
                    numCajasCompra = sc.nextDouble();
                    System.out.println("Indique el costo de las cajas a comprar");
                    costoCaja = sc.nextDouble();
                    monto = CompraVenta.comprarcajasdepapel(numCajasCompra, costoCaja);
                    System.out.println("La compra realizada por " + numCajasCompra + " cajas al costo " + costoCaja + " = " + monto);
                    break;
                case 2:
                    System.out.println("Cuantas cajas de papel deseas vender");
                    numCajasVenta = sc.nextDouble();
                    System.out.println("Indique el costo de cajas a vender");
                    costoCaja = sc.nextDouble();
                    monto = CompraVenta.vendercajaspapel(numCajasVenta, costoCaja);
                    System.out.println("La venta realizada por " + numCajasVenta + " cajas al precio " + costoCaja + " = " + monto);
                    break;
                case 3:
                    /**
                     * Cuando el usuario elige mostrar el reporte (case 3), se muestra
                     * un resumen de las transacciones realizadas hasta el momento.
                     * Muestra la cantidad total de ventas, la cantidad total de compras,
                     * los ingresos generados por ventas, los egresos generados por compras
                     * y el monto actual en la caja.
                     * Utiliza los datos almacenados durante las operaciones de compra y venta para generar el reporte.
                     */
                    System.out.println("Reporte del sistema de control de cajas de papel");
                    System.out.println("La cantidad total de ventas es: " + numCajasVenta);
                    System.out.println("La cantidad total de compras es: " + numCajasCompra);
                    ingresos = CompraVenta.vendercajaspapel(numCajasVenta, costoCaja);
                    egresos = CompraVenta.comprarcajasdepapel(numCajasCompra, costoCaja);
                    System.out.println("Los ingresos generados por ventas son: " + ingresos);
                    System.out.println("Los egresos generados por compras son: " + egresos);
                    System.out.println("El monto en la caja es: " + (ingresos - egresos));
                    break;
                case 4:
                    /**
                     * Cuando el usuario elige salir (case 4), muestra un mensaje indicando
                     * que el programa está saliendo y finaliza la ejecución del programa.
                     */
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor selecciona una opción válida.");
            }
        } while (seleccion != 4);
    }
}



