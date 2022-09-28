package com.gabo.zapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnNovaMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovaMensagem=findViewById(R.id.botaoNovaMensagem);

        btnNovaMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreformulario = new Intent(getApplicationContext(), FormularioMensagem.class);
                startActivity(abreformulario);
            }
        });
    }
}