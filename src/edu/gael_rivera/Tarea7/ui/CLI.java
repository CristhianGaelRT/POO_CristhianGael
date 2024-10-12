package edu.gael_rivera.Tarea7.ui;

import edu.gael_rivera.Tarea7.process.Continente;
import edu.gael_rivera.Tarea7.process.Nodo;
import edu.gael_rivera.Tarea7.process.Operador;

import javax.swing.*;

public class CLI {
    private Continente continente;
    private Operador operador;

    public CLI(){
        continente= new Continente();
        operador= new Operador();
    }
    public void strart(){
        addPaises();
        continente.mostrarArbol();
    }
    private void addPaises(){
        do {
            Nodo pais= operador.getPais();
            if (pais != null){
                continente.addPais(pais);
                operador.addEstadosToPais(pais);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseas agregar otro país?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION);
    }
}
