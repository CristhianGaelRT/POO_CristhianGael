package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.Top10;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestCasesTop10 {

    /**
     * Prueba unitaria para verificar que las palabras se ordenen correctamente y se devuelvan las primeras 6 palabras.
     * Se espera que el resultado contenga las palabras "banana", "apple", "orange", "elephant", "igloo" y "umbrella".
     */
    @Test
    public void testTop10_MixedWords() {
        String[] words = {"apple", "banana", "orange", "apple", "banana", "banana", "elephant", "igloo", "umbrella", "orange"};
        String[] result = Top10.ordenar(words);

        String[] expected = {"banana", "apple", "orange", "elephant", "igloo", "umbrella"};

        assertArrayEquals(expected, Arrays.copyOf(result, expected.length));
    }

    /**
     * Prueba unitaria para verificar que si hay menos de 10 palabras, se devuelvan todas las palabras sin cambios.
     * Se espera que el resultado sea igual al array de palabras de entrada.
     */
    @Test
    public void testTop10_FewerThan10Words() {
        String[] words = {"apple", "banana", "orange"};
        String[] result = Top10.ordenar(words);

        assertArrayEquals(words, result);
    }

    /**
     * Prueba unitaria para verificar que si el array de palabras está vacío, se devuelva un array vacío.
     * Se espera que el resultado sea un array vacío.
     */
    @Test
    public void testTop10_EmptyArray() {
        String[] words = {};
        String[] result = Top10.ordenar(words);

        assertArrayEquals(new String[0], result);
    }

}
