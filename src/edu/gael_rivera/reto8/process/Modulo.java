package edu.gael_rivera.reto8.process;

public class Modulo extends Resta {
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
