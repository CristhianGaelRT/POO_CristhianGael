package edu.gael_rivera.Tarea7.process;

import java.util.ArrayList;

public class Nodo {
    private String name;
    private ArrayList<Nodo> hijos;

    public Nodo(String name) {
        this.name= name;
        this.hijos= new ArrayList<>();
    }
    public  String getName(){
        return name;
    }
    public ArrayList<Nodo> getHijos(){
        return hijos;

    }
    public void  addHijo(Nodo hijo){
        hijos.add(hijo);
    }
}
