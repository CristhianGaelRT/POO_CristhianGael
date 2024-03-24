package edu.gael_rivera.reto8.process;

/**
 * Clase concreta que implementa la división como una operación aritmética
 */
public class Dividicion extends Resta{
    /**
     * Implementación del método calcular para la división
     * @param num1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return Devuelve el resultado de un la operacion de una divicion.
     */
    @Override
    public int calcular(int num1, int num2){
        int division = 0;
        int residuo = Math.abs(num1);
        while (residuo >= Math.abs(num2)){
            residuo = super.calcular(residuo, num2);
            division++;

        if (num2 == 0){
            throw new ArithmeticException("No se puede dividir entre cero");
            }
        }
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)){
            division = -division;
        }
        return division;
    }
}
