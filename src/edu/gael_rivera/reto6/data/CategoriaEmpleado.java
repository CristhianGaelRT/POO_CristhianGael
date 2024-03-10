
package edu.gael_rivera.reto6.data;


/**
 * La clase CategoriaEmpleado representa las diferentes categorías
 * de empleados y almacena atributos como el nombre, clave, sueldo
 * base y pago por hora extra.
 */
public class CategoriaEmpleado {
    // Atributos de la clase CategoriaEmpleado
    private String nombre;
    private String clave;
    private double sueldoBase;
    private double pagoHoraExtra;

    /**
     * En el constructor CategoriaEmpleado(), se inicializan los
     * atributos de la clase con los valores proporcionados como argumentos.
     * @param nombre Es el nombre del empleado
     * @param clave Es el identificador unico para la categoria
     * @param sueldoBase Es el monto del sueldo minimo
     * @param pagoHoraExtra Es el pago de las horas extras que trabajo
     */
    public CategoriaEmpleado(String nombre, String clave, double sueldoBase, double pagoHoraExtra) {
        // Inicialización de los atributos con los valores proporcionados
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }
    // Getters y setters para acceder y modificar los atributos privados



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }
}
