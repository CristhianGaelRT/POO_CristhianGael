package edu.gael_rivera.reto5.reto5_1.data;

import java.util.ArrayList;
import java.util.List;

public class PropiedadInmobiliaria {
    private int id;
    private String nombre;
    private String ubicacion;
    private String tipo;
    private double precio;

    // Constructor
    public PropiedadInmobiliaria(int id, String nombre, String ubicacion, String tipo, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
}
