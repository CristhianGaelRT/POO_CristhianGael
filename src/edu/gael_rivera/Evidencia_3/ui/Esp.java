package edu.gael_rivera.Evidencia_3.ui;

public class Esp extends Idioma{

    @Override
    public String get_Bienvenida() {
        return """
               Bienvenido al juego de TIC TAC TOE
               """;
    }

    @Override
    public String get_Entrada_ModoDeJuego() {
        return """
               ///////////////////////////////////////////////////////////
               
               Modo de juego?
               
               1. Jugador vs Jugador
               
               2. Jugador vs CPU
               
               ///////////////////////////////////////////////////////////
               """;
    }

    @Override
    public String mostrar_Salida_CaracteresDeTicTacToe() {
        return """
                ///////////////////////////////////////////////////////////
                
                Estos son los caracteres para
                marcar las casillas del "Tic Tac Toe"
                
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
        return "Caracteres para el jugador 1:";
    }

    @Override
    public String get_Entrada_CaracteresDeTicTacToe_Jg_Dos() {
        return "Caracteres para el jugador 2:";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Uno() {
        return "Nombre del jugador 1?";
    }

    @Override
    public String get_Entrada_Nombre_Jg_Dos() {
        return "Nombre del jugador 2?";
    }

    @Override
    public String get_Salida_Error_CaracterInvalido() {
        return "Caracter invalido";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSJg() {
        return "Modo de juego: Jugador Vs Jugador...";
    }

    @Override
    public String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU() {
        return "Modo de juego: Jugador Vs CPU...";
    }

    @Override
    public String get_Salida_Confirmación_CaracterRegistrado() {
        return "Caracter registrado: ";
    }

    @Override
    public String get_Salida_InicioJuego() {
        return "Inicio del juego";
    }

    @Override
    public String get_Salida_FinalizarPrograma() {
        return "Para finalizar el programa, ponga FIN en cualquier momento";
    }

    @Override
    public String get_Salida_FinalizandoJuego() {
        return "Saliendo del juego";
    }

    @Override
    public String get_Salida_RegresarMenu() {
        return "Regresando al menu";
    }

}