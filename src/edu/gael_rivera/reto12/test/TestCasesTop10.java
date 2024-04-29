package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.Top10;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TestCasesTop10 {

    @Test
    public void testTop10_MixedWords() {
        String[] words = {"apple", "banana", "orange", "apple", "banana", "banana", "elephant", "igloo", "umbrella", "orange"};
        String[] result = Top10.ordenar(words);

        String[] expected = {"banana", "apple", "orange", "elephant", "igloo", "umbrella"};

        assertArrayEquals(expected, Arrays.copyOf(result, expected.length));
    }

    @Test
    public void testTop10_FewerThan10Words() {
        String[] words = {"apple", "banana", "orange"};
        String[] result = Top10.ordenar(words);

        assertArrayEquals(words, result);
    }

    @Test
    public void testTop10_EmptyArray() {
        String[] words = {};
        String[] result = Top10.ordenar(words);

        assertArrayEquals(new String[0], result);
    }


}
