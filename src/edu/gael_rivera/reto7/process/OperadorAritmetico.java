package edu.gael_rivera.reto7.process;

/**
 * Esta clase contiene los métodos para realizar operaciones aritméticas básicas.
 */
public class OperadorAritmetico {
    /**
     * Calcula la suma de dos números.
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return La suma de los dos números.
     */
    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    /**
     * Calcula la resta entre dos números.
     * @param num1 El número del que se resta.
     * @param num2 El número que se resta.
     * @return La diferencia entre num1 y num2.
     */

    public double resta(double num1, double num2) {
        return num1 - num2;
    }
    /**
     * Calcula el producto de dos números.
     * @param num1 El primer factor.
     * @param num2 El segundo factor.
     * @return El producto de los dos números.
     */

    public double multiplicacion(double num1, double num2) {
        // Implementación del algoritmo de multiplicación
        double resultado = 0;
        boolean negativo = false;
        if (num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) {
            negativo = true;
        }
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        for (int i = 0; i < num2; i++) {
            resultado = suma(resultado, num1);
        }
        if (negativo) {
            resultado = -resultado;
        }
        return resultado;
    }
    /**
     * Calcula la división de dos números.
     * @param num1 El dividendo.
     * @param num2 El divisor.
     * @return El cociente de la división num1 / num2.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */

    public double division(double num1, double num2) {
        // Implementación del algoritmo de división
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double resultado = 0;
        boolean negativo = false;
        if (num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) {
            negativo = true;
        }
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num1 >= num2) {
            num1 = resta(num1, num2);
            resultado = suma(resultado, 1);
        }
        if (negativo) {
            resultado = -resultado;
        }
        return resultado;
    }
    /**
     * Calcula el módulo de dos números.
     * @param num1 El dividendo.
     * @param num2 El divisor.
     * @return El módulo de la división num1 % num2.
     * @throws ArithmeticException Si se intenta calcular el módulo por cero.
     */

    public double modulo(double num1, double num2) {
        // Implementación del algoritmo de módulo
        if (num2 == 0) {
            throw new ArithmeticException("No se puede calcular el módulo por cero");
        }
        double resultado = resta(num1, multiplicacion(division(num1, num2), num2));
        return resultado;
    }
    /**
     * Calcula la potencia de un número a un exponente dado.
     * @param base La base de la potencia.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de la operación base^exponente.
     */

    public double potencia(double base, double exponente) {
        // Implementación del algoritmo de potencia
        double resultado = 1;
        boolean negativo = false;
        if (exponente < 0) {
            negativo = true;
            exponente = -exponente;
        }
        for (int i = 0; i < exponente; i++) {
            resultado = multiplicacion(resultado, base);
        }
        if (negativo) {
            resultado = division(1, resultado);
        }
        return resultado;
    }
    /**
     * Calcula la raíz cuadrada de un número mediante el método de aproximaciones sucesivas.
     * @param num El número del que se calcula la raíz cuadrada.
     * @return La raíz cuadrada de num.
     * @throws ArithmeticException Si se intenta calcular la raíz de un número negativo.
     */

    public double raizCuadrada(double num) {
        // Implementación del algoritmo de raíz cuadrada
        if (num < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }

        double guess = num;
        double precision = 0.0001;

        // Calcular la raíz cuadrada mediante aproximaciones sucesivas
        while (multiplicacion(guess, guess) - num > precision) {
            guess = division(suma(guess, division(num, guess)), 2);
        }

        return guess;
    }
    /**
     * Calcula el logaritmo natural de un número mediante la serie de Taylor.
     * @param num El número del que se calcula el logaritmo.
     * @return El logaritmo natural de num.
     * @throws ArithmeticException Si se intenta calcular el logaritmo de cero o un número negativo.
     */

    public double logaritmo(double num) {
        // Implementación del algoritmo de logaritmo
        if (num <= 0) {
            throw new ArithmeticException("No se puede calcular el logaritmo de cero o un número negativo");
        }
        double resultado = 0;
        double x = resta(num, 1);
        double n = 1;

        // Calcular el logaritmo utilizando la serie de Taylor para ln(x)
        while (Math.abs(x) > 0.000001) {
            resultado = suma(resultado, division(x, n));
            x = multiplicacion(resta(num, 1), x);
            x = division(x, num); // Dividir por el número original
            n = suma(n, 1);
        }

        return resultado;
    }
}