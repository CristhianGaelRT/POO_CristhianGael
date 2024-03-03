package edu.gael_rivera.reto5.reto5_3;

import edu.gael_rivera.reto5.reto5_3.data.ArticulosSuper;
import edu.gael_rivera.reto5.reto5_3.process.ImporteTotalArticulo;

public class Main {
    public static void main(String[] args) {
        ArticulosSuper doritos = new ArticulosSuper("Doritos", 20, 10);
        ArticulosSuper bombones = new ArticulosSuper("Bombones", 15, 8);
        ArticulosSuper sabritas = new ArticulosSuper("Sabritas", 20, 12);
        ArticulosSuper cocaCola = new ArticulosSuper("CocaCola", 15, 15);
        ArticulosSuper galletas = new ArticulosSuper("Galletas", 20, 20);

        ImporteTotalArticulo importeTotalArticulo = new ImporteTotalArticulo();

        System.out.println("Importe total de Doritos: $" + importeTotalArticulo.calcularImporteTotal(doritos)) ;
        System.out.println("Importe total de Bombones: $" + importeTotalArticulo.calcularImporteTotal(bombones));
        System.out.println("Importe total de Sabritas: $" + importeTotalArticulo.calcularImporteTotal(sabritas));
        System.out.println("Importe total de CocaCola: $" + importeTotalArticulo.calcularImporteTotal(cocaCola));
        System.out.println("Importe total de Galletas: $" + importeTotalArticulo.calcularImporteTotal(galletas));
    }
}
