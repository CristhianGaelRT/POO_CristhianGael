package edu.gael_rivera.reto7.ui;

import edu.gael_rivera.reto7.process.OperadorAritmetico;

import java.util.Scanner;

public class CLI {
    public static void iniciarCalculadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora");
        System.out.println("Por favor ingrese la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raíz cuadrada");
        System.out.println("8. Logaritmo");

        int opcion = scanner.nextInt();

        OperadorAritmetico operador = new OperadorAritmetico();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer número:");
                double num1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + operador.suma(num1, num2));
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                double num3 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double num4 = scanner.nextDouble();
                System.out.println("Resultado: " + operador.resta(num3, num4));
                break;
            case 3:
                System.out.println("Ingrese el primer número:");
                double num5 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double num6 = scanner.nextDouble();
                System.out.println("Resultado: " + operador.multiplicacion(num5, num6));
                break;
            case 4:
                System.out.println("Ingrese el primer número:");
                double num7 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double num8 = scanner.nextDouble();
                System.out.println("Resultado: " + operador.division(num7, num8));
                break;
            case 5:
                System.out.println("Ingrese el primer número:");
                double num9 = scanner.nextDouble();
                System.out.println("Ingrese el segundo número:");
                double num10 = scanner.nextDouble();
                System.out.println("Resultado: " + operador.modulo(num9, num10));
                break;
            case 6:
                System.out.println("Ingrese la base:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el exponente:");
                double exponente = scanner.nextDouble();
                System.out.println("Resultado: " + operador.potencia(base, exponente));
                break;
            case 7:
                System.out.println("Ingrese el número:");
                double num11 = scanner.nextDouble();
                System.out.println("Resultado: " + operador.raizCuadrada(num11));
                break;
            case 8:
                System.out.println("Ingrese el número:");
                double num12 = scanner.nextDouble();
                System.out.println("Ingrese la base:");
                double baseLog = scanner.nextDouble();
                System.out.println("Resultado: " + operador.logaritmo(num12, baseLog));
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
