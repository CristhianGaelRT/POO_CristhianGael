package edu.gael_rivera.reto8.process;

public class Potencia extends Multiplicacion {
    public int calcular(int valor1,int num2){
        if (num2 < 0) throw new ArithmeticException("No utilizes exponentes negativos -");
        int potencia = 1;
        for (int i = 0; i < Math.abs(num2); i++){
            potencia = super.calcular(potencia, Math.abs(valor1));

        }
        int residuo = Math.abs(num2);
        while (residuo >= 2){
            residuo -= 2;

        }
        if (valor1 < 0 && residuo != 0){
            potencia = -potencia;
        }
        return potencia;
    }
}
