package edu.gael_rivera.Evidencia_1.ui;

import edu.gael_rivera.Evidencia_1.process.ControlMedicamentos;
import java.util.Scanner;

public class CLI {
    /**
     * Esta clase esta encargada para toda la interaccion del ususario
     */
    public static void showMenu() {
        /**
         * Este método le damos el inicio de sesión al usuario,
         * mostramos un usuario y contraseña para que pueda iniciar sesión.
         */
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String contrasena;
        ControlMedicamentos controlMedicamentos = new ControlMedicamentos();

        System.out.println("Ingrese su usuario:");
        usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        contrasena = scanner.nextLine();

        /**
         * Se usa el While para poder validar el usuario
         * y contraseña ya puesto de lo contrario no podrá iniciar sesión.
         */
        while (!validarCredenciales(usuario, contrasena)) {
            System.out.println("Credenciales incorrectas. Inténtelo de nuevo.");
            System.out.println("Ingrese su usuario:");
            usuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            contrasena = scanner.nextLine();
        }

        //Damos la bienvenida usuario después de que iniciara sesión.
        System.out.println("¡Bienvenido al sistema de registro de medicamentos!");

        // Solicitamos al usuario que registre 10 medicamentos y sus características.
        System.out.println("Por favor, registre los medicamentos (máximo 10):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Medicamento #" + (i + 1) + ":");
            System.out.println("Nombre químico:");
            String nombreQuimico = scanner.nextLine();
            System.out.println("Nombre genérico:");
            String nombreGenerico = scanner.nextLine();
            System.out.println("Nombre registrado:");
            String nombreRegistrado = scanner.nextLine();
            System.out.println("Precio al público:");
            double precioPublico = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Tipo de presentación (solido, semisolido, liquido):");
            String tipoPresentacion = scanner.nextLine();

            // Agregamos el medicamento a través del ControlMedicamentos
            controlMedicamentos.registrarMedicamento(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, tipoPresentacion);

            System.out.println("Medicamento registrado exitosamente.");
            System.out.println("---------------------------------------");
        }

        // Mostrar reporte
        controlMedicamentos.generarReporte();
    }

    // Método para validar las credenciales del usuario
    private static boolean validarCredenciales(String usuario, String contrasena) {
        return usuario.equals("Amaterasu") && contrasena.equals("Fireforse");
    }
}
