package edu.gael_rivera.reto5.reto5_5;

import edu.gael_rivera.reto5.reto5_5.data.ItemCarrito;
import edu.gael_rivera.reto5.reto5_5.process.CalcularCarrito;

public class Main {
    public static void main(String[] args) {
        // Crear objetos ItemCarrito para cada artículo
        ItemCarrito huaweiFreeclip = new ItemCarrito("Huawei Freeclip", 1, 3435, 0.16);
        ItemCarrito smartWatchSamsung = new ItemCarrito("Smart Watch 6 Samsung Galaxy", 1, 4446, 0.16);
        ItemCarrito appleMacBookPro = new ItemCarrito("Apple MacBook Pro 16 pulg", 1, 50249, 0.16);

        // Crear objeto CalcularCarrito
        CalcularCarrito calcularCarrito = new CalcularCarrito();

        // Agregar artículos al carrito
        calcularCarrito.agregarItem(huaweiFreeclip);
        calcularCarrito.agregarItem(smartWatchSamsung);
        calcularCarrito.agregarItem(appleMacBookPro);

        // Generar informe del carrito
        calcularCarrito.generarInforme();
    }
}
