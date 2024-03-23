package edu.gael_rivera.reto8.ui;

import edu.gael_rivera.reto8.process.*;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorAritmetico operador = null; // Cambiamos el tipo a la clase abstracta

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
            case 1:
                operador = new Suma(); // Instanciamos Suma
                break;
            case 2:
                operador = new Resta(); // Instanciamos Resta
                break;
            case 3:
                operador = new Multiplicacion(); // Instanciamos Multiplicacion
                break;
            case 4:
                operador = new Dividicion(); // Instanciamos Dividicion
                break;
            case 5:
                operador = new Modulo(); // Instanciamos Modulo
                break;
            case 6:
                operador = new Potencia(); // Instanciamos Potencia
                break;
            case 7:
                operador = new Raiz(); // Instanciamos Raiz
                break;
            case 8:
                operador = new Logaritmo(); // Instanciamos Logaritmo
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        double num1, num2 = 0;

        // Solicitamos los números según la operación seleccionada
        if (opcion >= 1 && opcion <= 5) {
            System.out.println("Ingrese el primer número:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2 = scanner.nextDouble();
        } else if (opcion == 6) {
            System.out.println("Ingrese la base:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el exponente:");
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Ingrese el número:");
            num1 = scanner.nextDouble();
        }

        // Llamamos al método calcular de la instancia operador
        try {
            resultado = (double) operador.calcular((int) num1, (int) num2); // Casting a double
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
