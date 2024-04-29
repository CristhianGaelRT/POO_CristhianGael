package edu.gael_rivera.reto12.ui;

public class Esp extends Idioma {
    /**
     * Clase que define los mensajes en espa�ol para la interacci�n del usuario.
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
        return "�Hasta luego!";
    }

    @Override
    public String getOpcion_no_valida() {
        return "Opci�n no v�lida. Intente de nuevo.";
    }

    @Override
    public String getTop_10_palabras() {
        return "Las 10 palabras m�s repetidas son:";
    }

    @Override
    public String getNumero_vocales() {
        return "El n�mero de vocales en el libro es: ";
    }

    @Override
    public String getVocales_alfabeticamente() {
        return "Vocales que empiezan alfab�ticamente:";
    }

    @Override
    public String getPalabra_mas_corta() {
        return "La palabra m�s corta es: ";
    }

    @Override
    public String getPalabra_mas_larga() {
        return "La palabra m�s larga es: ";
    }

    @Override
    public String getPalabras_con_letra_impar() {
        return "Palabras con n�mero impar de letras:";
    }

    @Override
    public String getPalabras_con_vocales_terminadas() {
        return "Palabras que empiezan y terminan con una vocal:";
    }
}
