package edu.gael_rivera.reto8.process;

/**
 * Clase concreta que implementa la suma como una operación aritmética
 */
public class Suma extends OperadorAritmetico {
    /**
     * Implementación del método calcular para la suma
     * @param num1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return Devuelve el resultado de una operacion de una suma
     */
    @Override
    public int calcular (int num1, int num2){
        return num1+num2;
    }
}

