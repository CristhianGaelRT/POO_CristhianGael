package edu.gael_rivera.Evidencia_3_1.ui;

import java.util.Scanner;

public class CLI {
    private Scanner scanner;

    public CLI() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenuIdioma() {
        System.out.println("Select language / Selecciona idioma:");
        System.out.println("1. English");
        System.out.println("2. Español");
        return scanner.nextInt();
    }

    public int mostrarMenuJuego() {
        System.out.println("Select game mode / Selecciona modo de juego:");
        System.out.println("1. 1 Player / 1 Jugador");
        System.out.println("2. 2 Players / 2 Jugadores");
        return scanner.nextInt();
    }

    public String obtenerNombreJugador() {
        System.out.println("Enter player name / Ingresa el nombre del jugador:");
        return scanner.next();
    }

    public int mostrarMenuReinicio() {
        System.out.println("Do you want to play again? / ¿Quieres jugar de nuevo?");
        System.out.println("1. Yes / Sí");
        System.out.println("2. No");
        return scanner.nextInt();
    }

    public int mostrarMenuSalonDeLaFama() {
        System.out.println("Do you want to see the Hall of Fame? / ¿Quieres ver el Salón de la Fama?");
        System.out.println("1. Yes / Sí");
        System.out.println("2. No");
        return scanner.nextInt();
    }
}
