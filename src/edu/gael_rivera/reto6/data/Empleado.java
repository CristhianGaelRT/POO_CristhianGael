
package edu.gael_rivera.reto6.data;


public class Empleado {
    // Atributos de la clase Empleado
    private String nombre;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private String fechaNacimiento;
    private CategoriaEmpleado categoria;


    /**
     * Constructor de la clase Empleado
     * @param nombre Es el nombre del empleado
     * @param horasTrabajadas Es el total de horas trabajadas
     * @param horasExtras Es el total de las horas extras que ejercio
     * @param telefono Es el numero telefonico personal del usuario
     * @param fechaNacimiento Son los datos de cuando nacio el usuario
     * @param categoria Es la posicion en la que se encuentra el usuario
     */
    public Empleado(String nombre, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, CategoriaEmpleado categoria) {
        // Inicialización de los atributos con los valores proporcionados
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }



    /**
     * Getters y setters para acceder y modificar los atributos privados
     * @return dato guardado del empleado
     */
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

    /**
     * Este metodo es para calcular el sueldo del empleado
     * @return sueldo total del empleado
     */
    public double calcularSueldo() {
        // Se calcula el sueldo normal y el sueldo por horas extras utilizando los datos de la categoría del empleado
        double sueldoNormal = horasTrabajadas * categoria.getSueldoBase();
        double sueldoExtra = horasExtras * categoria.getPagoHoraExtra();
        // Se devuelve la suma de ambos sueldos
        return sueldoNormal + sueldoExtra;
    }
}
