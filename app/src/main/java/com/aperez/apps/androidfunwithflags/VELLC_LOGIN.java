package com.aperez.apps.androidfunwithflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VELLC_LOGIN extends AppCompatActivity {
    private EditText editTextUsuario;
    private EditText editTextContraseña;
    private Button buttonIngresar;
    private Button buttonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vellc_login);
        editTextUsuario= findViewById(R.id.editTextUsuario);
        editTextContraseña= findViewById(R.id.editTextContraseña);
        buttonIngresar = findViewById(R.id.buttonIngresar);
        buttonRegistrar= findViewById(R.id.buttonRegistrar);
        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String contraseña= editTextContraseña.getText().toString();
                if (usuario.equals("")){

                }
            }
        });
    }

}