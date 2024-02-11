//Declaración del paquete y las importaciones
package edu.gael_rivera.reto3.diccionario.ui;

import edu.gael_rivera.reto3.diccionario.process.Diccionario;
import java.util.Scanner;

public class CLI {
    /**
     * Esta clase es para toda la interaccion con el usuario
     * @param diccionario Es el conjunto de palabras guardadas
     * con las definiciones de las palabras
     */
    public static void mostrarMenu(Diccionario diccionario) {
        /**
         * En este metodo le damos el menu al usuario, a continuacion
         * se le deberá mostrar al usuario varias opciones para la busqueda del diccionario
         */
        //Inicialización del Scanner y declaración de variables
        Scanner scanner = new Scanner(System.in);
        String opcion;
        /**
         *  Se ejecutará un bucle al menos una vez y continuará
         *  ejecutándose mientras la opción ingresada por el usuario
         *  no sea "S" (para finalizar el programa).
         */
        do {
            //Se mustra el menú y lee la opción del usuario:
            System.out.println("-----Diccionario-----");
            System.out.println("A. Lista de palabras del diccionario.");
            System.out.println("B. Buscar palabra en el diccionario.");
            System.out.println("C. Detalle del diccionario.");
            System.out.println("S. Finalizar programa.");
            System.out.print("Elegir opcion: ");
            opcion = scanner.nextLine();

            /**
             * Se utiliza una estructura switch para determinar qué acción
             * realizar basada en la opción elegida por el usuario.
             */
            switch (opcion.toUpperCase()) {
                case "A":
                    /**
                     * La opción "A", se llama al método listarPalabras del objeto Diccionario.
                     */
                    diccionario.listarPalabras();
                    break;
                case "B":
                    /**
                     * Se pide al usuario que ingrese una palabra y luego
                     * se llama al método buscarSignificado del objeto Diccionario.
                     */
                    diccionario.listarPalabras();
                    System.out.print("Palabra a mostrar significado: ");
                    String palabra = scanner.nextLine();
                    String significado = diccionario.buscarSignificado(palabra);
                    System.out.printf("Significado: %s%n", significado);
                    break;
                case "C":
                    /**
                     * Se llama al método detalleDiccionario del objeto Diccionario.
                     */
                    diccionario.detalleDiccionario();
                    break;
                case "S":
                    /**
                     * Se imprime un mensaje de finalización.
                     */
                    System.out.println("-----Fin del programa v1.1-----");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
          //Se utiliza para crear un bucle que continuará ejecutándose
            // mientras la variable opcion no sea igual a "S"
        } while (!opcion.equalsIgnoreCase("S"));
    }
}

