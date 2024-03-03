package edu.gael_rivera.reto5.reto5_1.data;

import java.util.ArrayList;
import java.util.List;

public class ListaPropiedades {
    private List<PropiedadInmobiliaria> propiedades;

    public ListaPropiedades() {
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(PropiedadInmobiliaria propiedad) {
        propiedades.add(propiedad);
    }

    public List<PropiedadInmobiliaria> getPropiedades() {
        return propiedades;
    }

    // Método para buscar propiedades según criterios
    public List<PropiedadInmobiliaria> buscarPropiedades(String criterio) {
        List<PropiedadInmobiliaria> resultado = new ArrayList<>();
        for (PropiedadInmobiliaria propiedad : propiedades) {
            // Aquí se pueden agregar lógicas de búsqueda basadas en criterios
            if (propiedad.getUbicacion().equalsIgnoreCase(criterio) ||
                    propiedad.getTipo().equalsIgnoreCase(criterio)) {
                resultado.add(propiedad);
            }
        }
        return resultado;
    }

    // Método para mostrar la lista de propiedades
    public void mostrarListaPropiedades() {
        for (PropiedadInmobiliaria propiedad : propiedades) {
            System.out.println(propiedad.getNombre() + " - " + propiedad.getUbicacion() + " - " + propiedad.getPrecio());
        }
    }
}
