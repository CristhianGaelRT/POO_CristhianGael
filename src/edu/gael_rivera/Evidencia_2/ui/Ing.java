package edu.gael_rivera.Evidencia_2.ui;

/**
 * Clase que proporciona textos del menu en Ingles.
 */

public class Ing extends Idioma {
    // Sobrescribe el método para obtener el mensaje de bienvenida en inglés
    @Override
    public String getBienvenida() {
        return """
               Welcome to the streaming app cost simulator...
               
               Please enter your credentials
               """;
    }

    // Sobrescribe el método para obtener el mensaje de ingreso de usuario en inglés
    @Override
    public String getIngrese_Usuario() {
        return "User?";
    }

    // Sobrescribe el método para obtener el mensaje de ingreso de contraseña en inglés
    @Override
    public String getIngrese_Contrseña() {
        return "Password?";
    }

    // Sobrescribe el método para obtener el mensaje del reporte de consumo en inglés
    @Override
    public String getMostrar_reporteConsumo() {
        return "Consumption report: ";
    }

    // Sobrescribe el método para obtener el mensaje del nombre del artículo en inglés
    @Override
    public String getMostar_reporteConsumo_Nombre() {
        return "Name: ";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo en inglés
    @Override
    public String getMostrar_reporteConsumo_Tipo() {
        return ", Type:";
    }

    // Sobrescribe el método para obtener el mensaje del género del artículo en inglés
    @Override
    public String getMostrar_reporteConsumo_Genero() {
        return ", Gender: ";
    }

    // Sobrescribe el método para obtener el mensaje de si el artículo es un estreno en inglés
    @Override
    public String getMostrar_reporteConsumo_Estreno() {
        return ", Premiere: ";
    }

    // Sobrescribe el método para obtener el mensaje de sí un artículo es un estreno en inglés
    @Override
    public String getMostrar_reporteConsumo_Verdadero() {
        return "Yes";
    }

    // Sobrescribe el método para obtener el mensaje de no un artículo es un estreno en inglés
    @Override
    public String getMostrar_reporteConsumo_Falso() {
        return "No";
    }

    // Sobrescribe el método para obtener el mensaje del estimado en inglés
    @Override
    public String getMostrar_estimado() {
        return "Dear: ";
    }

    // Sobrescribe el método para obtener el mensaje del monto a pagar en inglés
    @Override
    public String getMostrar_Monto() {
        return ", Your amount to pay is:";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como música en inglés
    @Override
    public String getMostrar_Musica() {
        return "Music";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como videojuego en inglés
    @Override
    public String getMostrar_Videojuego() {
        return "Videogame";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como libro en inglés
    @Override
    public String getMostrar_Libro() {
        return "Book";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como película en inglés
    @Override
    public String getMostrar_Pelicula() {
        return "Movie";
    }

    // Sobrescribe el método para obtener el mensaje del género como J-POP en inglés
    @Override
    public String getMostrar_jPOP() {
        return "J-POP";
    }

    // Sobrescribe el método para obtener el mensaje del género como ALT-POP en inglés
    @Override
    public String getMostrar_altPOP() {
        return "ALT-POP";
    }

    // Sobrescribe el método para obtener el mensaje del género como novela en inglés
    @Override
    public String getMostrar_Novela() {
        return "Novel";
    }

    // Sobrescribe el método para obtener el mensaje del género como tecnología en inglés
    @Override
    public String getMostrar_Tecnología() {
        return "Tecnology";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de producto en inglés
    @Override
    public String getMostrar_Producto() {
        return "Product";
    }
}
