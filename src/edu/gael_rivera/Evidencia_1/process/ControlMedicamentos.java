package edu.gael_rivera.Evidencia_1.process;
/**
 * Esta clase sirve para llevar el control y del registro de
 * los medicamentos, incluye la clase: ControlMedicamentos.
 * Importamos la clase Medicamento al paquete de data.
 */

import edu.gael_rivera.Evidencia_1.data.Medicamento;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Este método se encarga de llevar el control y registro del medicamento.
 */
public class ControlMedicamentos {
    /**
     * Este método se encarga de llevar a cabo la lista de
     * medicamentos y sus características y el reporte.
     */
    private ArrayList<Medicamento> listaMedicamentos; // Lista para almacenar los medicamentos registrados
    private String nombreRegistrador; // Nombre del usuario que registró los medicamentos
    private LocalDate fechaReporte; // Fecha en la que se generó el reporte


    // Constructor de la clase
    public ControlMedicamentos() {
        // Inicialización de atributos en el constructor
        this.listaMedicamentos = new ArrayList<>();
        this.nombreRegistrador = "";
        this.fechaReporte = LocalDate.now();
    }

    /**
     * Método para registrar un medicamento
     * @param nombreQuimico Es el nombre de la estructura química de la sustancia.
     * @param nombreGenerico Es el nombre del género que pertenece el fármaco.
     * @param nombreRegistrado Es el nombre que el usuario registra.
     * @param precioPublico Es el precio del fármaco que se le da al público.
     * @param tipoPresentacion Es la forma farmacéutica que se asigna al fármaco en forma sólida, semisólida y liquida.
     */
    public void registrarMedicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado,
                                     double precioPublico, String tipoPresentacion) {
        Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado,
                precioPublico, tipoPresentacion);
        listaMedicamentos.add(medicamento);
    }

    /**
     * Este método imprime un reporte detallado de los medicamentos
     * registrados en el sistema. Imprime el nombre del registrador,
     * la fecha de generación del reporte, la cantidad total de medicamentos
     * registrados y luego itera sobre la lista de medicamentos
     * para imprimir los detalles individuales de cada medicamento,
     * como su nombre químico, nombre genérico, etc.
     */

    public void generarReporte() {
        System.out.println("Reporte de medicamentos registrados:");
        System.out.println("Registrador: " + nombreRegistrador);
        System.out.println("Fecha de generación: " + fechaReporte);
        System.out.println("Cantidad de productos registrados: " + listaMedicamentos.size());
        System.out.println("Medicamentos:");
        for (int i = 0; i < listaMedicamentos.size(); i++) {
            Medicamento medicamento = listaMedicamentos.get(i);
            System.out.println("Medicamento #" + (i + 1) + ":");
            System.out.println("Nombre químico: " + medicamento.getNombreQuimico());
            System.out.println("Nombre genérico: " + medicamento.getNombreGenerico());
            System.out.println("Nombre registrado: " + medicamento.getNombreRegistrado());
            System.out.println("Precio al público: " + medicamento.getPrecioPublico());
            System.out.println("Precio de venta: " + medicamento.getPrecioVenta());
            System.out.println("Tipo de presentación: " + medicamento.getTipoPresentacion());
            System.out.println("---------------------------------------");
        }
    }
}
