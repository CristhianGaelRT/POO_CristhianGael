//Declaración del paquete y las importaciones
package edu.gael_rivera.reto3.diccionario;

import edu.gael_rivera.reto3.diccionario.process.Diccionario;
import edu.gael_rivera.reto3.diccionario.ui.CLI;

public class Main {
    /**
     * Se definen dos arreglos de cadenas (String[]) llamados
     * palabras y significados, que contienen las palabras
     * y sus significados correspondientes.
     * @param args es un arreglo de cadenas (array of strings)
     */
    public static void main(String[] args) {
        String palabras[] = {"anime", "japon", "casa", "leon", "cuaderno", "fotografia", "musica",
                "audifonos", "ejercito", "pais"};
        String significados[] = {"animacion japonesa", "pais asiatico", "vivienda del ser humano",
                "animal felino", "objeto para escribir o dibujar", "imagen plasmada en hoja",
                "sonidos armonicos", "objeto electronico para escuchar",
                "institucion encargada para actos belicos", "territorio constituido en estado soberano"};

        /**
         * Se crea un objeto de la clase Diccionario utilizando
         * el constructor que recibe los arreglos de palabras y
         * significados como parámetros.
         */
        Diccionario diccionario = new Diccionario(palabras, significados);
        CLI.mostrarMenu(diccionario);
    }
}
