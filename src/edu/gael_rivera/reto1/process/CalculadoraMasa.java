package edu.gael_rivera.reto1.process;

/**
 * Esta clase sirve para realizar calculos de indice de masa corporal incluye los metodos:
 * calculo de masa corporal
 * Calculo de masa corporal madre
 * Calculo de metabolismo
 */
public class CalculadoraMasa {
    /**
     * este metodo sirve para calcular el indice de masa corporal
     * de una persona con base en su peso y estatura
     * @param altura estatura del paciente en centimetros
     * @param peso peso del paciente en kg
     * @return indice de masa corporal
     */
    public static double calcularMasaCorporal(double altura, double peso){
        double metros = altura /100;
        double imc = peso/Math.pow(metros,2);
        if(imc <= 18.50){
            System.out.println("Su peso es menor");
        }else if (imc <= 24.99) {
            System.out.println("Su peso es normal");

        } else if (imc <= 29.99) {
            System.out.println("Tiene sobrepeso");

        } else if (imc <= 34.99) {
            System.out.println("Tiene obecidad menor");

        } else if (imc <= 39.99) {
            System.out.println("Tiene obecidad media");

        } else if (imc <= 40.00) {
            System.out.println("Usted presenta obecidad morbida");

        }
        return imc;
    }
    public static double masaMagra(double peso, double altura, char sexo){
        double masaMagra = 0;
        if (sexo == 'f' || sexo == 'F'){
            masaMagra = 1.07*peso-148*Math.pow(peso, 2)/Math.pow(altura, 2);

        }else if (sexo == 'm' || sexo == 'M'){
            masaMagra = 1.10*peso-128*Math.pow(peso, 2)/Math.pow(altura, 2);
        }else{
            System.out.println("Error al ingresar sexo");
        }

    }
}
