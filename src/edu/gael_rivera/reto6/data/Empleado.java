
package edu.gael_rivera.reto6.data;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private String fechaNacimiento;
    private CategoriaEmpleado categoria;

    public Empleado(String nombre, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    // Métodos adicionales
    public double calcularSueldo() {
        double sueldoNormal = horasTrabajadas * categoria.getSueldoBase();
        double sueldoExtra = horasExtras * categoria.getPagoHoraExtra();
        return sueldoNormal + sueldoExtra;
    }
}
