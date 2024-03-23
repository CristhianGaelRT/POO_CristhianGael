package edu.gael_rivera.reto8.process;

public class Multiplicacion extends Suma {
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
