package edu.gael_rivera.Evidencia_3.ui;

import java.util.Scanner;

public abstract class Idioma {
    public abstract String get_Bienvenida();
    public abstract String get_Entrada_ModoDeJuego();
    public abstract String mostrar_Salida_CaracteresDeTicTacToe();
    public abstract String get_Entrada_CaracteresDeTicTacToe_Jg_Uno();
    public abstract String get_Entrada_CaracteresDeTicTacToe_Jg_Dos();
    public abstract String get_Entrada_Nombre_Jg_Uno();
    public abstract String get_Entrada_Nombre_Jg_Dos();
    public abstract String get_Salida_Error_CaracterInvalido();
    public abstract String get_Salida_Bienvenida_ModoDeJuego_JgVSJg();
    public abstract String get_Salida_Bienvenida_ModoDeJuego_JgVSCPU();
    public abstract String get_Salida_Confirmación_CaracterRegistrado();
    public abstract String get_Salida_InicioJuego();
    public abstract String get_Salida_FinalizarPrograma();
    public abstract String get_Salida_FinalizandoJuego();
    public abstract String get_Salida_RegresarMenu();
}
