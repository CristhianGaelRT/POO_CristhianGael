package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.PalabraLarga;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesPalabraLarga {

    /**
     * Prueba unitaria para verificar que se obtenga la palabra más larga de un conjunto de palabras.
     * Se espera que el resultado sea la palabra "elefante".
     */
    @Test
    public void testPalabraLarga() {
        String[] words = {"agua", "orange", "banana", "elefante", "iglesia", "uva"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }

    /**
     * Prueba unitaria para verificar que se obtenga la palabra más larga cuando esta está al inicio del arreglo.
     * Se espera que el resultado sea la palabra "elefante".
     */
    @Test
    public void testPalabraLarga_PalabraMasLargaAlInicio() {
        String[] words = {"elefante", "banana", "agua", "orange", "iglesia", "uva"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }

    /**
     * Prueba unitaria para verificar que se obtenga correctamente la palabra más larga cuando solo hay una palabra.
     * Se espera que el resultado sea la palabra "elefante".
     */
    @Test
    public void testPalabraLarga_UnaPalabra() {
        String[] words = {"elefante"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }

    /**
     * Prueba unitaria para verificar que se obtenga la palabra más larga cuando hay palabras repetidas.
     * Se espera que el resultado sea la palabra "elefante".
     */
    @Test
    public void testPalabraLarga_PalabrasIguales() {
        String[] words = {"agua", "banana", "elefante", "elefante", "iglesia", "uva"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }

}
