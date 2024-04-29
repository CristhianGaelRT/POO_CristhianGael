package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.PalabraLarga;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesPalabraLarga {

    @Test
    public void testPalabraLarga() {
        String[] words = {"agua", "orange", "banana", "elefante", "iglesia", "uva"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }
    @Test
    public void testPalabraLarga_PalabraMasLargaAlInicio() {
        String[] words = {"elefante", "banana", "agua", "orange", "iglesia", "uva"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }
    @Test
    public void testPalabraLarga_UnaPalabra() {
        String[] words = {"elefante"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }
    @Test
    public void testPalabraLarga_PalabrasIguales() {
        String[] words = {"agua", "banana", "elefante", "elefante", "iglesia", "uva"};
        String result = PalabraLarga.palabraLarga(words);
        assertEquals("elefante", result);
    }


}
