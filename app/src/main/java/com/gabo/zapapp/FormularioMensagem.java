package com.gabo.zapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FormularioMensagem extends AppCompatActivity {
    private ImageButton btnEnviar;

    private TextInputLayout inputMensagem;
    private TextInputEditText editaMensagem;

    private TextInputLayout inputTelefone;
    private TextInputEditText editaTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_mensagem);
        btnEnviar = findViewById(R.id.botaoEnviarMensagem);

        inputTelefone = findViewById(R.id.inputTelefone);
        editaTelefone = findViewById(R.id.editaTelefone);
        inputMensagem = findViewById(R.id.inputMensagem);
        editaMensagem = findViewById(R.id.editaTelefone);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mensagem = editaTelefone.getText().toString();
                String telefone = editaTelefone.getText().toString();

                Uri webpage = Uri.parse("https://wa.me/"+telefone+"?text="+mensagem);
                Intent webIntent = new Intent(Intent.ACTION_VIEW , webpage);
                startActivity(webIntent);

                onBackPressed();
            }
        });
    }
}