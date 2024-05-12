package edu.gael_rivera.Evidencia_3.process.metodos_jugadores;

import java.util.Scanner;

public class Metodo_RegistroDatos_Jugador2 extends Metodos_Jugadores{
    /**
     * Clase donde sobre escribe los metodos para registrar jugadores y caracteres del usuario
     */

    @Override
    public String Guardar_NombresJugadores(String jugador) {
        //Se invoca scanner para leer salidas del usuario
        Scanner scanner = new Scanner(System.in);
        //Se registra el nombre
        jugador=scanner.nextLine();
        return jugador;
    }

    @Override
    public String Guardar_CaracteresJugadores(String opcion) {
        //Se invoca scanner para leer salidas del usuario
        Scanner scanner = new Scanner(System.in);
        //Se registra la opcion
        opcion=scanner.nextLine();

        //Se evalua todas las opciones hasta que sea verdadero
        do {
            if(opcion.equalsIgnoreCase("a")){
                opcion="X";
            }else if(opcion.equalsIgnoreCase("b")){
                opcion="O";
            } else if (opcion.equalsIgnoreCase("c")) {
                opcion="†";
            }else if (opcion.equalsIgnoreCase("d")) {
                opcion = "?";
            }else if (opcion.equalsIgnoreCase("e")) {
                opcion = "?";
            }else if (opcion.equalsIgnoreCase("f")) {
                opcion = "©";
            }else if (opcion.equalsIgnoreCase("g")) {
                opcion = "§";
            }else if (opcion.equalsIgnoreCase("h")) {
                opcion = "€";
            }else if (opcion.equalsIgnoreCase("i")) {
                opcion = "W";
            }else if (opcion.equalsIgnoreCase("j")) {
                opcion = "Z";
            }else{
                System.out.println("Error");
            }
            return opcion;
        }while(true);
    }
}