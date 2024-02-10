// Clase NumParesImpares
package edu.gael_rivera.reto3.numerosPE.process;

public class NumParesImpares {
    private int[][] array;
    private int rows;
    private int cols;

    public NumParesImpares(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows][cols];
    }

    public void generateRandomArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
    }

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
