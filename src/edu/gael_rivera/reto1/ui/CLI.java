package edu.gael_rivera.reto1.ui;

import edu.gael_rivera.reto1.process.CalculadoraMasa;

import java.util.Scanner;

public class CLI {
    /**
     * En esta clase es para toda la interaccion con el usuario.
     */
    public static void showMenu(){
        /**
         * En este metodo le damos el menu al usuario, enumeramos
         * las opciones del 1 al 4 y el usuario tendra que seleccionar
         * a sus necesidades requeridas.
         */
        System.out.println("Bienvenido");
        System.out.println("Escribe el numero de la opcion que desees");
        System.out.println("1. Indice de masa corporal");
        System.out.println("2. Maso corporal magra");
        System.out.println("3. Metabolismo basal");
        System.out.println("4. Salir");
        System.out.println("*********************");
    }
    public static void launchApp(){
        /**
         * En este metodo interactuamos con el usuario si selecciona opcion 1 le pedimos
         * que ingrese su estatura a centimetros, su peso a kg y ya obtenido los datos
         * se podra ejecutar la calculadora del indice de masa corporal.
         * Si selecciona la opcion 2 le pedimos al usuario que ingrese lo mismo que ahora tambien
         * ingrese su sexo con una sola letra ya se a "M o F" dependiendo del sexo.
         * Si selecciona la opcion 3 pasa lo mismo y ademas del sexo le pedimos que ingrese
         * su edad en enteros.
         * Si selecciona la opcion 4 se finlalizara el programa.
         * Al seleccionar cualquiera de las opcciones el programa sae ejecutara en base a lo esperado.
         */
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
        }else if(seleccion == 2){
            System.out.println("Ingresa tu sexo");
            char sexo = sc.next().charAt(0);
            System.out.println("Ingrese peso en kilogramos");
            double peso = sc.nextDouble();
            System.out.println("Ingrese altura en centimetros");
            double altura = sc.nextDouble();
            double masaMasaMagra = CalculadoraMasa.masaMagra(sexo, peso, altura);
            System.out.println("Tu masa magra es: "+ masaMasaMagra);

        }else if(seleccion == 3){
            System.out.println("Ingresa tu sexo");
            char sexo = sc.next().charAt(0);
            System.out.println("Ingresa el peso en kilogramos");
            double peso = sc.nextDouble();
            System.out.println("Ingresa la altura en centimetros");
            double altura = sc.nextDouble();
            System.out.println("Ingresa tu edad");
            int edad = sc.nextInt();
            double metabolismoBasal = CalculadoraMasa.metabolismoBasal(sexo, peso, altura, edad);
            System.out.println("Tu metabolismo basal es: "+ metabolismoBasal);
        } else if (seleccion == 4) {
            System.out.println("Finalizo el programa, Gracias por su atención");
            System.exit(0);
        }
    }
}
