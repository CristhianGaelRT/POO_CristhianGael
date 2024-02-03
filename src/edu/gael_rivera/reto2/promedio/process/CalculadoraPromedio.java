package edu.gael_rivera.reto2.promedio.process;

/**
 * Esta clase sirve para realizar calculos del promedio del ulumno incluye el metodo
 * Promedio del alumno
 */
public class CalculadoraPromedio {
    /**
     * Este metodo sirve para calcular el promedio del alumno
     * @param calificaciones es la calificacion obtenida del alumno
     * @return promedio del alumno
     */
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        // Sumamos todas las calificaciones en el arreglo
        // Sirve para proporcionar al método las calificaciones sobre las cuales calculará el promedio
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        // Calcula el promedio del alumno
        return suma / calificaciones.length;
    }
}