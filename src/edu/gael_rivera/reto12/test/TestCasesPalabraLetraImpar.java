package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.PalabraLetraImpar;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestCasesPalabraLetraImpar {

    @Test
    public void testPalabraLetraImpar() {
        String[] palabras = {"apple", "orange", "banana", "elephant", "igloo", "umbrella"};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[]{"apple", "igloo"}, resultado);
    }
    @Test
    public void testPalabraLetraImpar_PalabrasConLetrasPares() {
        String[] palabras = {"orange", "banana", "elephant", "umbrella"};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[0], resultado);
    }

    @Test
    public void testPalabraLetraImpar_PalabrasConEspacios() {
        String[] palabras = {"apple", " ", "orange", "banana"};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[]{"apple", " "}, resultado);
    }
    @Test
    public void testPalabraLetraImpar_TextoVacio() {
        String[] palabras = {};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[0], resultado);
    }

}