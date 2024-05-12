package edu.gael_rivera.Evidencia_3_1.ui;

public class Eng implements Idioma {
    @Override
    public String empate() {
        return "It's a tie!";
    }

    @Override
    public String gana() {
        return "wins!";
    }

    @Override
    public String MENU_IDIOMA() {
        return "Select language:";
    }

    @Override
    public String MENU_JUEGO() {
        return "Select game mode:";
    }

    @Override
    public String ENTER_PLAYER_NAME() {
        return "Enter player name:";
    }

    @Override
    public String PLAY_AGAIN() {
        return "Do you want to play again?";
    }

    @Override
    public String YES() {
        return "Yes";
    }

    @Override
    public String NO() {
        return "No";
    }
}
