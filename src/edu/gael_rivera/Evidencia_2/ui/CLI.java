package edu.gael_rivera.Evidencia_2.ui;

import edu.gael_rivera.Evidencia_2.data.Articulo;
import edu.gael_rivera.Evidencia_2.process.CalculoCosto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simular inicio de sesión
        System.out.println("Bienvenido al simulador de costo de la aplicación de streaming.");
        System.out.println("Por favor, inicie sesión.");

        System.out.print("Nombre de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Simular generación aleatoria de consumo del usuario
        ArrayList<Articulo> productosConsumidos = generarConsumoAleatorio();

        // Mostrar reporte de consumo
        System.out.println("Reporte de consumo:");
        for (Articulo articulo : productosConsumidos) {
            System.out.println("Nombre: " + articulo.getNombre() + ", Tipo: " + articulo.getTipo() +
                    ", Género: " + articulo.getGenero() + ", Estreno: " + (articulo.esEstreno() ? "Sí" : "No"));
        }

        // Calcular el monto a pagar
        CalculoCosto calculadora = new CalculoCosto();
        double montoTotal = calculadora.calcularCosto(productosConsumidos);

        // Mostrar el monto a pagar
        System.out.println("Estimado " + usuario + ", el monto a pagar por su consumo es: $" + montoTotal);

        // Cerrar el scanner
        scanner.close();
    }

    private static ArrayList<Articulo> generarConsumoAleatorio() {
        ArrayList<Articulo> productosConsumidos = new ArrayList<>();
        Random random = new Random();

        String[] tipos = {"Música", "Videojuego", "Libro", "Película"};
        String[] generos = {"J-POP", "alt-pop", "novela", "tecnología"};

        // Simular entre 5 y 10 productos consumidos
        int numProductos = random.nextInt(6) + 5;
        for (int i = 0; i < numProductos; i++) {
            String tipo = tipos[random.nextInt(tipos.length)];
            String genero = generos[random.nextInt(generos.length)];
            boolean esEstreno = random.nextBoolean();

            productosConsumidos.add(new Articulo("Producto" + (i + 1), tipo, genero, esEstreno));
        }

        return productosConsumidos;
    }
}
