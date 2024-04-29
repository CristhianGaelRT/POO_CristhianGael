/**
 * Esta clase se encarga de encontrar palabras con un número impar de letras y sin letras repetidas.
 */
package edu.gael_rivera.reto12.process;

import java.util.ArrayList;

public class PalabraLetraImpar {
    /**
     * Encuentra palabras en un arreglo de palabras que tienen un número impar de letras y no tienen letras repetidas.
     * @param palabras Arreglo de palabras.
     * @return Arreglo de palabras con un número impar de letras y sin letras repetidas.
     */


    public static String[] palabrasConLetraImpar(String[] palabras) {
        ArrayList<String> resultado = new ArrayList<>();

        for (String palabra : palabras) {
            if (palabra.length() % 2 != 0) {
                resultado.add(palabra);
            }
        }

        return resultado.toArray(new String[resultado.size()]);
    }
}
