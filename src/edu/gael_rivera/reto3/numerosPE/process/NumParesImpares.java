//Declaración del paquete y las importaciones
package edu.gael_rivera.reto3.numerosPE.process;

/**
 * Esta clase esmpara todos los calculos y arreglos
 */
//La clase NumParesImpares tiene tres variables de instancia
public class NumParesImpares {
    private int[][] array;
    private int rows;
    private int cols;

    /**
     * Este constructor inicializa las variables de instancia rows
     * y cols con los valores proporcionados como argumentos. Luego,
     * inicializa la matriz array como una matriz de tamaño rows x cols.
     * @param rows Representa el numero de filas de los numero
     * @param cols Representa el numero de columnas que el usuario desee
     * el array Es una matriz que almacenará los números aleatorios.
     */
    public NumParesImpares(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows][cols];
    }

    /**
     * Este método genera valores aleatorios en cada celda de la matriz.
     * Utiliza un bucle anidado para recorrer todas las filas y columnas
     * de la matriz, y asigna a cada celda un valor aleatorio
     * entre 1 y 100 utilizando la función Math.random().
     */
    public void generateRandomArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
    }

    /**
     * Este método muestra la matriz generada en la consola.
     * Utiliza bucles for anidados para recorrer todas las filas y
     * columnas de la matriz e imprimir los valores de cada celda.
     */
    public void displayArray() {
        System.out.println("Matriz generada:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }

    /**
     * Este método calcula y muestra el conteo de números pares
     * e impares por fila y columna en la matriz.
     * Utiliza bucles for para recorrer cada fila y columna de la
     * matriz y contar los números pares e impares en cada una.
     * Luego, imprime los resultados en la consola.
     */
    public void displayCounts() {
        System.out.println("Conteo de números pares e impares:");
        for (int i = 0; i < rows; i++) {
            int evenCount = 0, oddCount = 0;
            for (int j = 0; j < cols; j++) {
                if (array[i][j] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
            System.out.println("Cantidad de pares: " + evenCount + ", impares: " + oddCount + " en la fila " + (i + 1));
        }

        //Su propósito es contar la cantidad de números pares e impares en cada columna de la matriz array.
        for (int j = 0; j < cols; j++) {
            int evenCount = 0, oddCount = 0;
            for (int i = 0; i < rows; i++) {
                if (array[i][j] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
            System.out.println("Cantidad de pares: " + evenCount + ", impares: " + oddCount + " en la columna " + (j + 1));
        }
        System.out.println("------------------------");
    }

    /**
     * Este método calcula y muestra la suma total de todos los valores en la matriz.
     * Utiliza bucles for anidados para recorrer todas las filas y columnas
     * de la matriz y sumar los valores de cada celda.
     * Luego, imprime el resultado en la consola.
     */
    public void displaySum() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("La suma total de los valores del vector es: " + sum);
    }
}
