package edu.gael_rivera.reto5.reto5_5.process;

import edu.gael_rivera.reto5.reto5_5.data.ItemCarrito;

import java.util.ArrayList;
import java.util.List;

public class CalcularCarrito {
    private List<ItemCarrito> items;

    public CalcularCarrito() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    public void generarInforme() {
        System.out.println("Informe del carrito:");
        for (ItemCarrito item : items) {
            System.out.println("Nombre del producto: " + item.getNombreProducto());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println("Precio unitario: $" + item.getPrecioUnitario());
            System.out.println("Subtotal: $" + (item.getPrecioUnitario() * item.getCantidad()));
            System.out.println("IVA: " + (item.getIva() * 100) + "%");
            System.out.println("Importe neto: $" + item.calcularImporteNeto());
            System.out.println("-----------------------------------");
        }
        double costoTotal = calcularCostoTotal();
        System.out.println("Costo total del carrito con IVA incluido: $" + costoTotal);
    }

    private double calcularCostoTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularImporteNeto();
        }
        return total;
    }
}
