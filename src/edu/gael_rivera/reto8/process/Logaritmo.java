package edu.gael_rivera.reto8.process;

public class Logaritmo extends Multiplicacion {
    @Override
    public int calcular(int num1, int num2){
        if (num1 <= 1 || num2 <= 0) throw new ArithmeticException(" El logaritmo no esta definido" +
                "para los valores proporcionados");
        int logaritmo = 1;
        int multiplicacion;
        int potenciaBase = num2;

        while (potenciaBase <= num1) {
            multiplicacion = super.calcular(potenciaBase, num2);
            potenciaBase += multiplicacion;
            logaritmo++;

        }
        int potencia = 1;
        for (int i = 0; i < logaritmo; i++){
            potencia = super.calcular(potencia, num2);

        }
        if (potencia != num1){
            System.out.println("Este logaritmo es un aproximado del resultado"+
                    "entero mas que se aproxima a su logaritmo");
            System.out.println("El argumento exato que se cumple este logaritmo es: " + potencia);
        }
        return logaritmo;
    }
}
