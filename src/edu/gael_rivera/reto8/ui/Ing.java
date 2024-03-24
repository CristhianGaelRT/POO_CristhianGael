package edu.gael_rivera.reto8.ui;

public class Ing extends Idioma {
    /**
     * Clase que proporciona todas las traducciones de Español a Ingles
     * @return Traduccion a Ingles
     */
    @Override
    public String getBienvenido() {
        return "******Welcome*****";
    }

    @Override
    public String getMenuOperaciones() {
        return """
               Select the operation:
               1. Sum
               2. Subtraction
               3. Multiplication
               4. Division
               5. Modulus (remainder)
               6. Power
               7. Square Root
               8. Logarithm
               """;
    }

    @Override
    public String getOpcionNoValida() {
        return "Invalid option";
    }

    @Override
    public String getIngresePrimerNumero() {
        return "Enter the first number:";
    }

    @Override
    public String getIngreseSegundoNumero() {
        return "Enter the second number:";
    }

    @Override
    public String getIngreseBase() {
        return "Enter the base:";
    }

    @Override
    public String getIngreseExponente() {
        return "Enter the exponent:";
    }

    @Override
    public String getIngreseNumero() {
        return "Enter the number:";
    }

    @Override
    public String getElResultadoEs() {
        return "The result is: ";
    }
}
