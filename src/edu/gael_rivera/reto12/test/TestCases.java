package edu.gael_rivera.reto12.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
    /**
     * Prueba unitaria para verificar el conteo de una sola palabra.
     * Se espera que la palabra "Hello" aparezca una sola vez en el resultado.
     */

    @Test
    public void testMain_SingleWord() {
        String text = "Hello";
        String[] result = edu.gael_rivera.reto12.process.ContarPalabraTexto.contar(edu.gael_rivera.reto12.process.SepararTexto.separar(text));
        assertArrayEquals(new String[]{"Hello: 1"}, result);
    }


}
