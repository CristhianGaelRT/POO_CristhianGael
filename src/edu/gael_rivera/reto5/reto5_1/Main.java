package edu.gael_rivera.reto5.reto5_1;

import edu.gael_rivera.reto5.reto5_1.data.ListaPropiedades;
import edu.gael_rivera.reto5.reto5_1.data.PropiedadInmobiliaria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaPropiedades listaPropiedades = new ListaPropiedades();

        // Agregar algunas propiedades para demostración
        listaPropiedades.agregarPropiedad(new PropiedadInmobiliaria(1, "Casa en venta", "Zapopan II C", "Venta", 5000000));
        listaPropiedades.agregarPropiedad(new PropiedadInmobiliaria(2, "Departamento en renta", "Acueducto Lomas I", "Renta", 10000));

        // Mostrar la lista de propiedades
        listaPropiedades.mostrarListaPropiedades();

        // Ejemplo de búsqueda
        List<PropiedadInmobiliaria> resultados = listaPropiedades.buscarPropiedades("Ciudad X");
        System.out.println("\nResultados de la búsqueda:");
        for (PropiedadInmobiliaria propiedad : resultados) {
            System.out.println(propiedad.getNombre() + " - " + propiedad.getUbicacion() + " - " + propiedad.getPrecio());
        }
    }
}
