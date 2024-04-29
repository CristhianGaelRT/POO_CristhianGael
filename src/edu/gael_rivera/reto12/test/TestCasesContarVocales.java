package edu.gael_rivera.reto12.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesContarVocales {

    @Test
    public void testContarVocales() {
        String text = "Hello, how are you?";
        int result = edu.gael_rivera.reto12.process.ContarVocales.contar(text);
        assertEquals(7, result);
    }

    @Test
    public void testContarVocales_SoloConsonantes() {
        String text = "bcdfghjklmnpqrstvwxyz";
        int result = edu.gael_rivera.reto12.process.ContarVocales.contar(text);
        assertEquals(0, result);
    }

    @Test
    public void testContarVocales_SoloVocales() {
        String text = "aeiou";
        int result = edu.gael_rivera.reto12.process.ContarVocales.contar(text);
        assertEquals(5, result);
    }
}
