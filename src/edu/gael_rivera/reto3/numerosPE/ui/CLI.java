//Declaración del paquete y las importaciones
package edu.gael_rivera.reto3.numerosPE.ui;

import edu.gael_rivera.reto3.numerosPE.process.NumParesImpares;

import java.util.Scanner;

public class CLI {
    /**
     * Esta clase es para toda la interaccion con el usuario
     */
    public static void showMenu() {
        /**
         * Se crea un objeto Scanner llamado scanner
         * para leer la entrada del usuario desde la consola.
         */
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        /**
         * Se solicita al usuario que ingrese la cantidad de filas y columnas
         * para la matriz de números. Esto se realiza dentro de un bucle do-while.
         */
        do {
            System.out.print("Indica la cantidad de filas: ");
            rows = scanner.nextInt();
            System.out.print("Indica la cantidad de columnas: ");
            cols = scanner.nextInt();
        } while (rows <= 0 || cols <= 0 || rows != cols);

        /**
         * Una vez que se obtienen filas y columnas válidas,
         * se crea un objeto NumParesImpares pasando estos
         * valores como argumentos al constructor.
         */
        NumParesImpares numParesImpares = new NumParesImpares(rows, cols);
        numParesImpares.generateRandomArray();
        numParesImpares.displayArray();
        numParesImpares.displayCounts();
        numParesImpares.displaySum();
    }
}
