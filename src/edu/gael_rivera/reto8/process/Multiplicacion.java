package edu.gael_rivera.reto8.process;

/**
 * Clase concreta que implementa la multiplicación como una operación aritmética.
 */
public class Multiplicacion extends Suma {
    /**
     * Implementación del método calcular para la multiplicación
     * @param num1 Representa el primer valor de un numero entero
     * @param num2 Representa el segundo valor de un numero entero
     * @return Devuelve el retultado de la operacion de la multiplicacion
     */
    @Override
    public int calcular(int num1, int num2){
        int multiplicacion = 0;
        for (int i = 0; i < Math.abs(num2); i++){
            multiplicacion = super.calcular(multiplicacion, Math.abs(num1));
        }
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0 )){
            multiplicacion=-multiplicacion;
        }
        return multiplicacion;
    }
}
