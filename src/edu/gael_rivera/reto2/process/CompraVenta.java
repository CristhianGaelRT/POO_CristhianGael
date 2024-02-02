/*package edu.gael_rivera.reto2.process;

public class CompraVenta {

    public static double comprarcajasdepapel(double numCajasCompra, double costoCaja) {
        double monto = (numCajasCompra)*(costoCaja);
        System.out.println("el monto resultante es "+monto);
        return monto;
    }

    public static double vendercajasdepapel (double numCajas, double costoCaja){
        double montoventa = (numCajas)*(costoCaja);
        System.out.println("el monto resultante de la venta es "+ montoventa);
        return montoventa;
    }

}*/
package edu.gael_rivera.reto2.process;

public class CompraVenta {

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
