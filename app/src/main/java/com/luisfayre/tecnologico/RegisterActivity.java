package com.luisfayre.tecnologico;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    //UI
    private Button Registro;
    private EditText Correo;
    private EditText Contrasena;

    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener fireAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Registro = (Button) findViewById(R.id.button_register);
        Correo = (EditText) findViewById(R.id.register_email);
        Contrasena = (EditText) findViewById(R.id.register_contraseña);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void Registro(View view) {
        String email = Correo.getText().toString().trim();
        String password = Contrasena.getText().toString().trim();

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RegisterActivity.this, "Registro exitosamente", Toast.LENGTH_SHORT).show();
                            PantallaPrincipal();
                        }else {
                            Toast.makeText(RegisterActivity.this, "No se ha registrado correctamente", Toast.LENGTH_SHORT).show();
                        }


                    }
                });
    }
    private void PantallaPrincipal() {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
