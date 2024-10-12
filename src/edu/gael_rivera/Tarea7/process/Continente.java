package edu.gael_rivera.Tarea7.process;

public class Continente {
    private Nodo root;

    public Continente(){
        root= new Nodo("America");

    }
    public Nodo getRoot(){
        return root;
    }
    public void addPais(Nodo pais){
        root.addHijo(pais);

    }
    public void mostrarArbol(){
        mostrarNodo(root, 0);

    }
    private void mostrarNodo(Nodo nodo, int indentation){
        for (int i= 0; i < indentation; i++){
            System.out.print("     ");
        }
        System.out.println(nodo.getName());

        for (Nodo hijo: nodo.getHijos()){
            mostrarNodo(hijo, indentation + 1);
        }
    }
}
