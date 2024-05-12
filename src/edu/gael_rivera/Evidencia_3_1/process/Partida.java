package edu.gael_rivera.Evidencia_3_1.process;

import edu.gael_rivera.Evidencia_3_1.data.Jugador;
import edu.gael_rivera.Evidencia_3_1.ui.CLI;
import edu.gael_rivera.Evidencia_3_1.ui.Idioma;

import java.util.Random;
import java.util.Scanner;

public class Partida {
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    private char turno;
    private CPU cpu; // Agregamos un objeto CPU para la computadora

    public Partida() {
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.tablero = new Tablero();
        this.turno = ' ';
        this.cpu = new CPU('O'); // Creamos un objeto CPU para la computadora
    }

    public void inicializar(Scanner scanner, Idioma idioma) {
        // Jugador 1
        System.out.println(idioma.ENTER_PLAYER_NAME);
        String nombreJugador1 = scanner.next();
        jugador1.inicializar(nombreJugador1);
        jugador1.elegirSimbolo(scanner);

        // Jugador 2
        System.out.println(idioma.ENTER_PLAYER_NAME);
        String nombreJugador2 = scanner.next();
        jugador2.inicializar(nombreJugador2);
        char simboloJugador2 = jugador1.obtenerSimbolo() == 'X' ? 'O' : 'X';
        jugador2.elegirSimbolo(scanner);

        // Asignar turnos
        Random rand = new Random();
        int random = rand.nextInt(2);
        turno = random == 0 ? jugador1.obtenerSimbolo() : jugador2.obtenerSimbolo();
    }

    public void realizarJugada(Scanner scanner, CLI cli) {
        Jugador jugadorActual = turno == jugador1.obtenerSimbolo() ? jugador1 : jugador2;
        tablero.mostrar();
        System.out.println("Turno de " + jugadorActual.obtenerNombre() + " (" + jugadorActual.obtenerSimbolo() + ")");
        if (jugadorActual == jugador1) {
            System.out.println("Choose row and column / Elige fila y columna (e.g., 1 2):"); // Agregamos un mensaje explicativo
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();
            if (tablero.verificarCasilla(fila, columna)) {
                tablero.marcarCasilla(fila, columna, jugadorActual.obtenerSimbolo());
                turno = jugador2.obtenerSimbolo();
            } else {
                System.out.println("That cell is already occupied / Esa celda ya está ocupada");
            }
        } else {
            cpu.marcarCasillaRandom(tablero);
            turno = jugador1.obtenerSimbolo();
        }
    }

    public void jugar(Scanner scanner, CLI cli, Idioma idioma) {
        boolean jugarDeNuevo = true;
        while (jugarDeNuevo) {
            inicializar(scanner, idioma);
            while (!tablero.verificarGanador()) {
                realizarJugada(scanner, cli);
            }
            tablero.mostrar();
            String ganador = tablero.obtenerGanador();
            if (ganador.equals("Empate")) {
                System.out.println(idioma.empate());
            } else {
                Jugador jugadorGanador = ganador.equals(String.valueOf(jugador1.obtenerSimbolo())) ? jugador1 : jugador2;
                jugadorGanador.aumentarVictorias();
                System.out.println(jugadorGanador.obtenerNombre() + " " + idioma.gana());
            }
            int opcion = cli.mostrarMenuReinicio();
            jugarDeNuevo = opcion == 1;
        }
    }
}
