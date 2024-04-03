package edu.gael_rivera.Evidencia_2.data;

public class Articulo {
    private String nombre;
    private String tipo;
    private String genero;
    private boolean esEstreno;

    public Articulo(String nombre, String tipo, String genero, boolean esEstreno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.esEstreno = esEstreno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public boolean esEstreno() {
        return esEstreno;
    }
}
