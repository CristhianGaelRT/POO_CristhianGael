// CLI.java
package edu.gael_rivera.reto9.ui;

import java.util.Scanner;

import edu.gael_rivera.reto9.process.ContarPalabraTexto;
import edu.gael_rivera.reto9.process.DepurarTexto;
import edu.gael_rivera.reto9.process.LeerTexto;
import edu.gael_rivera.reto9.process.OrdenarTop10Palabras;
import edu.gael_rivera.reto9.process.SepararTexto;

public class CLI {
    private static final String[] LIBROS = {"Libro1.txt", "Libro2.txt", "Libro3.txt", "Libro4.txt", "Libro5.txt"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al Analizador de Texto!");

        while (true) {
            System.out.println("Seleccione un libro para analizar (1-5), o ingrese '0' para salir:");
            for (int i = 0; i < LIBROS.length; i++) {
                System.out.println((i + 1) + ". " + LIBROS[i]);
            }
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("¡Hasta luego!");
                break;
            } else if (opcion >= 1 && opcion <= 5) {
                analizarLibro(LIBROS[opcion - 1]);
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    private static void analizarLibro(String libro) {
        String texto = LeerTexto.leer(libro);
        String textoDepurado = DepurarTexto.depurar(texto);
        String[] palabras = SepararTexto.separar(textoDepurado);
        String[] palabrasContadas = ContarPalabraTexto.contar(palabras);
        String[] top10Palabras = OrdenarTop10Palabras.ordenar(palabrasContadas);

        System.out.println("Las 10 palabras más usadas en " + libro + " son:");
        for (String palabra : top10Palabras) {
            System.out.println(palabra);
        }
    }
}
