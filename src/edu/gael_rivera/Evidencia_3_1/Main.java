package edu.gael_rivera.Evidencia_3_1;

import edu.gael_rivera.Evidencia_3_1.process.Partida;
import edu.gael_rivera.Evidencia_3_1.process.SalonDeLaFama;
import edu.gael_rivera.Evidencia_3_1.ui.CLI;
import edu.gael_rivera.Evidencia_3_1.ui.Eng;
import edu.gael_rivera.Evidencia_3_1.ui.Esp;
import edu.gael_rivera.Evidencia_3_1.ui.Idioma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CLI cli = new CLI();
        Idioma idioma;
        Partida partida = new Partida();
        SalonDeLaFama salonDeLaFama = new SalonDeLaFama(5); // Proporcionamos el argumento necesario

        // Selección de idioma
        int opcionIdioma = cli.mostrarMenuIdioma();
        if (opcionIdioma == 1) {
            idioma = new Eng();
        } else {
            idioma = new Esp();
        }

        // Selección de modo de juego
        int opcionModoJuego = cli.mostrarMenuJuego();
        if (opcionModoJuego == 1) {
            // Modo 1 Jugador
            partida.jugar(scanner, cli, idioma);
            // Mostrar el salón de la fama
            if (salonDeLaFama.mostrarMenuSalonDeLaFama(scanner) == 1) { // Pasamos un objeto Scanner
                salonDeLaFama.mostrar();
            }
        } else {
            // Modo 2 Jugadores
            partida.jugar(scanner, cli, idioma);
        }

        scanner.close();
    }
}
