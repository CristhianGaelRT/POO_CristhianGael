package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.PalabraLetraImpar;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestCasesPalabraLetraImpar {

    /**
     * Prueba unitaria para verificar que se obtengan correctamente las palabras con un número impar de letras.
     * Se espera que el resultado sea un arreglo conteniendo las palabras "apple" y "igloo".
     */
    @Test
    public void testPalabraLetraImpar() {
        String[] palabras = {"apple", "orange", "banana", "elephant", "igloo", "umbrella"};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[]{"apple", "igloo"}, resultado);
    }

    /**
     * Prueba unitaria para verificar que no se obtengan palabras cuando todas tienen un número par de letras.
     * Se espera que el resultado sea un arreglo vacío.
     */
    @Test
    public void testPalabraLetraImpar_PalabrasConLetrasPares() {
        String[] palabras = {"orange", "banana", "elephant", "umbrella"};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[0], resultado);
    }

    /**
     * Prueba unitaria para verificar que se manejen correctamente las palabras que contienen espacios.
     * Se espera que el resultado incluya las palabras "apple" y " ".
     */
    @Test
    public void testPalabraLetraImpar_PalabrasConEspacios() {
        String[] palabras = {"apple", " ", "orange", "banana"};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[]{"apple", " "}, resultado);
    }

    /**
     * Prueba unitaria para verificar que se maneje correctamente el caso de un arreglo vacío.
     * Se espera que el resultado sea un arreglo vacío.
     */
    @Test
    public void testPalabraLetraImpar_TextoVacio() {
        String[] palabras = {};
        String[] resultado = PalabraLetraImpar.palabrasConLetraImpar(palabras);
        assertArrayEquals(new String[0], resultado);
    }

}
