package edu.gael_rivera.Evidencia_3.process;

import java.util.Random;

public class CPU {


    public int realizarMovimiento() {
        // Lógica para la inteligencia artificial de dificultad fácil (por ejemplo, movimiento aleatorio)
        Random rand = new Random();
        return rand.nextInt(9) + 1; // Retorna un número aleatorio entre 1 y 9
    }
}