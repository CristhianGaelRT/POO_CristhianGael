package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.PalabraCorta;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesPalabraCorta {

    /**
     * Prueba unitaria para verificar que se obtenga la palabra m�s corta de un conjunto de palabras.
     * Se espera que el resultado sea la palabra "igloo".
     */
    @Test
    public void testPalabraCorta() {
        String[] palabras = {"igloo", "apple", "banana", "elephant", "orange", "umbrella"};
        String result = PalabraCorta.palabraCorta(palabras);
        assertEquals("igloo", result);
    }

    /**
     * Prueba unitaria para verificar que se obtenga correctamente la palabra m�s corta cuando solo hay una palabra.
     * Se espera que el resultado sea la palabra "igloo".
     */
    @Test
    public void testPalabraCorta_UnaPalabra() {
        String[] palabras = {"igloo"};
        String result = PalabraCorta.palabraCorta(palabras);
        assertEquals("igloo", result);
    }

    /**
     * Prueba unitaria para verificar que se obtenga la palabra m�s corta cuando todas las palabras son iguales.
     * Se espera que el resultado sea la palabra "igloo".
     */
    @Test
    public void testPalabraCorta_PalabrasIguales() {
        String[] palabras = {"igloo", "igloo", "igloo", "igloo", "igloo", "igloo"};
        String result = PalabraCorta.palabraCorta(palabras);
        assertEquals("igloo", result);
    }

}
