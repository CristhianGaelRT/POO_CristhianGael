package edu.gael_rivera.reto12.ui;

import edu.gael_rivera.reto12.process.*;
import edu.gael_rivera.reto12.process.Top10;

import java.util.Map;
import java.util.Scanner;

/**
 * Esta clase maneja la interacción con el usuario.
 */
public class CLI {

    /**
     * Array que contiene los nombres de los archivos de los libros disponibles.
     */
    private static final String[] LIBROS = {"Libro1.txt", "Libro2.txt", "Libro3.txt", "Libro4.txt", "Libro5.txt"};

    /**
     * Método principal.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Idioma language = chooseLanguage(scanner);

        while (true) {
            System.out.println(language.getSeleccione_libro());
            for (int i = 0; i < LIBROS.length; i++) {
                System.out.println((i + 1) + ". " + LIBROS[i]);
            }
            System.out.println("0. " + language.getSalir());
            int option = scanner.nextInt();
            if (option == 0) {
                System.out.println(language.getHasta_luego());
                break;
            } else if (option >= 1 && option <= 5) {
                String book = LIBROS[option - 1];
                System.out.println("Las 10 palabras más repetidas en " + book + " son:");
                String text = LeerTexto.leer(book);
                analyzeBook(text, language);
            } else {
                System.out.println(language.getOpcion_no_valida());
            }
        }
        scanner.close();
    }

    /**
     * Método para seleccionar el idioma.
     * @param scanner Scanner para leer la entrada del usuario.
     * @return Objeto Idioma seleccionado.
     */
    private static Idioma chooseLanguage(Scanner scanner) {
        System.out.println("Choose a language (1 for English, 2 for Español):");
        int languageChoice = scanner.nextInt();
        Idioma language;
        if (languageChoice == 1) {
            language = new Eng();
        } else if (languageChoice == 2) {
            language = new Esp();
        } else {
            System.out.println("Invalid language choice. Defaulting to English.");
            language = new Eng();
        }
        return language;
    }

    /**
     * Método para analizar el contenido de un libro.
     * @param text Texto del libro.
     * @param language Idioma seleccionado.
     */
    private static void analyzeBook(String text, Idioma language) {
        String cleanedText = DepurarTexto.depurar(text);
        String[] words = SepararTexto.separar(cleanedText);
        String[] countedWords = edu.gael_rivera.reto9.process.ContarPalabraTexto.contar(words);
        String[] top10Words = Top10.ordenar(countedWords);

        for (String word : top10Words) {
            System.out.println(word);
        }

        int totalVocales = ContarVocales.contar(cleanedText);
        System.out.println("Número total de vocales: " + totalVocales);

        String[] vocalesOrdenadas = ContVocalesAlfabeticamente.vocalesAlfabeticamente(cleanedText);
        System.out.println("Vocales en orden alfabético: ");
        for (String vocal : vocalesOrdenadas) {
            System.out.print(vocal + " ");
        }
        System.out.println();

        String palabraMasCorta = PalabraCorta.palabraCorta(words);
        System.out.println("Palabra más corta: " + palabraMasCorta);

        String palabraMasLarga = PalabraLarga.palabraLarga(words);
        System.out.println("Palabra más larga: " + palabraMasLarga);

        String[] palabrasLetraImpar = PalabraLetraImpar.palabrasConLetraImpar(words);
        System.out.println("Palabras con número impar de letras: ");
        for (String palabra : palabrasLetraImpar) {
            System.out.print(palabra + " ");
        }
        System.out.println();

        String[] palabrasConVocalesSemejantes = VocalesSemejantes.palabrasConVocalesSemejantes(words);
        System.out.println("Palabras que empiezan y terminan con una vocal y tienen al menos 5 letras: ");
        for (String palabra : palabrasConVocalesSemejantes) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}
