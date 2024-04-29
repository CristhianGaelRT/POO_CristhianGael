package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.ContVocalesAlfabeticamente;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesContVocalesAlfabeticamente {

    @Test
    public void testContVocalesAlfabeticamente() {
        String text = "arbol original banana elefante iguana uva";
        String[] result = edu.gael_rivera.reto12.process.ContVocalesAlfabeticamente.vocalesAlfabeticamente(text);
        assertArrayEquals(new String[]{"A: arbol", "E: elefante", "I: iguana"}, result);
    }
    @Test
    public void testContVocalesAlfabeticamente_TextoVacio() {
        String text = "";
        String[] result = ContVocalesAlfabeticamente.vocalesAlfabeticamente(text);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

}
