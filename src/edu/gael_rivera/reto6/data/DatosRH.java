
package edu.gael_rivera.reto6.data;

import java.util.ArrayList;
import java.util.List;

public class DatosRH {
    private final List<Empleado> empleados;

    public DatosRH() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, CategoriaEmpleado categoria) {
        Empleado empleado = new Empleado(nombre, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria);
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
