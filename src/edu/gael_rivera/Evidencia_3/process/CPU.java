package edu.gael_rivera.Evidencia_3.process;

import java.util.Random;

public class CPU {


    public int realizarMovimiento() {
        // L�gica para la inteligencia artificial de dificultad f�cil (por ejemplo, movimiento aleatorio)
        Random rand = new Random();
        return rand.nextInt(9) + 1; // Retorna un n�mero aleatorio entre 1 y 9
    }
}