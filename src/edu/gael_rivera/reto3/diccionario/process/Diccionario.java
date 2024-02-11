//Declaración del paquete y las importaciones
package edu.gael_rivera.reto3.diccionario.process;

import java.util.Arrays;

public class Diccionario {
    /**
     * Esta clase esmpara todos los calculos y arreglos
     */

    /**
     * Declaración de variables de instancia
     */
    private String[] palabras;
    private String[] significados;

    /**
     * Hacemos un constructor que recibe dos arreglos de cadenas
     * @param palabras Son las palabras agregadas al diccionario
     * @param significados Son las definiciones dadas a las palabras
     */

    public Diccionario(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }

    /**
     * Este método recibe una palabra como parámetro y busca su significado en el diccionario.
     * @param palabra son las palabras selccionadas para el diccionario
     * @return Verificacion para la palabra para ver si esta o no esta en el diccionario.
     * Si la palabra se encuentra en el diccionario, devuelve su significado; de lo contrario,
     * devuelve un mensaje indicando que la palabra no está en el diccionario.
     */
    public String buscarSignificado(String palabra) {
        int indice = obtenerIndice(palabra);
        if (indice != -1) {
            return significados[indice];
        } else {
            return "La palabra que busca no está en el diccionario";
        }
    }

    /**
     * Este método imprime todas las palabras del diccionario
     * en la consola, enumerándolas.
     */
    public void listarPalabras() {
        System.out.println("Contenido del diccionario:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("%d. %s%n", i + 1, palabras[i]);
        }
    }

    /**
     * Este método imprime información detallada sobre el diccionario,
     * incluyendo la cantidad de palabras, cada palabra con su
     * longitud y la longitud de su significado.
     */
    public void detalleDiccionario() {
        System.out.println("Cantidad de palabras en el diccionario: " + palabras.length);
        System.out.println("Detalle del diccionario:");
        //Se utiliza para iterar sobre cada elemento del arreglo palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("%d. %s, cantidad caracteres: %d, cantidad caracteres significado: %d%n",
                    i + 1, palabras[i], palabras[i].length(), significados[i].length());
        }
    }

    /**
     * Este método privado recibe una palabra como parámetro y
     * busca su índice en el arreglo palabras.
     * Utiliza un bucle for para recorrer el arreglo y compara
     * cada palabra con la palabra proporcionada, ignorando
     * las diferencias de mayúsculas y minúsculas.
     * @param palabra son las palabras selccionadas para el diccionario
     * @return Si encuentra la palabra, devuelve su índice;
     * de lo contrario, devuelve -1 para indicar que la palabra no se
     * encuentra en el diccionario.
     */
    private int obtenerIndice(String palabra) {
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                return i;
            }
        }
        return -1;
    }
}
