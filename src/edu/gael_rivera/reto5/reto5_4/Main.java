package edu.gael_rivera.reto5.reto5_4;

import edu.gael_rivera.reto5.reto5_4.data.Contacto;
import edu.gael_rivera.reto5.reto5_4.data.ListaContactos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaContactos listaContactos = new ListaContactos();

        // Crear nuevos contactos
        Contacto contacto1 = new Contacto("Cristhian Gael", "123 Calle Principal", "123456789", "987654321");
        Contacto contacto2 = new Contacto("Ely Calorina", "456 Calle Secundaria", "987654321", "123456789");

        // Agregar contactos a la lista
        listaContactos.agregarContacto(contacto1);
        listaContactos.agregarContacto(contacto2);

        // Pedir al usuario que ingrese el nombre del contacto a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del contacto que desea buscar: ");
        String nombreABuscar = scanner.nextLine();

        // Buscar un contacto por nombre
        Contacto contactoEncontrado = listaContactos.buscarContacto(nombreABuscar);
        if (contactoEncontrado != null) {
            System.out.println("Contacto encontrado:");
            System.out.println("Nombre: " + contactoEncontrado.getNombre());
            System.out.println("Dirección: " + contactoEncontrado.getDireccion());
            System.out.println("Teléfono de Casa: " + contactoEncontrado.getTelefonoCasa());
            System.out.println("Teléfono de Trabajo: " + contactoEncontrado.getTelefonoTrabajo());
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
}
