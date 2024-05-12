package edu.gael_rivera.Evidencia_3.process;

public class ReglasDeVictoria {
    public boolean verificarVictoria(String[] tablero, String marca) {
        // Lógica para verificar si hay victoria en el juego
        for (int i = 0; i < 3; i++) {
            if (tablero[i * 3].equals(marca) && tablero[i * 3 + 1].equals(marca) && tablero[i * 3 + 2].equals(marca)) {
                return true; // Verifica filas
            }
            if (tablero[i].equals(marca) && tablero[i + 3].equals(marca) && tablero[i + 6].equals(marca)) {
                return true; // Verifica columnas
            }
        }
        if (tablero[0].equals(marca) && tablero[4].equals(marca) && tablero[8].equals(marca)) {
            return true; // Verifica diagonal principal
        }
        if (tablero[2].equals(marca) && tablero[4].equals(marca) && tablero[6].equals(marca)) {


            return true; // Verifica diagonal secundaria
        }
        return false;
    }

    public boolean tableroCompleto(String[] tablero) {
        // Lógica para verificar si el tablero está completo (empate)
        for (String casilla : tablero) {
            if (casilla.equals(" ")) {
                return false; // Todavía hay casillas vacías
            }
        }
        return true; // El tablero está completo
    }
}