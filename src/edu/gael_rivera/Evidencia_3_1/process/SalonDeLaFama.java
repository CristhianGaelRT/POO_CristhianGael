package edu.gael_rivera.Evidencia_3_1.process;

import edu.gael_rivera.Evidencia_3_1.data.Jugador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SalonDeLaFama {
    private ArrayList<Jugador> jugadores;
    private int maxJugadores;

    public SalonDeLaFama(int maxJugadores) {
        this.jugadores = new ArrayList<>();
        this.maxJugadores = maxJugadores;
    }

    public void agregarJugador(Jugador jugador) {
        if (jugadores.size() < maxJugadores) {
            jugadores.add(jugador);
        } else {
            jugadores.sort(Comparator.comparingInt(Jugador::obtenerVictorias)); // Ordenar por victorias
            if (jugador.obtenerVictorias() > jugadores.get(0).obtenerVictorias()) {
                jugadores.remove(0); // Eliminar el jugador con menos victorias
                jugadores.add(jugador); // Agregar el nuevo jugador
            }
        }
    }

    public boolean verificarEntrada(Jugador jugador) {
        return jugadores.contains(jugador);
    }

    public void mostrar() {
        if (jugadores.isEmpty()) {
            System.out.println("Hall of Fame is empty / El Salón de la Fama está vacío");
        } else {
            System.out.println("Hall of Fame / Salón de la Fama:");
            for (int i = 0; i < jugadores.size(); i++) {
                Jugador jugador = jugadores.get(i);
                System.out.println((i + 1) + ". " + jugador.obtenerNombre() + " - " + jugador.obtenerVictorias() + " victories");
            }
        }
    }

    public int mostrarMenuSalonDeLaFama(Scanner scanner) {
        System.out.println("Do you want to see the Hall of Fame? / ¿Quieres ver el Salón de la Fama?");
        System.out.println("1. Yes / Sí");
        System.out.println("2. No");
        return scanner.nextInt();
    }
}
