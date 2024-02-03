package edu.gael_rivera.reto2.caja.process;
/**
 * Esta clase sirve para realizar calculos de la compre y venta de las cajas
 * Compra y venta
 */
public class CompraVenta {
    /**
     * Esta clase sirve para calcular las comprar y ventas del usuari.
     * @param numCajas es el numero de cajas en la que se desea vender o comprar
     * @param costoCaja es el costo por la caja que se desea vender o comprar
     * @param esVenta es la venta obtenida que se obtuvo en el proceso de la venta
     * @return es el monto de las ganncias obtenidas
     * Este método calcula el monto total de una transacción de compra o venta de cajas de papel.
     * Verifica que los parámetros numCajas y costoCaja sean valores positivos. Si no lo son,
     * lanza una excepción IllegalArgumentException, indicando que los parámetros deben ser positivos.
     * Calcula el monto total multiplicando el número de cajas por el costo unitario de cada caja.
     * Aplica un descuento del 5% si el monto total es igual o superior a 50000.
     * Si la transacción es una venta, se aplica un descuento adicional del 2%.
     */

    private static double calcularMonto(double numCajas, double costoCaja, boolean esVenta) {
        if (numCajas <= 0 || costoCaja <= 0) {
            throw new IllegalArgumentException("Los parametros deben ser positivos");
        }
        double monto = numCajas * costoCaja;
        if (monto >= 50000) {
            monto -= monto * 0.05;
        }
        if (esVenta) {
            // Descuento adicional del 2% en ventas
            monto -= monto * 0.02;
        }
        return monto;
    }

    /**
     * Estos métodos encapsulan la lógica de compra y venta de cajas de papel.
     * Utilizan un bloque try-catch para capturar cualquier excepción
     * IllegalArgumentException que pueda ser lanzada por el método calcularMonto().
     * Si se lanza una excepción, imprime un mensaje de error en la consola y
     * devuelve -1 para indicar un error.
     * En caso contrario, devuelve el monto total calculado por el método calcularMonto().
     * @param numCajas es el numero de cajas en la que se desea vender o comprar
     * @param costoCaja es el costo por la caja que se desea vender o comprar
     * @return
     */
    public static double comprarcajasdepapel(double numCajas, double costoCaja) {
        try {
            return calcularMonto(numCajas, costoCaja, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1; // Valor de retorno indicando error
        }
    }

    public static double vendercajaspapel(double numCajas, double costoCaja) {
        try {
            return calcularMonto(numCajas, costoCaja, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1; // Valor de retorno indicando error
        }
    }
}
