package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.SepararTexto;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesSepararTexto {

    /**
     * Prueba unitaria para verificar que se separen correctamente las palabras en un texto simple.
     * Se espera que el resultado contenga las palabras "apple", "orange" y "banana".
     */
    @Test
    public void testSepararTexto() {
        String text = "apple orange banana";
        String[] result = SepararTexto.separar(text);
        assertArrayEquals(new String[]{"apple", "orange", "banana"}, result);
    }

    /**
     * Prueba unitaria para verificar que se separen correctamente las palabras que contienen apostrofes.
     * Se espera que el resultado contenga las palabras "arbole's", "originale's" y "banana's".
     */
    @Test
    public void testSepararTexto_PalabrasConApostrofes() {
        String text = "arbole's originale's banana's";
        String[] result = SepararTexto.separar(text);
        assertArrayEquals(new String[]{"arbole's", "originale's", "banana's"}, result);
    }
}
