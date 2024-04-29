package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.PalabraCorta;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesPalabraCorta {

    @Test
    public void testPalabraCorta() {
        String[] palabras = {"igloo", "apple", "banana", "elephant", "orange", "umbrella"};
        String result = PalabraCorta.palabraCorta(palabras);
        assertEquals("igloo", result);
    }
    @Test
    public void testPalabraCorta_UnaPalabra() {
        String[] palabras = {"igloo"};
        String result = PalabraCorta.palabraCorta(palabras);
        assertEquals("igloo", result);
    }
    @Test
    public void testPalabraCorta_PalabrasIguales() {
        String[] palabras = {"igloo", "igloo", "igloo", "igloo", "igloo", "igloo"};
        String result = PalabraCorta.palabraCorta(palabras);
        assertEquals("igloo", result);
    }

}
