package edu.gael_rivera.Evidencia_1.data;

/**
 * Esta Clase encapsula la información relacionada con el registro del
 * medicamento
 */
public class Medicamento {
    // Atributos de la clase
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private String tipoPresentacion;

    // Constructor de la clase

    /**
     * Este es el constructor de la clase Medicamento.
     * Recibe como parámetros los detalles del medicamento y los asigna
     * a los atributos correspondientes. Además, calcula el precio
     * de venta del medicamento utilizando el método calcularPrecioVenta().
     * @param nombreQuimico Es el nombre de la estructura química de la sustancia.
     * @param nombreGenerico Es el nombre del género que pertenece el fármaco.
     * @param nombreRegistrado Es el nombre que el usuario registra.
     * @param precioPublico Es el precio del fármaco que se le da al público.
     * @param tipoPresentacion Es la forma farmacéutica que se asigna al fármaco en forma sólida, semisólida y liquida.
     */
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, String tipoPresentacion) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.tipoPresentacion = tipoPresentacion;
        // Calcula el precio de venta del medicamento
        this.precioVenta = calcularPrecioVenta();
    }

    /**
     * Este es un método privado que calcula el precio
     * de venta del medicamento basado en su tipo de presentación.
     * Dependiendo del tipo de presentación, se aplica un
     * porcentaje adicional al precio al público.
     * @return Es el precio adicional que se le da al publico.
     */
    private double calcularPrecioVenta() {
        double porcentajeAdicional = 0.0;
        switch (tipoPresentacion) {
            case "solido":
                porcentajeAdicional = 0.09;
                break;
            case "semisolido":
                porcentajeAdicional = 0.12;
                break;
            case "liquido":
                porcentajeAdicional = 0.13;
                break;
            default:
                // Si el tipo de presentación no es válido, imprimime un mensaje de advertencia
                System.out.println("Tipo de presentación inválido.");
        }
        // Calcular y devolver el precio de venta
        return precioPublico * (1 + porcentajeAdicional);
    }

    /**
     * Se proporcionan getters para acceder a los atributos
     * del medicamento desde otras clases. Estos métodos permiten
     * obtener el nombre químico, nombre genérico, nombre registrado,
     * precio al público, precio de venta y tipo de presentación del medicamento.
     * @return Recopila los datos ingresados del fármaco.
     */
    public String getNombreQuimico() {
        return nombreQuimico;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public String getNombreRegistrado() {
        return nombreRegistrado;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getTipoPresentacion() {
        return tipoPresentacion;
    }
}
