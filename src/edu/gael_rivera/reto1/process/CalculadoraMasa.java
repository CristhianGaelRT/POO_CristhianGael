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
        /**
         *este metodo nos indica que a traves de un if y else if
         * ponemos los casos posibles u condiciones a cumplir
         * para calcular el indice masa corporal, ademas que en la
         * formula especificamos que las variales se resolveran matematicamente
         * a traves de Math.pow
         */
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

    /**
     * Este metodo sirve para calcular la masa magra de una
     * persona con base a su sexo, peso, altura
     * @param sexo sexo del paciente si es masculino "m || M" o femenino "f || F"
     * @param peso peso del paciente en kg
     * @param altura estatura del paciente en centimetros
     * @return masa magra
     */
    public static double masaMagra(char sexo, double peso, double altura){
        /**
         * Este metodo nos muestra que a traves de nuestros datos ya
         * guardados como lo es el peso y la altura, ahora solo pedimos
         * al usuario que ingrese su sexo y atraves de un if y else if
         * dependiendo del caso hacemos las operaciones con Math.pow
         * para asi saber cual es la masa magra dependiendo del sexo del usuario
         */
        double masaMagra = 0;
        if (sexo == 'f' || sexo == 'F'){
            masaMagra = 1.07*peso-148*Math.pow(peso, 2)/Math.pow(altura, 2);

        }else if (sexo == 'm' || sexo == 'M'){
            masaMagra = 1.10*peso-128*Math.pow(peso, 2)/Math.pow(altura, 2);
        }else{
            System.out.println("Error al ingresar sexo");
        }

        return masaMagra;
    }

    /**
     * Este metodo sirve para calcular el metabolismo basal de una
     * persona con base a su sexo, peso, altura y edad
     * @param sexo sexo del paciente si es masculino "m || M" o femenino "f || F"
     * @param peso peso del paciente en kg
     * @param altura estatura del paciente en centimetros
     * @param edad pide la edad del usuario en un valor entero
     * @return metabolismo basal
     */
    public static double metabolismoBasal(char sexo, double peso, double altura, int edad){
        /**
         * En este metodo usamos solo operaciones basicas para dar el
         * resultado solicitado del usuarios, usamos el if y else if para calcular
         * las condicion es o casos a especificar
         */
        double metabolismoBasal = 0;
        if (sexo == 'f' || sexo == 'F'){
            metabolismoBasal = 655.1 + (9.563 * peso)+(1.85 * altura)-(4.676 * edad);

        } else if (sexo == 'm' || sexo == 'M') {
            metabolismoBasal = 66.5 + (13.75 * peso)+(5.003 * altura)-(6.775 * edad);

        }else {
            System.out.println("Error al ingresar sexo");
        }

        return metabolismoBasal;
    }
}
