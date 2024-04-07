package edu.gael_rivera.Evidencia_2.ui;

/**
 * Clase abstracta que define métodos para obtener mensajes en diferentes idiomas
 */
public abstract class Idioma {
    // Métodos abstractos para obtener los mensajes en el idioma específico
    public abstract String getBienvenida(); // Mensaje de bienvenida
    public abstract String getIngrese_Usuario(); // Mensaje para ingresar el usuario
    public abstract String getIngrese_Contrsena(); // Mensaje para ingresar la contraseña
    public abstract String getMostrar_reporteConsumo(); // Mensaje para mostrar el reporte de consumo
    public abstract String getMostar_reporteConsumo_Nombre(); // Mensaje para mostrar el nombre del artículo en el reporte de consumo
    public abstract String getMostrar_reporteConsumo_Tipo(); // Mensaje para mostrar el tipo del artículo en el reporte de consumo
    public abstract String getMostrar_reporteConsumo_Genero(); // Mensaje para mostrar el género del artículo en el reporte de consumo
    public abstract String getMostrar_reporteConsumo_Estreno(); // Mensaje para mostrar si el artículo es un estreno en el reporte de consumo
    public abstract String getMostrar_reporteConsumo_Verdadero(); // Mensaje para indicar que un artículo es un estreno en el reporte de consumo
    public abstract String getMostrar_reporteConsumo_Falso(); // Mensaje para indicar que un artículo no es un estreno en el reporte de consumo
    public abstract String getMostrar_estimado(); // Mensaje para mostrar el monto estimado a pagar
    public abstract String getMostrar_Monto(); // Mensaje para mostrar el monto total a pagar
    public abstract String getMostrar_Musica(); // Mensaje para indicar el tipo de artículo como música
    public abstract String getMostrar_Videojuego(); // Mensaje para indicar el tipo de artículo como videojuego
    public abstract String getMostrar_Libro(); // Mensaje para indicar el tipo de artículo como libro
    public abstract String getMostrar_Pelicula(); // Mensaje para indicar el tipo de artículo como película
    public abstract String getMostrar_jPOP(); // Mensaje para indicar el género como J-POP
    public abstract String getMostrar_altPOP(); // Mensaje para indicar el género como ALT-POP
    public abstract String getMostrar_Novela(); // Mensaje para indicar el género como novela
    public abstract String getMostrar_Tecnología(); // Mensaje para indicar el género como tecnología
    public abstract String getMostrar_Producto(); // Mensaje para indicar el tipo de producto
}
