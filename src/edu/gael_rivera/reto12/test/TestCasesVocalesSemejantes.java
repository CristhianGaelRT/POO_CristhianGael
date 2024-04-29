package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.VocalesSemejantes;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesVocalesSemejantes {

    @Test
    public void testVocalesSemejantes_ResultadoVacio() {
        // Crea un array de entrada donde ninguna palabra tenga vocales similares
        String[] palabras = {"agua", "fuego", "tierra", "aire"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado); // Afirma que el resultado es null (array vacío)
    }

    @Test
    public void testVocalesSemejantes_TodasPalabrasConVocalesSemejantes() {
        String[] palabras = {"aa", "eee", "iiii", "ooooo", "uuuuuu"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertArrayEquals(palabras, resultado);
    }

    @Test
    public void testVocalesSemejantes_PalabrasSinVocales() {
        String[] palabras = {"cr", "fgh", "lmn"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    @Test
    public void testVocalesSemejantes_PalabrasConVocalesDiferentes() {
        String[] palabras = {"casa", "perro", "mundo"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    @Test
    public void testVocalesSemejantes_PalabrasConVocalesEnMayusculas() {
        String[] palabras = {"AaA", "EEE", "iIi", "OoOoO", "uuUuUu"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertArrayEquals(palabras, resultado);
    }

    @Test
    public void testVocalesSemejantes_PalabrasConVocalesIntermedias() {
        String[] palabras = {"manzana", "perro", "canción", "murciélago"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    @Test
    public void testVocalesSemejantes_PalabrasConVocalesRepetidas() {
        String[] palabras = {"zoo", "peeeeeeeeraaaaaa", "moooon", "biiiiien"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    @Test
    public void testVocalesSemejantes_PalabrasConSoloUnaVocal() {
        String[] palabras = {"a", "e", "i", "o", "u"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertArrayEquals(palabras, resultado);
    }
}