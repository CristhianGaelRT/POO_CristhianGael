package edu.gael_rivera.reto8.process;

public class Dividicion extends Resta{
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
