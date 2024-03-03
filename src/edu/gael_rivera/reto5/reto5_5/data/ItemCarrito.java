package edu.gael_rivera.reto5.reto5_5.data;

public class ItemCarrito {
    private String nombreProducto;
    private int cantidad;
    private double precioUnitario;
    private double iva;

    public ItemCarrito(String nombreProducto, int cantidad, double precioUnitario, double iva) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.iva = iva;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double calcularImporteNeto() {
        return (precioUnitario * cantidad) * (1 + iva);
    }
}
