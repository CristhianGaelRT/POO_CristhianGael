package edu.gael_rivera.Evidencia_2.ui;
/**
 * Clase que proporciona textos del menu en Español.
 */


public class Esp extends Idioma {
    // Sobrescribe el método para obtener el mensaje de bienvenida en español
    @Override
    public String getBienvenida() {
        return """
               Bienvenido al simulador de costo de aplicación de streaming...
               
               Porfavor ingrese sus credenciales
               """;
    }

    // Sobrescribe el método para obtener el mensaje de ingreso de usuario en español
    @Override
    public String getIngrese_Usuario() {
        return "Usuario";
    }

    // Sobrescribe el método para obtener el mensaje de ingreso de contraseña en español
    @Override
    public String getIngrese_Contrsena() {
        return "Contraseña";
    }

    // Sobrescribe el método para obtener el mensaje del reporte de consumo en español
    @Override
    public String getMostrar_reporteConsumo() {
        return "Reporte de consumo: ";
    }

    // Sobrescribe el método para obtener el mensaje del nombre del artículo en español
    @Override
    public String getMostar_reporteConsumo_Nombre() {
        return "Nombre: ";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo en español
    @Override
    public String getMostrar_reporteConsumo_Tipo() {
        return ", Tipo: ";
    }

    // Sobrescribe el método para obtener el mensaje del género del artículo en español
    @Override
    public String getMostrar_reporteConsumo_Genero() {
        return ", Genero: ";
    }

    // Sobrescribe el método para obtener el mensaje de si el artículo es un estreno en español
    @Override
    public String getMostrar_reporteConsumo_Estreno() {
        return ", Estreno: ";
    }

    // Sobrescribe el método para obtener el mensaje de sí un artículo es un estreno en español
    @Override
    public String getMostrar_reporteConsumo_Verdadero() {
        return "Si";
    }

    // Sobrescribe el método para obtener el mensaje de no un artículo es un estreno en español
    @Override
    public String getMostrar_reporteConsumo_Falso() {
        return "No";
    }

    // Sobrescribe el método para obtener el mensaje del estimado en español
    @Override
    public String getMostrar_estimado() {
        return "Estimado ";
    }

    // Sobrescribe el método para obtener el mensaje del monto a pagar en español
    @Override
    public String getMostrar_Monto() {
        return ", Su monto a pagar es: ";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como música en español
    @Override
    public String getMostrar_Musica() {
        return "Musica";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como videojuego en español
    @Override
    public String getMostrar_Videojuego() {
        return "Videojuego";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como libro en español
    @Override
    public String getMostrar_Libro() {
        return "Libro";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de artículo como película en español
    @Override
    public String getMostrar_Pelicula() {
        return "Pelicula";
    }

    // Sobrescribe el método para obtener el mensaje del género como J-POP en español
    @Override
    public String getMostrar_jPOP() {
        return "J-POP";
    }

    // Sobrescribe el método para obtener el mensaje del género como alt-POP en español
    @Override
    public String getMostrar_altPOP() {
        return "alt-POP";
    }

    // Sobrescribe el método para obtener el mensaje del género como novela en español
    @Override
    public String getMostrar_Novela() {
        return "Novela";
    }

    // Sobrescribe el método para obtener el mensaje del género como tecnología en español
    @Override
    public String getMostrar_Tecnología() {
        return "Tecnología";
    }

    // Sobrescribe el método para obtener el mensaje del tipo de producto en español
    @Override
    public String getMostrar_Producto() {
        return "Producto";
    }
}
