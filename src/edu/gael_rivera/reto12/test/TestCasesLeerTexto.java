package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.LeerTexto;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesLeerTexto {

    /**
     * Prueba unitaria para verificar la lectura de un archivo de texto no vac�o.
     * Se espera que el resultado no sea nulo y que el texto no est� vac�o.
     */
    @Test
    public void testLeerTexto() {
        String result = LeerTexto.leer("Libro1.txt");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    /**
     * Prueba unitaria para verificar la lectura de un archivo de texto vac�o.
     * Se espera que el resultado no sea nulo y que el texto est� vac�o.
     */
    @Test
    public void testLeerTexto_ArchivoVacio() {
        String result = LeerTexto.leer("archivo_vacio.txt");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}
