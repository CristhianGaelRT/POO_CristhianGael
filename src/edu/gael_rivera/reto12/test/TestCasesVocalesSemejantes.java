package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.VocalesSemejantes;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesVocalesSemejantes {

    /**
     * Prueba unitaria para verificar que si no hay palabras con vocales similares,
     * el resultado sea un array vacío.
     */
    @Test
    public void testVocalesSemejantes_ResultadoVacio() {
        String[] palabras = {"agua", "fuego", "tierra", "aire"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    /**
     * Prueba unitaria para verificar que si todas las palabras tienen vocales iguales,
     * el resultado sea igual al array de entrada.
     */
    @Test
    public void testVocalesSemejantes_TodasPalabrasConVocalesSemejantes() {
        String[] palabras = {"aa", "eee", "iiii", "ooooo", "uuuuuu"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertArrayEquals(palabras, resultado);
    }

    /**
     * Prueba unitaria para verificar que si no hay vocales en las palabras, el resultado sea un array vacío.
     */
    @Test
    public void testVocalesSemejantes_PalabrasSinVocales() {
        String[] palabras = {"cr", "fgh", "lmn"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    /**
     * Prueba unitaria para verificar que si las palabras tienen vocales diferentes,
     * el resultado sea un array vacío.
     */
    @Test
    public void testVocalesSemejantes_PalabrasConVocalesDiferentes() {
        String[] palabras = {"casa", "perro", "mundo"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    /**
     * Prueba unitaria para verificar que si las palabras tienen vocales
     * en mayúsculas y minúsculas, el resultado sea igual al array de entrada.
     */
    @Test
    public void testVocalesSemejantes_PalabrasConVocalesEnMayusculas() {
        String[] palabras = {"AaA", "EEE", "iIi", "OoOoO", "uuUuUu"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertArrayEquals(palabras, resultado);
    }

    /**
     * Prueba unitaria para verificar que si las palabras tienen vocales intermedias,
     * el resultado sea un array vacío.
     */
    @Test
    public void testVocalesSemejantes_PalabrasConVocalesIntermedias() {
        String[] palabras = {"manzana", "perro", "canción", "murciélago"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    /**
     * Prueba unitaria para verificar que si las palabras tienen vocales repetidas,
     * el resultado sea un array vacío.
     */
    @Test
    public void testVocalesSemejantes_PalabrasConVocalesRepetidas() {
        String[] palabras = {"zoo", "peeeeeeeeraaaaaa", "moooon", "biiiiien"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertNull(resultado);
    }

    /**
     * Prueba unitaria para verificar que si las palabras tienen solo una vocal,
     * el resultado sea igual al array de entrada.
     */
    @Test
    public void testVocalesSemejantes_PalabrasConSoloUnaVocal() {
        String[] palabras = {"a", "e", "i", "o", "u"};
        String[] resultado = VocalesSemejantes.palabrasConVocalesSemejantes(palabras);
        assertArrayEquals(palabras, resultado);
    }
}
