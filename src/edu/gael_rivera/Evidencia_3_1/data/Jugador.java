package edu.gael_rivera.Evidencia_3_1.data;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private char simbolo;
    private int victorias;

    public Jugador() {
        this.nombre = "";
        this.simbolo = ' ';
        this.victorias = 0;
    }

    public void inicializar(String nombre) {
        this.nombre = nombre;
    }

    public void elegirSimbolo(Scanner scanner) {
        System.out.println("Choose your symbol / Elige tu símbolo:");
        this.simbolo = scanner.next().charAt(0);
    }

    public void marcarCasilla(int fila, int columna, char[][] tablero) {
        tablero[fila][columna] = simbolo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public char obtenerSimbolo() {
        return simbolo;
    }

    public void aumentarVictorias() {
        victorias++;
    }

    public int obtenerVictorias() {
        return victorias;
    }
}
