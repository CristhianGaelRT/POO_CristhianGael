// CLI.java
package edu.gael_rivera.reto6.ui;

import edu.gael_rivera.reto6.data.CategoriaEmpleado;
import edu.gael_rivera.reto6.data.DatosRH;
import edu.gael_rivera.reto6.data.Empleado;
import edu.gael_rivera.reto6.process.Nomina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CLI {
    /**
     * En esta clase es para toda la interaccion con el usuario.
     */
    private final Scanner scanner;
    // Instancia de DatosRH para almacenar los datos de los empleados
    private final DatosRH datosRH;
    // Instancia de Nomina para realizar cálculos de nómina
    private final Nomina nomina;

    /**
     *  Constructor de la clase CLI
     */

    public CLI() {
        // Inicialización del scanner para entrada de usuario
        this.scanner = new Scanner(System.in);
        // Inicialización de DatosRH para almacenar los datos de los empleados
        this.datosRH = new DatosRH();
        // Inicialización de Nomina para realizar cálculos de nómina
        this.nomina = new Nomina();
    }

    /**
     * Este método es para capturar los datos de los empleados desde la entrada del usuario
     */
    public void capturarEmpleados() {
        System.out.println("Ingrese la cantidad de empleados a capturar:");
        // Lee la cantidad de empleados a capturar desde la entrada del usuario
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer de entrada

        // Itera sobre la cantidad de empleados a capturar
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Horas extras trabajadas: ");
            int horasExtras = scanner.nextInt();
            System.out.print("Teléfono: ");
            String telefono = scanner.next();
            System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
            String fechaNacimiento = scanner.next();

            System.out.println("Categorías:");
            System.out.println("1. Empleado ventas");
            System.out.println("2. Administrador");
            System.out.println("3. Gerente");
            System.out.print("Seleccione la categoría del empleado: ");
            // Lee la opción de categoría del empleado desde la entrada del usuario
            int opcionCategoria = scanner.nextInt();
            CategoriaEmpleado categoriaEmpleado = null;
            switch (opcionCategoria) {
                /**
                 * Creamos las instancias para CategoriaEmpleado de cada caso que elija.
                 */
                case 1:
                    categoriaEmpleado = new CategoriaEmpleado("Empleado ventas", "EV", 100.00, 50.00);
                    break;
                case 2:
                    categoriaEmpleado = new CategoriaEmpleado("Administrador", "ADM", 180.00, 100.00);
                    break;
                case 3:
                    categoriaEmpleado = new CategoriaEmpleado("Gerente", "GER", 250.00, 150.00);
                    break;
                default:
                    // Si la opción de categoría no es válida, asigna la categoría "Empleado ventas" por defecto
                    System.out.println("Opción inválida, se asignará la categoría 'Empleado ventas'.");
                    categoriaEmpleado = new CategoriaEmpleado("Empleado ventas", "EV", 100.00, 50.00);
                    break;
            }

            // Agregar empleado a los datos de RH
            datosRH.agregarEmpleado(nombre, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoriaEmpleado);
        }
    }

    /**
     * Método para generar el reporte de nómina
     */
    public void generarReporteNomina() {
        ArrayList<String> reporteNomina = nomina.generarReporte(datosRH.getEmpleados());
        System.out.println("\n------Reporte de nómina------");
        for (String linea : reporteNomina) {
            System.out.println(linea);
        }
        System.out.println("\n----Fin del programa----");
    }
}
