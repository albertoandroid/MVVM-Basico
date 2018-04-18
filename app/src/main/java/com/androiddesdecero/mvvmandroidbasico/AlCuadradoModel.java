package com.androiddesdecero.mvvmandroidbasico;

/**
 * Created by albertopalomarrobledo on 18/4/18.
 */

public class AlCuadradoModel {

    private double resultado;
    public AlCuadradoModel(){

    }

    public String alCuadrado(String data){
        if(data.equals("")){
            return "Campo Vacio";
        }else{
            resultado = Double.valueOf(data)*Double.valueOf(data);
            return String.valueOf(resultado);
        }
    }
}
