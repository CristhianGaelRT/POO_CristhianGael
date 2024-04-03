package edu.gael_rivera.Evidencia_2.process;

import edu.gael_rivera.Evidencia_2.data.Articulo;

import java.util.ArrayList;

public class CalculoCosto {
    /**
     * En esta clase es para calcular los costos de los articulos
     * @param productosConsumidos Son los articulos visitados de streaming
     * @return Reporte de los articulos consumidos
     */
    // Método para calcular el costo total de los productos consumidos
    public double calcularCosto(ArrayList<Articulo> productosConsumidos) {
        double montoTotal = 0; // Inicializar el monto total en 0

        // Iterar sobre todos los artículos consumidos
        for (Articulo articulo : productosConsumidos) {
            double costoBase = 5; // Costo base de todos los productos

            // Calcular el costo dependiendo del tipo de producto
            switch (articulo.getTipo()) {
                case "Música":
                    // Si es música, se agrega el costo base más 50 centavos si no es estreno, o 1 peso con 50 centavos si es estreno
                    montoTotal += costoBase + (articulo.esEstreno() ? 1.5 : 0.5);
                    break;
                case "Videojuego":
                    // Si es un videojuego, se agrega el costo base más 10 pesos
                    montoTotal += costoBase + 10;
                    break;
                case "Libro":
                    // Si es un libro, se agrega el costo base más 1 peso y se añade un costo adicional dependiendo del género y si es estreno
                    montoTotal += costoBase + 1;
                    if (articulo.getGenero().equals("novela")) {
                        // Si es una novela, se agrega 1 peso adicional
                        montoTotal += 1;
                    } else if (articulo.getGenero().equals("tecnología")) {
                        // Si es un libro de tecnología, se agrega 2 pesos adicionales
                        montoTotal += 2;
                    }
                    if (articulo.esEstreno()) {
                        // Si es un estreno, se agrega 50 centavos adicionales
                        montoTotal += 0.5;
                    }
                    break;
                case "Película":
                    // Si es una película, se agrega el costo base más 7 pesos si no es estreno, o 15 pesos si es estreno
                    montoTotal += costoBase + (articulo.esEstreno() ? 15 : 7);
                    break;
            }
        }

        return montoTotal; // Devolver el monto total calculado
    }
}
