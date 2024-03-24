package edu.gael_rivera.reto8.ui;

/**
 * Clase abstracta que define métodos para obtener mensajes en diferentes idiomas
 */
public abstract class Idioma {
    public abstract String getBienvenido();
    public abstract String getMenuOperaciones();
    public abstract String getOpcionNoValida();
    public abstract String getIngresePrimerNumero();
    public abstract String getIngreseSegundoNumero();
    public abstract String getIngreseBase();
    public abstract String getIngreseExponente();
    public abstract String getIngreseNumero();
    public abstract String getElResultadoEs();
}

