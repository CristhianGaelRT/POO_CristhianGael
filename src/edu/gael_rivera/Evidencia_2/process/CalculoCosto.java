package edu.gael_rivera.Evidencia_2.process;

import edu.gael_rivera.Evidencia_2.data.Articulo;

import java.util.ArrayList;

public class CalculoCosto {
    public double calcularCosto(ArrayList<Articulo> productosConsumidos) {
        double montoTotal = 0;

        for (Articulo articulo : productosConsumidos) {
            double costoBase = 5; // Costo base de todos los productos

            switch (articulo.getTipo()) {
                case "Música":
                    montoTotal += costoBase + (articulo.esEstreno() ? 1.5 : 0.5);
                    break;
                case "Videojuego":
                    montoTotal += costoBase + 10;
                    break;
                case "Libro":
                    montoTotal += costoBase + 1;
                    if (articulo.getGenero().equals("novela")) {
                        montoTotal += 1;
                    } else if (articulo.getGenero().equals("tecnología")) {
                        montoTotal += 2;
                    }
                    if (articulo.esEstreno()) {
                        montoTotal += 0.5;
                    }
                    break;
                case "Película":
                    montoTotal += costoBase + (articulo.esEstreno() ? 15 : 7);
                    break;
            }
        }

        return montoTotal;
    }
}
