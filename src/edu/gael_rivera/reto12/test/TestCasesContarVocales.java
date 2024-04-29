package edu.gael_rivera.reto12.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesContarVocales {

    /**
     * Prueba unitaria para verificar el conteo de vocales en un texto que contiene letras y signos de puntuación.
     * Se espera que el resultado sea 7, que es el número de vocales en el texto dado.
     */
    @Test
    public void testContarVocales() {
        String text = "Hello, how are you?";
        int result = edu.gael_rivera.reto12.process.ContarVocales.contar(text);
        assertEquals(7, result);
    }

    /**
     * Prueba unitaria para verificar el conteo de vocales en un texto que contiene solo consonantes.
     * Se espera que el resultado sea 0, ya que no hay vocales en el texto dado.
     */
    @Test
    public void testContarVocales_SoloConsonantes() {
        String text = "bcdfghjklmnpqrstvwxyz";
        int result = edu.gael_rivera.reto12.process.ContarVocales.contar(text);
        assertEquals(0, result);
    }

    /**
     * Prueba unitaria para verificar el conteo de vocales en un texto que contiene solo vocales.
     * Se espera que el resultado sea 5, que es el número de vocales en el texto dado.
     */
    @Test
    public void testContarVocales_SoloVocales() {
        String text = "aeiou";
        int result = edu.gael_rivera.reto12.process.ContarVocales.contar(text);
        assertEquals(5, result);
    }
}
