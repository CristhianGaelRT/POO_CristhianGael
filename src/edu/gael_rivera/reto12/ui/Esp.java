package edu.gael_rivera.reto12.ui;

public class Esp extends Idioma {
    /**
     * Clase que define los mensajes en español para la interacción del usuario.
     */
    @Override
    public String getSeleccione_libro() {
        return "Seleccione un libro para analizar (1-5), o ingrese '0' para salir:";
    }

    @Override
    public String getSalir() {
        return "Salir";
    }

    @Override
    public String getHasta_luego() {
        return "¡Hasta luego!";
    }

    @Override
    public String getOpcion_no_valida() {
        return "Opción no válida. Intente de nuevo.";
    }

    @Override
    public String getTop_10_palabras() {
        return "Las 10 palabras más repetidas son:";
    }

    @Override
    public String getNumero_vocales() {
        return "El número de vocales en el libro es: ";
    }

    @Override
    public String getVocales_alfabeticamente() {
        return "Vocales que empiezan alfabéticamente:";
    }

    @Override
    public String getPalabra_mas_corta() {
        return "La palabra más corta es: ";
    }

    @Override
    public String getPalabra_mas_larga() {
        return "La palabra más larga es: ";
    }

    @Override
    public String getPalabras_con_letra_impar() {
        return "Palabras con número impar de letras:";
    }

    @Override
    public String getPalabras_con_vocales_terminadas() {
        return "Palabras que empiezan y terminan con una vocal:";
    }
}
