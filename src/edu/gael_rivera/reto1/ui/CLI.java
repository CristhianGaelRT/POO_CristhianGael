package edu.gael_rivera.reto1.ui;

import edu.gael_rivera.reto1.process.CalculadoraMasa;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("Bienvenido");
        System.out.println("Escribe el numero de la opcion que desees");
        System.out.println("1. Indice de masa corporal");
        System.out.println("2. Maso corporal magra");
        System.out.println("3. Metabolismo basal");
        System.out.println("4. Salir");
        System.out.println("*********************");
    }
    public static void launchApp(){
        Scanner sc = new Scanner(System.in);
        showMenu();
        int seleccion = 0;
        seleccion = sc.nextInt();
        if (seleccion == 1){
            System.out.println("Ingrese su altura en centimetros");
            double altura = sc.nextDouble();
            System.out.println("Ingrese su peso en kilogramos");
            double peso = sc.nextDouble();
            double imc = CalculadoraMasa.calcularMasaCorporal(altura, peso);
            System.out.println("Tu IMC es: "+ imc);
        }else if(seleccion == 2);{
            char sexo = sc.next().charAt(0);

        }
    }
}
