package edu.gael_rivera.reto8.process;

/**
 * Clase concreta que implementa la resta como una operación aritmética
 */
public class Resta extends OperadorAritmetico{
    /**
     * Implementación del método calcular para la resta
     * @param num1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return Devuelve el resultado de la operacion de una resta.
     */
    @Override
    public int calcular (int num1, int num2){
        return num1-num2;
    }
}
