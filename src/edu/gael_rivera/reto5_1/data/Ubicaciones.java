package edu.gael_rivera.reto5_1.data;

import java.util.HashMap;
import java.util.Map;

public class Ubicaciones {
    private Map<Integer, String> ubicaciones;

    public Ubicaciones() {
        this.ubicaciones = new HashMap<>();
    }

    public void agregarUbicacion(int ID, String ubicacion) {
        ubicaciones.put(ID, ubicacion);
    }

    public String obtenerUbicacion(int ID) {
        return ubicaciones.getOrDefault(ID, "Ubicación no encontrada");
    }

    // Otros métodos que puedan ser necesarios para manipular las ubicaciones
}
