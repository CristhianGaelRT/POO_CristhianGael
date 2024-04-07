package edu.gael_rivera.reto9.ui;

// Importaciones de las clases necesarias del paquete process y la clase Scanner de Java
import edu.gael_rivera.reto9.process.ContarPalabraTexto;
import edu.gael_rivera.reto9.process.DepurarTexto;
import edu.gael_rivera.reto9.process.LeerTexto;
import edu.gael_rivera.reto9.process.OrdenarTop10Palabras;
import edu.gael_rivera.reto9.process.SepararTexto;
import java.util.Scanner;

public class CLI {
    /**
     * Esta clase esta encargada para toda la interaccion del ususario
     */
    // Array que contiene los nombres de los archivos de los libros disponibles
    private static final String[] LIBROS = {"Libro1.txt", "Libro2.txt", "Libro3.txt", "Libro4.txt", "Libro5.txt"};

    // Método principal
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Se muestra un mensaje de bienvenida al usuario
        System.out.println("Welcome to the Text Analyzer!");
        // Se solicita al usuario que elija un idioma (1 para inglés, 2 para español)
        System.out.println("Choose a language (1 for English, 2 for Español):");
        // Se lee la elección del idioma del usuario
        int languageChoice = scanner.nextInt();
        // Se declara una variable para almacenar el idioma elegido por el usuario
        Idioma language;
        // Se selecciona el idioma según la elección del usuario
        if (languageChoice == 1) {
            language = new Eng(); // Se crea un objeto Eng para el idioma inglés
        } else if (languageChoice == 2) {
            language = new Esp(); // Se crea un objeto Esp para el idioma español
        } else {
            // Se muestra un mensaje de error si la elección del idioma es inválida, y se establece el idioma predeterminado en inglés
            System.out.println("Invalid language choice. Defaulting to English.");
            language = new Eng();
        }

        // Bucle principal del programa
        while (true) {
            // Se muestra un mensaje para que el usuario seleccione un libro para analizar
            System.out.println(language.getSeleccione_libro());
            // Se muestran los libros disponibles para su análisis
            for (int i = 0; i < LIBROS.length; i++) {
                System.out.println((i + 1) + ". " + LIBROS[i]);
            }
            // Se muestra la opción para salir del programa
            System.out.println("0. " + language.getSalir());
            // Se lee la opción elegida por el usuario
            int option = scanner.nextInt();
            // Se verifica la opción elegida por el usuario
            if (option == 0) {
                // Si la opción es 0, se muestra un mensaje de despedida y se sale del bucle
                System.out.println(language.getHasta_luego());
                break;
            } else if (option >= 1 && option <= 5) {
                // Si la opción está entre 1 y 5, se analiza el libro seleccionado por el usuario
                analyzeBook(LIBROS[option - 1], language);
            } else {
                // Si la opción no es válida, se muestra un mensaje de error
                System.out.println(language.getOpcion_no_valida());
            }
        }
        // Se cierra el objeto Scanner después de su uso
        scanner.close();
    }


    /**
     * Este metodo es para analizar el libro seleccionado
     * @param book Es el libro seleccionado
     * @param language Es el idioma prolongado del usuario
     */
    private static void analyzeBook(String book, Idioma language) {
        // Se lee el texto del libro
        String text = LeerTexto.leer(book);
        // Se limpia el texto eliminando caracteres no alfabéticos y convirtiendo en minusculas
        String cleanedText = DepurarTexto.depurar(text);
        // Se separa el texto en palabras
        String[] words = SepararTexto.separar(cleanedText);
        // Se cuentan las palabras
        String[] countedWords = ContarPalabraTexto.contar(words);
        // Se ordenan las palabras por frecuencia
        String[] top10Words = OrdenarTop10Palabras.ordenar(countedWords);

        // Se muestra el resultado del análisis al usuario
        System.out.println(language.getLas_10_palabras() + book + language.getSon());
        for (String word : top10Words) {
            System.out.println(word);
        }
    }
}
