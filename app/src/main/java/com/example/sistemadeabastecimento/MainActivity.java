package com.example.sistemadeabastecimento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoGasolina;
    private EditText precoEtanol;
    private double pE, pG;  // Respectivamente PE && PG são: precoEtanol, precoGasolina
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        precoGasolina = findViewById(R.id.precoGasolina);
        precoEtanol = findViewById(R.id.precoEtanol);
        resultado = findViewById(R.id.resultado);

    }

    public void calcular(View view){


        pE = Double.parseDouble(precoEtanol.getText().toString().replace(",","."));
        pG = Double.parseDouble(precoGasolina.getText().toString().replace(",","."));

        if(pE <= (pG * 0.7)){
            resultado.setText("O preço do Etanol é mais viavel");
        } else {
            resultado.setText("O preço da Gasolina é mais viável");
        }

    }
}