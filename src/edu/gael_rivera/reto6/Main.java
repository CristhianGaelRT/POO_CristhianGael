
package edu.gael_rivera.reto6;

import edu.gael_rivera.reto6.ui.CLI;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.capturarEmpleados();
        cli.generarReporteNomina();
    }
}
