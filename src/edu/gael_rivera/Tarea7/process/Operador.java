package edu.gael_rivera.Tarea7.process;

import javax.swing.*;

public class Operador {
    public Nodo getPais(){
        String paisName= JOptionPane.showInputDialog("Agregue un pais para America: ");
        if (paisName !=null && !paisName.isEmpty()){
            return new Nodo(paisName);
        }
        return null;
    }
    public void addEstadosToPais(Nodo pais){
        String estadoName;
        do {
            estadoName= JOptionPane.showInputDialog("Agrega un estado para "+ pais.getName() + ":");
            if (estadoName != null && !estadoName.isEmpty()){
                Nodo estado= new Nodo(estadoName);
                pais.addHijo(estado);
                addCiudadesToEstado(estado);
            }

        }while (JOptionPane.showConfirmDialog(null, "Deseas agregar otro estado a " + pais.getName() + "?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
    }
    public void addCiudadesToEstado(Nodo estado){
        String ciudadName;
        do {
            ciudadName= JOptionPane.showInputDialog("Agregue una ciudad para " + estado.getName() + ":");
            if (ciudadName != null && !ciudadName.isEmpty()){
                Nodo ciudad= new Nodo(ciudadName);
                estado.addHijo(ciudad);
            }
        } while (JOptionPane.showConfirmDialog(null,"Deseas agregar otra ciudad a " + estado.getName() + "?","", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
    }
}

