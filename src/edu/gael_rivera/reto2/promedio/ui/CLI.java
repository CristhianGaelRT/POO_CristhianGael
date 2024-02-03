package edu.gael_rivera.reto2.promedio.ui;

import edu.gael_rivera.reto2.promedio.process.CalculadoraPromedio;
import java.util.Scanner;
public class CLI {
    /**
     * En esta clase es para toda la interaccion con el usuario.
     */
    public static void showMenu(){
        /**
         * En este metodo le damos el menu al usuario, a continuacion le damos
         * la bienbenida al usuario
         * se le deberá preguntar al usuario cuántas calificaciones desea capturar.
         */
        System.out.println("*******Bienvenido*******");
        System.out.println("Cuantas calificaciones desea capturar");
    }

    public static void launchApp(){
        /**
         * Es este metodo esta todas las interacciones con el usuario, se muestra
         * las intradas y salidad con el usuario.
         */
        // Creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Aqui se obtine el número de calificaciones que el usuario desea capturar
        System.out.println("Ingresa el número de calificaciones:");
        int n = sc.nextInt();
        // Crear un arreglo de tipo double con el tamaño del número de calificaciones
        // Se utiliza para almacenar las calificaciones ingresadas por el usuario
        double[] calificaciones = new double[n];
        // Se usara un bucle for para recorrer el arreglo y capturar cada
        // calificación del usuario
        for (int i = 0; i < n; i++) {
            // En este apartado se mostrara el número de calificación que se está capturando
            System.out.println("Capturando la calificación " + (i + 1));
            // Obtenemos la calificación del usuario y asignarla al arreglo
            calificaciones[i] = sc.nextDouble();
        }

        // Llamamos al método para calcular el promedio y mostrarselo al usuario
        double promedio = CalculadoraPromedio.calcularPromedio(calificaciones);
        System.out.println("El promedio del alumno es: " + promedio);
        // Cerramos el objeto Scanner y damos por finalizado el programa.
        sc.close();
    }
}