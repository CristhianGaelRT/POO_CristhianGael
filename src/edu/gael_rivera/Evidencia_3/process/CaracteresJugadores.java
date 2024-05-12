package edu.gael_rivera.Evidencia_3.process;

public class CaracteresJugadores {
    private String Jg1_Crt;
    private String Jg2_Crt;
    public CaracteresJugadores(String Jg1_Crt_Constructor,String Jg2_Crt_Contructor){
        Jg1_Crt_Constructor=Jg1_Crt;
        Jg2_Crt_Contructor=Jg2_Crt;
    }
    public String getJg1_Crt(){
        return Jg1_Crt;
    }
    public void setJg1_Crt(String nuevoCaracter){
        this.Jg1_Crt=nuevoCaracter;
    }
    public String getJg2_Crt(){
        return Jg2_Crt;
    }
    public void setJg2_Crt(String nuevoCaracter){
        this.Jg2_Crt=nuevoCaracter;
    }
}