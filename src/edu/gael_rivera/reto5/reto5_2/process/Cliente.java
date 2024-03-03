package edu.gael_rivera.reto5.reto5_2.process;

import edu.gael_rivera.reto5.reto5_2.data.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int ID;
    private String nombre;
    private List<CuentaBancaria> cuentasBancarias;

    public Cliente(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        this.cuentasBancarias = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentasBancarias.add(cuenta);
    }

    public double consultarSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldo();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }
}
