package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.ContVocalesAlfabeticamente;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesContVocalesAlfabeticamente {

    /**
     * Prueba unitaria para verificar la agrupaci�n de palabras por vocal inicial y orden alfab�tico.
     * Se espera que las palabras se agrupen correctamente y se ordenen alfab�ticamente dentro de cada grupo.
     */
    @Test
    public void testContVocalesAlfabeticamente() {
        String text = "arbol original banana elefante iguana uva";
        String[] result = ContVocalesAlfabeticamente.vocalesAlfabeticamente(text);
        assertArrayEquals(new String[]{"A: arbol", "E: elefante", "I: iguana"}, result);
    }

    /**
     * Prueba unitaria para verificar el comportamiento cuando se proporciona un texto vac�o.
     * Se espera que el resultado sea un arreglo vac�o, ya que no hay palabras en el texto.
     */
    @Test
    public void testContVocalesAlfabeticamente_TextoVacio() {
        String text = "";
        String[] result = ContVocalesAlfabeticamente.vocalesAlfabeticamente(text);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

}
