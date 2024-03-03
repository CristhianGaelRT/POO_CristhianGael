package edu.gael_rivera.reto5.reto5_4.data;

public class Contacto {
    private String nombre;
    private String direccion;
    private String telefonoCasa;
    private String telefonoTrabajo;

    public Contacto(String nombre, String direccion, String telefonoCasa, String telefonoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
}
