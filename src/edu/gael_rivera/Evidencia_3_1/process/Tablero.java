package edu.gael_rivera.Evidencia_3_1.process;

import java.util.Random;

public class Tablero {
    private char[][] matriz;
    private String ganador;

    public Tablero() {
        this.matriz = new char[3][3];
        this.ganador = "";
        inicializar();
    }

    public void inicializar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    public boolean verificarCasilla(int fila, int columna) {
        return matriz[fila][columna] == ' ';
    }

    public void marcarCasilla(int fila, int columna, char simbolo) {
        matriz[fila][columna] = simbolo;
    }

    public void marcarCasillaRandom(char simbolo) {
        Random rand = new Random();
        int fila, columna;
        do {
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
        } while (!verificarCasilla(fila, columna));
        matriz[fila][columna] = simbolo;
    }

    public boolean verificarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != ' ') {
                ganador = String.valueOf(matriz[i][0]);
                return true;
            }
        }
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            if (matriz[0][j] == matriz[1][j] && matriz[1][j] == matriz[2][j] && matriz[0][j] != ' ') {
                ganador = String.valueOf(matriz[0][j]);
                return true;
            }
        }
        // Verificar diagonales
        if ((matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != ' ') ||
                (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != ' ')) {
            ganador = String.valueOf(matriz[1][1]);
            return true;
        }
        // Verificar empate
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == ' ') {
                    empate = false;
                    break;
                }
            }
            if (!empate) break;
        }
        if (empate) {
            ganador = "Empate";
            return true;
        }
        return false;
    }

    public String obtenerGanador() {
        return ganador;
    }
}
