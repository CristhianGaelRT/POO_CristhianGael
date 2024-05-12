package edu.gael_rivera.Evidencia_3.ui;
import edu.gael_rivera.Evidencia_3.ui.Esp;

public class Eng extends Idioma{
    /**
     * Apartado donde crea los mensajes de salida en ingles
     */
    @Override
    public String get_Bienvenida() {
        return "Welcome";
    }

    @Override
    public String get_Entrada_ModoDeJuego() {
        return """
                ///////////////////////////////////////////////////////////
                
                Chose your game mode...
                
                1. Player vs Player
                2. Player vs CPU
                
                ///////////////////////////////////////////////////////////
                """;
    }

    @Override
    public String mostrar_Salida_CaracteresDeTicTacToe() {
        return """
                ///////////////////////////////////////////////////////////
                
                This are the characters for the "Tic Tac Toe"
                
                A. X
                B. O
                C. †
                D. ?
                E. ?
                F. ©
                G. §
                H. €
                I. W
                J. Z
                
                ///////////////////////////////////////////////////////////
                """;
    }
    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Uno() {
        return "Characters for the player 1:";
    }

    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "Characters for the player 2:";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "Name of the player 1?";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "Name of the player 2";
    }

    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "Invalid Character";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "Game mode: Player Vs Player";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "Player Vs CPU";
    }

    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "Character registered: ";
    }

    @Override
    public String get_Salida_InicioJuego() {
        return "Starting game";
    }

    @Override
    public String get_Salida_FinalizarPrograma() {
        return "To exit, use OUT";
    }

    @Override
    public String get_Salida_FinalizandoJuego() {
        return ";)";
    }

    @Override
    public String get_Salida_RegresarMenu() {
        return "Returning to menu";
    }
}
