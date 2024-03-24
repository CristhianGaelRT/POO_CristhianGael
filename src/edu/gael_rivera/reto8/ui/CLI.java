package edu.gael_rivera.reto8.ui;

import edu.gael_rivera.reto8.process.*;

import java.util.Scanner;
/** * Esta clase representa la interfaz de línea de
 *  comandos (CLI) para interactuar con * el usuario. */

public class CLI {
    /**
     * Método principal que inicia la CLI, dando la bienvenida dandole la opcion de escoger
     * un idioma entre español ingles y permite al usuario realizar operaciones aritméticas.
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorAritmetico operador = null; // Definimos una referencia a OperadorAritmetico

        System.out.println("******Welcome*****"); // Mensaje de bienvenida
        System.out.println("Select your language:"); // Seleccionar idioma
        System.out.println("1. Español");
        System.out.println("2. English");

        int idioma = scanner.nextInt(); // Se lee el idioma seleccionado

        Idioma language;
        if (idioma == 1) {
            language = new Esp(); // Instanciamos el idioma español
        } else if (idioma == 2) {
            language = new Ing(); // Instanciamos el idioma inglés
        } else {
            System.out.println("Invalid language choice."); // Opción de idioma inválida
            return;
        }

        System.out.println(language.getBienvenido()); // Mostrar mensaje de bienvenida en el idioma seleccionado
        System.out.println(language.getMenuOperaciones()); // Mostrar menú de operaciones en el idioma seleccionado

        int opcion = scanner.nextInt(); // Se lee la opción seleccionada por el usuario

        double resultado = 0; // Variable para almacenar el resultado de la operación

        switch (opcion) {
            case 1:
                operador = new Suma(); // Instanciamos Suma para realizar una suma
                break;
            case 2:
                operador = new Resta(); // Instanciamos Resta para realizar una resta
                break;
            case 3:
                operador = new Multiplicacion(); // Instanciamos Multiplicacion para realizar una multiplicación
                break;
            case 4:
                operador = new Dividicion(); // Instanciamos Dividicion para realizar una división
                break;
            case 5:
                operador = new Modulo(); // Instanciamos Modulo para realizar una operación de módulo
                break;
            case 6:
                operador = new Potencia(); // Instanciamos Potencia para realizar una operación de potencia
                break;
            case 7:
                operador = new Raiz(); // Instanciamos Raiz para realizar una operación de raíz
                break;
            case 8:
                operador = new Logaritmo(); // Instanciamos Logaritmo para realizar una operación de logaritmo
                break;
            default:
                System.out.println(language.getOpcionNoValida()); // Opción no válida seleccionada
                return;
        }

        double num1, num2 = 0; // Variables para almacenar los números de entrada

        if (opcion >= 1 && opcion <= 5) {
            System.out.println(language.getIngresePrimerNumero()); // Solicitar el primer número
            num1 = scanner.nextDouble(); // Leer el primer número
            System.out.println(language.getIngreseSegundoNumero()); // Solicitar el segundo número
            num2 = scanner.nextDouble(); // Leer el segundo número
        } else if (opcion == 6) {
            System.out.println(language.getIngreseBase()); // Solicitar la base para la potencia
            num1 = scanner.nextDouble(); // Leer la base
            System.out.println(language.getIngreseExponente()); // Solicitar el exponente
            num2 = scanner.nextDouble(); // Leer el exponente
        } else {
            System.out.println(language.getIngreseNumero()); // Solicitar un número
            num1 = scanner.nextDouble(); // Leer el número
        }

        try {
            resultado = operador.calcular((int) num1, (int) num2); // Calcular el resultado de la operación
            System.out.println(language.getElResultadoEs() + resultado); // Mostrar el resultado
        } catch (ArithmeticException e) { // Captura de excepciones aritméticas
            System.out.println(e.getMessage()); // Mostrar mensaje de error
        }
    }
}
