package edu.gael_rivera.reto12.test;
import edu.gael_rivera.reto12.process.SepararTexto;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesSepararTexto {

    @Test
    public void testSepararTexto() {
        String text = "apple orange banana";
        String[] result = SepararTexto.separar(text);
        assertArrayEquals(new String[]{"apple", "orange", "banana"}, result);
    }

    @Test
    public void testSepararTexto_PalabrasConApostrofes() {
        String text = "arbole's originale's banana's";
        String[] result = SepararTexto.separar(text);
        assertArrayEquals(new String[]{"arbole's", "originale's", "banana's"}, result);
    }
}