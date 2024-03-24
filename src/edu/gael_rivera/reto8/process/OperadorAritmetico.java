package edu.gael_rivera.reto8.process;

/**
 *  Clase abstracta que define un operador aritmético genérico
 */

public abstract class OperadorAritmetico {
    /**
     * Método abstracto para calcular una operación aritmética
     * @param num1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return
     */
    public abstract int calcular(int num1, int num2);
}
