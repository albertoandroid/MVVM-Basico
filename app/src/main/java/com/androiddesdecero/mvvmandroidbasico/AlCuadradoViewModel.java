package com.androiddesdecero.mvvmandroidbasico;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by albertopalomarrobledo on 18/4/18.
 */

public class AlCuadradoViewModel extends ViewModel {
    private MutableLiveData<String> resultado;
    private AlCuadradoModel model;

    public LiveData<String> getAlCuadrado(){
        if(resultado==null){
            model = new AlCuadradoModel();
            resultado = new MutableLiveData<String>();
        }
        return resultado;
    }

    public void alCuadrado(String data){
        resultado.setValue(model.alCuadrado(data));
    }
}
