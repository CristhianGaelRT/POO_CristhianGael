
package edu.gael_rivera.reto6.process;

import edu.gael_rivera.reto6.data.CategoriaEmpleado;
import edu.gael_rivera.reto6.data.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase es responsable de generar el reporte de nómina
 * a partir de la información de los empleados.
 */
public class Nomina {
    // Método para generar el reporte de nómina
    public ArrayList<String> generarReporte(List<Empleado> empleados) {
        // Lista para almacenar el reporte de nómina
        ArrayList<String> reporte = new ArrayList<>();
        // Variables para calcular totales
        double totalNomina = 0;
        double totalSueldoNormal = 0;
        double totalSueldoExtra = 0;
        int totalHorasTrabajadas = 0;
        int totalEmpleadosConExtras = 0;
        int totalEmpleadosSinExtras = 0;
        int totalHorasExtras = 0;

        // Encabezado del reporte
        reporte.add("------Reporte de nómina------");
        reporte.add("CANTIDAD DE EMPLEADOS: " + empleados.size());
        reporte.add("Datos de los empleados:");

        // Iterar sobre cada empleado para calcular su sueldo y agregar sus datos al reporte
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            double sueldo = empleado.calcularSueldo();
            // Actualizar totales
            totalNomina += sueldo;
            totalSueldoNormal += empleado.getHorasTrabajadas() * empleado.getCategoria().getSueldoBase();
            totalSueldoExtra += empleado.getHorasExtras() * empleado.getCategoria().getPagoHoraExtra();
            totalHorasTrabajadas += empleado.getHorasTrabajadas();
            if (empleado.getHorasExtras() > 0) {
                totalEmpleadosConExtras++;
                totalHorasExtras += empleado.getHorasExtras();
            } else {
                totalEmpleadosSinExtras++;
            }


            // Agregar datos del empleado al reporte
            reporte.add((i + 1) + ". " + empleado.getNombre() + " - Categoria: " + empleado.getCategoria().getNombre());
            reporte.add("Sueldo base: " + empleado.getCategoria().getSueldoBase());
            reporte.add("Horas trabajadas: " + empleado.getHorasTrabajadas());
            reporte.add("Horas extras: " + empleado.getHorasExtras());
            reporte.add("Pago neto: " + sueldo + "\n");
        }

        // Agregar totales al reporte
        reporte.add("Pago total nómina: " + totalNomina);
        reporte.add("Pago total horas trabajadas: " + totalSueldoNormal);
        reporte.add("Pago total de horas extras: " + totalSueldoExtra);
        reporte.add("Total de horas laboradas: " + (totalHorasTrabajadas + totalHorasExtras) + " horas");
        reporte.add("Total de empleados con horas extras: " + totalEmpleadosConExtras);
        reporte.add("Total de empleados sin horas extras: " + totalEmpleadosSinExtras);
        reporte.add("Total de horas extras laboradas: " + totalHorasExtras + " horas");
        reporte.add("----Fin del programa----");
        // Devolver el reporte generado

        return reporte;
    }
}
