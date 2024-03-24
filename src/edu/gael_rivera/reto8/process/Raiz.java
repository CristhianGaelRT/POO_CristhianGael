package edu.gael_rivera.reto8.process;

/**
 * Clase concreta que implementa la raíz cuadrada como una operación aritmética
 */
public class Raiz extends OperadorAritmetico {
    /**
     * Implementación del método calcular para la raíz cuadrada
     * @param num1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return Devuelve el resultado del calculo de una raiz.
     */
    @Override
    public int calcular(int num1, int num2){
        int resultado = 0;
        int i = 1;

        while (num1 > 0){
            num1 -= i;
            i += 2;
            if (num1 >= 0) resultado++;
        }
        return resultado;
    }
}
