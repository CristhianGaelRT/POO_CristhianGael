
package edu.gael_rivera.reto12.ui;

public class Eng extends Idioma {
    /**
     * Class that defines messages in English for user interaction.
     */
    @Override
    public String getSeleccione_libro() {
        return "Select a book to analyze (1-5), or enter '0' to exit:";
    }

    @Override
    public String getSalir() {
        return "Exit";
    }

    @Override
    public String getHasta_luego() {
        return "Goodbye!";
    }

    @Override
    public String getOpcion_no_valida() {
        return "Invalid option. Try again.";
    }

    @Override
    public String getTop_10_palabras() {
        return "Top 10 most repeated words:";
    }

    @Override
    public String getNumero_vocales() {
        return "The number of vowels in the book is: ";
    }

    @Override
    public String getVocales_alfabeticamente() {
        return "Vowels starting alphabetically:";
    }

    @Override
    public String getPalabra_mas_corta() {
        return "The shortest word is: ";
    }

    @Override
    public String getPalabra_mas_larga() {
        return "The longest word is: ";
    }

    @Override
    public String getPalabras_con_letra_impar() {
        return "Words with odd number of letters:";
    }

    @Override
    public String getPalabras_con_vocales_terminadas() {
        return "Words starting and ending with a vowel:";
    }
}
