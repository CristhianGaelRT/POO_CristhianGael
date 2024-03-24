package edu.gael_rivera.reto8.ui;

/**
 * Clase que proporciona textos del menu en Español.
 */

public class Esp extends Idioma {
    @Override
    public String getBienvenido() {
        return "******Bienvenido*****";
    }

    @Override
    public String getMenuOperaciones() {
        return """
               Seleccione la operación:
               1. Suma
               2. Resta
               3. Multiplicación
               4. División
               5. Módulo
               6. Potencia
               7. Raíz
               8. Logaritmo
               """;
    }

    @Override
    public String getOpcionNoValida() {
        return "Opción no válida";
    }

    @Override
    public String getIngresePrimerNumero() {
        return "Ingrese el primer número:";
    }

    @Override
    public String getIngreseSegundoNumero() {
        return "Ingrese el segundo número:";
    }

    @Override
    public String getIngreseBase() {
        return "Ingrese la base:";
    }

    @Override
    public String getIngreseExponente() {
        return "Ingrese el exponente:";
    }

    @Override
    public String getIngreseNumero() {
        return "Ingrese el número:";
    }

    @Override
    public String getElResultadoEs() {
        return "El resultado es: ";
    }
}
