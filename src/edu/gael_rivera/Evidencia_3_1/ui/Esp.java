package edu.gael_rivera.Evidencia_3_1.ui;

public class Esp implements Idioma {
    @Override
    public String empate() {
        return "¡Es un empate!";
    }

    @Override
    public String gana() {
        return "¡Gana!";
    }

    @Override
    public String MENU_IDIOMA() {
        return "Selecciona idioma:";
    }

    @Override
    public String MENU_JUEGO() {
        return "Selecciona modo de juego:";
    }

    @Override
    public String ENTER_PLAYER_NAME() {
        return "Ingresa el nombre del jugador:";
    }

    @Override
    public String PLAY_AGAIN() {
        return "¿Quieres jugar de nuevo?";
    }

    @Override
    public String YES() {
        return "Sí";
    }

    @Override
    public String NO() {
        return "No";
    }
}
