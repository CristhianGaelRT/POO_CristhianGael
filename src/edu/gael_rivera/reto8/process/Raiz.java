package edu.gael_rivera.reto8.process;

public class Raiz extends OperadorAritmetico {
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
