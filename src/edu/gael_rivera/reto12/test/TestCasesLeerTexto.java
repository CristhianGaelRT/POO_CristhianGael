package edu.gael_rivera.reto12.test;
import edu.gael_rivera.reto12.process.LeerTexto;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesLeerTexto {

    @Test
    public void testLeerTexto() {
        String result = LeerTexto.leer("Libro1.txt");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
    @Test
    public void testLeerTexto_ArchivoVacio() {
        String result = LeerTexto.leer("archivo_vacio.txt");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}