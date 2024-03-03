package edu.gael_rivera.reto5.reto5_3.process;

import edu.gael_rivera.reto5.reto5_3.data.ArticulosSuper;

public class ImporteTotalArticulo {
    public double calcularImporteTotal(ArticulosSuper articulo) {
        return articulo.getPrecio() * articulo.getCantidad();
    }
}
