package edu.gael_rivera.reto8.process;

/**
 * Clase concreta que implementa el módulo como una operación aritmética
 */
public class Modulo extends Resta {
    /**
     * Implementación del método calcular para el módulo
     * @param valor1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return Devuelve el resultado de la operacion modulo.
     */
    @Override
    public int calcular(int valor1, int num2){
        if (num2 == 0) throw new ArithmeticException("No pueder ser dividido sobre 0");
        int residuo = Math.abs(valor1);
        while (residuo >= Math.abs(num2)){
            residuo = super.calcular(residuo, num2);
        }
        return residuo;
    }
}
