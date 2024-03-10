
package edu.gael_rivera.reto6.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es para lista para almacenar los empleados
 */
public class DatosRH {
    private final List<Empleado> empleados;

    /**
     * Constructor de la clase DatosRH
      */
    public DatosRH() {
        // Inicialización de la lista de empleados como un ArrayList vacío
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(String nombre, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, CategoriaEmpleado categoria) {
        // Creación de un objeto Empleado con los datos proporcionados
        Empleado empleado = new Empleado(nombre, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria);
        // Agregar el empleado a la lista
        empleados.add(empleado);
    }

    /**
     * Método para obtener la lista completa de empleados
     * @return Lista de empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
