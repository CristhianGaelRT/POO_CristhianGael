package edu.gael_rivera.Evidencia_2.ui;

import edu.gael_rivera.Evidencia_2.data.Articulo;
import edu.gael_rivera.Evidencia_2.process.CalculoCosto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CLI {
    /**
     * Método principal que inicia la CLI, dando la bienvenida dandole la opcion de escoger
     * un idioma y darle al usuario un reporte de striming.
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("1. Español");
        System.out.println("2. English");
        int idioma = scanner.nextInt();
        Idioma language;
        if (idioma == 1) {
            language = new Esp(); // Instanciamos el idioma español
        } else if (idioma == 2) {
            language = new Ing(); // Instanciamos el idioma inglés
        } else {
            System.out.println("Invalid language choice."); // Opción de idioma inválida
            return;
        }
        // Simular inicio de sesión
        System.out.println(language.getBienvenida());

        scanner.nextLine(); // Consumir la nueva línea

        System.out.print(language.getIngrese_Usuario());
        String usuario = scanner.nextLine();

        System.out.print(language.getIngrese_Contrseña());
        String contrasena = scanner.nextLine();

        // Simular generación aleatoria de consumo del usuario
        ArrayList<Articulo> productosConsumidos = generarConsumoAleatorio(idioma);

        // Mostrar reporte de consumo
        System.out.println(language.getMostrar_reporteConsumo());
        for (Articulo articulo : productosConsumidos) {
            System.out.println(language.getMostar_reporteConsumo_Nombre() + articulo.getNombre() + language.getMostrar_reporteConsumo_Tipo() + articulo.getTipo() +
                    language.getMostrar_reporteConsumo_Genero() + articulo.getGenero() + language.getMostrar_reporteConsumo_Estreno() + (articulo.esEstreno() ? language.getMostrar_reporteConsumo_Verdadero() : language.getMostrar_reporteConsumo_Falso()));
        }

        // Calcular el monto a pagar
        CalculoCosto calculadora = new CalculoCosto();
        double montoTotal = calculadora.calcularCosto(productosConsumidos);

        // Mostrar el monto a pagar
        System.out.println(language.getMostrar_estimado() + usuario + language.getMostrar_Monto() + montoTotal);

        // Cerrar el scanner
        scanner.close();
    }

    /**
     * Este metodo es para mostras los articulos consumidos de manera aleatoria
     * @param idioma define métodos para obtener mensajes en diferentes idiomas
     * @return
     */
    private static ArrayList<Articulo> generarConsumoAleatorio(int idioma) {
        ArrayList<Articulo> productosConsumidos = new ArrayList<>();
        Random random = new Random();
        Idioma language = idioma == 1 ? new Esp() : new Ing();

        String[] tipos = {language.getMostrar_Musica(), language.getMostrar_Videojuego(), language.getMostrar_Libro(), language.getMostrar_Pelicula()};
        String[] generos = {language.getMostrar_jPOP(), language.getMostrar_altPOP(), language.getMostrar_Novela(), language.getMostrar_Tecnología()};

        // Simular entre 5 y 10 productos consumidos
        int numProductos = random.nextInt(6) + 5;
        for (int i = 0; i < numProductos; i++) {
            String tipo = tipos[random.nextInt(tipos.length)];
            String genero = generos[random.nextInt(generos.length)];
            boolean esEstreno = random.nextBoolean();

            productosConsumidos.add(new Articulo(language.getMostrar_Producto() + (i + 1), tipo, genero, esEstreno));
        }

        return productosConsumidos;
    }
}
