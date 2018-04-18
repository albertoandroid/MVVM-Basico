package com.androiddesdecero.mvvmandroidbasico;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoActivity extends AppCompatActivity {

    private EditText etAlCuadrado;
    private Button btAlCuadrado;
    private TextView tvAlCuadrado;

    private AlCuadradoViewModel alCuadradoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();
    }

    private void configView(){
        alCuadradoViewModel = ViewModelProviders.of(this).get(AlCuadradoViewModel.class);
        tvAlCuadrado = findViewById(R.id.tvAlCuadrado);
        etAlCuadrado = findViewById(R.id.edAlCuadrado);
        btAlCuadrado = findViewById(R.id.btCalcular);
        btAlCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alCuadradoViewModel.alCuadrado(etAlCuadrado.getText().toString());
            }
        });

        final Observer<String> listObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String resultado) {
                tvAlCuadrado.setText(resultado);
            }
        };

        alCuadradoViewModel.getAlCuadrado().observe(this, listObserver);
    }
}
