package edu.gael_rivera.reto5.reto5_2;

import edu.gael_rivera.reto5.reto5_2.data.CuentaBancaria;
import edu.gael_rivera.reto5.reto5_2.process.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Cristhian Gael");
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", 13000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("987654321", 20000.0);

        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);

        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Cuentas asociadas:");
        for (CuentaBancaria cuenta : cliente1.getCuentasBancarias()) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Saldo: $" + cuenta.getSaldo());
        }
    }
}
