package edu.gael_rivera.reto7.ui;

import edu.gael_rivera.reto7.process.OperadorAritmetico;

import java.util.Scanner;

/**
 * Esta clase representa la interfaz de línea de comandos (CLI) para interactuar con la calculadora.
 */

public class CLI {
    /**
     * Método principal que inicia la CLI y permite al usuario realizar operaciones aritméticas.
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorAritmetico operador = new OperadorAritmetico();
        /**
         * Le mostramos al usuario el siguiente menu para la operacion que desee
         */

        System.out.println("******Bienvenido*****");
        // Menú de opciones
        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raíz");
        System.out.println("8. Logaritmo");

        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            // Casos para cada operación
            case 1:
                System.out.println("Ingrese el primer número:");
                double sumNum1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double sumNum2 = scanner.nextDouble();
                resultado = operador.suma(sumNum1, sumNum2);
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                double restaNum1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double restaNum2 = scanner.nextDouble();
                resultado = operador.resta(restaNum1, restaNum2);
                break;
            case 3:
                System.out.println("Ingrese el primer número:");
                double multNum1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double multNum2 = scanner.nextDouble();
                resultado = operador.multiplicacion(multNum1, multNum2);
                break;
            case 4:
                System.out.println("Ingrese el primer número:");
                double divNum1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double divNum2 = scanner.nextDouble();
                resultado = operador.division(divNum1, divNum2);
                break;
            case 5:
                System.out.println("Ingrese el primer número:");
                double modNum1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double modNum2 = scanner.nextDouble();
                resultado = operador.modulo(modNum1, modNum2);
                break;
            case 6:
                System.out.println("Ingrese la base:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el exponente:");
                double exponente = scanner.nextDouble();
                resultado = operador.potencia(base, exponente);
                break;
            case 7:
                System.out.println("Ingrese el número para calcular su raíz:");
                double raizNum = scanner.nextDouble();
                resultado = operador.raizCuadrada(raizNum);
                break;
            case 8:
                System.out.println("Ingrese el número para calcular su logaritmo:");
                double logNum = scanner.nextDouble();
                resultado = operador.logaritmo(logNum);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
