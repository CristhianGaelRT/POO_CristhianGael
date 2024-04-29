package edu.gael_rivera.reto12.test;

import edu.gael_rivera.reto12.process.DepurarTexto;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCasesDepurarTexto {

    /**
     * Prueba unitaria para verificar el funcionamiento de la depuraci�n de texto.
     * Se espera que el texto se limpie de caracteres especiales y se convierta a min�sculas correctamente.
     */
    @Test
    public void testDepurarTexto() {
        String text = "�Hola, c�mo est�s?";
        String result = DepurarTexto.depurar(text);
        assertEquals("hola c\u00f3mo est\u00e1s", result);
    }
}
