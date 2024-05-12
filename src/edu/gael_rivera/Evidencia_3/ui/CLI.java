package edu.gael_rivera.Evidencia_3.ui;
import edu.gael_rivera.Evidencia_3.process.CaracteresJugadores;
import edu.gael_rivera.Evidencia_3.process.Jugadores;
import edu.gael_rivera.Evidencia_3.process.Tablero;
import edu.gael_rivera.Evidencia_3.process.metodos_jugadores.Metodo_RegistroDatos_Jugador1;
import edu.gael_rivera.Evidencia_3.process.metodos_jugadores.Metodo_RegistroDatos_Jugador2;
import edu.gael_rivera.Evidencia_3.process.metodos_jugadores.Metodos_Jugadores;
import java.util.Scanner;

public class CLI {
    static boolean filtro=true;
    /**
     * Juego de gato donde cumple con los parametros de la evidencia 3
     * @param args
     */
    //En main se hacen todas las operaciones de entradas y salidas del usuario
    public static void main(String [] args){
        CLI.Menu();
    }
    public static void Menu(){
        //Se le pregunta al usuario el modo de juego a escojer y se va a ese apartado
        Scanner scanner=new Scanner(System.in);
        Idioma lenguaje=Seleccion_Idioma(scanner);
        System.out.println(lenguaje.get_Bienvenida());
        System.out.println(lenguaje.get_Entrada_ModoDeJuego());
        System.out.println(lenguaje.get_Salida_FinalizarPrograma());
        int opcion=scanner.nextInt();
        if(opcion==1){
            Jugador_VS_Jugador(lenguaje);
        } else if (opcion==2) {
            Jugador_VS_CPU(lenguaje);
        } else {
            System.out.println(lenguaje.get_Salida_Error_CaracterInvalido());
        }
    }
    //Se define el lenguaje a utilizar "Español y ingles" utilizando un metodo
    private static Idioma Seleccion_Idioma(Scanner scanner){
        Idioma lenguaje;
        System.out.println("1. Español");
        System.out.println("2. English");
        int opcion=scanner.nextInt();
        if(opcion==1){
            lenguaje=new Esp();
        }else if(opcion==2){
            lenguaje=new Eng();
        }else{
            System.out.println("Language invalid, defaulting to English");
            lenguaje=new Eng();
        }
        return lenguaje;
    }
    //Se registran los jugadores y los caracteres a utilizar en el gato correspondiendo al jugador
    public static void Registrar_JugadoresGeneral(Idioma lenguaje){
        //Se invoca el objeto para utilizar los metodos de la clase
        CLI metodo = new CLI();
        //Se invocan variables para su registro
        String NombreJugador1 = null;
        String NombreJugador2 =null;
        String CaracterJugador1 = null;
        String CaracterJugador2 = null;
        //Se invoca el objeto de los metodos para llamar metodos con cada jugador

        /**
         * Objetivo:
         */
        Metodos_Jugadores metodosJugadores;

        //Se apunta al jugador 1
        metodosJugadores=new Metodo_RegistroDatos_Jugador1();

        //Se llama al metodo donde se ejecutan todas las acciones necesarias y por ultimo regresa su "valor"
        NombreJugador1=metodo.Registrar_Jugador1(NombreJugador1,lenguaje,metodosJugadores);

        //Ahora se apunta al jugador 2
        metodosJugadores=new Metodo_RegistroDatos_Jugador2();

        //Se llama al metodo donde se ejecutan todas las acciones necesarias y por utlimo regresa su "valor"
        NombreJugador2=metodo.Registrar_Jugador2(NombreJugador2,lenguaje,metodosJugadores);

        //Se imprime la lista de caracteres disponibles
        System.out.println(lenguaje.mostrar_Salida_CaracteresDeTicTacToe());

        //Se vuelve a apuntar al jugador 1
        metodosJugadores=new Metodo_RegistroDatos_Jugador1();

        //Se llama al metodo donde se ejecutan todas las acciones necesarias y por utlimo regresa su "valor"
        CaracterJugador1= metodo.Registrar_CaracterJugador1(CaracterJugador1,lenguaje,metodosJugadores);

        //Se vuelve a apuntar al jugador 2
        metodosJugadores=new Metodo_RegistroDatos_Jugador2();

        //Se llama al metodo donde se ejecutan todas las acciones necesarias y por utlimo regresa su "valor"
        CaracterJugador2= metodo.Registrar_CaracterJugador2(CaracterJugador2,lenguaje,metodosJugadores);

        //Se agregan los datos al constructor de jugadores con setters
        Jugadores jugadores= new Jugadores(NombreJugador1, NombreJugador2);
        jugadores.setJg1_Nombre(NombreJugador1);
        jugadores.setJg2_Nombre(NombreJugador2);

        //Se agregan los datos al constructor de caracteres con setters
        CaracteresJugadores caracteresJugadores = new CaracteresJugadores(CaracterJugador1,CaracterJugador2);
        caracteresJugadores.setJg1_Crt(CaracterJugador1);
        caracteresJugadores.setJg2_Crt(CaracterJugador2);

        System.out.println("***********************");
        System.out.println("Player 1: "+jugadores.getJg1_Nombre());
        System.out.println("Player 2: "+jugadores.getJg2_Nombre());
        System.out.println("Caracter-Player 1: "+caracteresJugadores.getJg1_Crt());
        System.out.println("Caracter-Player 2: "+caracteresJugadores.getJg2_Crt());
        System.out.println("***********************");
    }

    /**
     *Se agregan metodos para el modo de juego "Jugador_VS_Jugador
     *
     * Objetivo:Mantener orden
     */

    public String Registrar_Jugador1(String jugador, Idioma lenguaje, Metodos_Jugadores metodosJugadores){
        //Se imprime mensaje para registrar el jugador 1
        System.out.println(lenguaje.get_Entrada_Nombre_Jg_Uno());
        //Se ejecuta el metodo leyendolo y regresando su "valor"
        jugador=metodosJugadores.Guardar_NombresJugadores(jugador);
        //Se regresa su valor
        return jugador;
    }
    public String Registrar_Jugador2(String jugador, Idioma lenguaje, Metodos_Jugadores metodosJugadores){
        //Se imprime mensaje para registrar el jugador 2
        System.out.println(lenguaje.get_Entrada_Nombre_Jg_Dos());
        //Se ejecuta el metodo leyendolo y regresando su "valor"
        jugador=metodosJugadores.Guardar_NombresJugadores(jugador);
        //Se regresa su valor
        return jugador;
    }
    public String Registrar_CaracterJugador1(String opcion, Idioma lenguaje, Metodos_Jugadores metodosJugadores){
        //Se imprime mensaje para leer la opcion del jugador 1
        System.out.println(lenguaje.get_Entrada_CaracteresDeTicTacToe_Jg_Uno());
        //Se ejecuta el metodo leyendolo y regresando su "valor"
        opcion=metodosJugadores.Guardar_CaracteresJugadores(opcion);
        return opcion;
    }
    public String Registrar_CaracterJugador2(String opcion, Idioma lenguaje, Metodos_Jugadores metodosJugadores){
        //Se imprime mensaje para leer la opcion del jugador 2
        System.out.println(lenguaje.get_Entrada_CaracteresDeTicTacToe_Jg_Dos());
        //Se ejecuta el metodo leyendolo y regresando su "valor"
        opcion=metodosJugadores.Guardar_CaracteresJugadores(opcion);
        //Se imprime el valor guardado
        return opcion;
    }
    //Modo de juego de jugador contra jugador donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_Jugador(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSJg());
        CLI.Registrar_JugadoresGeneral(lenguaje);
        System.out.println(lenguaje.get_Salida_InicioJuego());
    }
    //Modo de juego de jugador contra CPU donde se utilizan todos los metodos requeridos para su modo de juego
    public static void Jugador_VS_CPU(Idioma lenguaje){
        System.out.println(lenguaje.get_Salida_Bienvenida_ModoDeJuego_JgVSCPU());
    }

}