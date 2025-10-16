package com.devst.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle);

    //-------------------------------------------------------------------------
        // Recibimos el correo desde ConfigActivity
        String emailUsuario = getIntent().getStringExtra("email_usuario");

        // Referencias a los TextView
        TextView tvTitulo = findViewById(R.id.tvTitulo);
        TextView tvEmail = findViewById(R.id.tvEmail);

        // Mostrar contenido
        tvTitulo.setText("Prueba Android");
        tvEmail.setText("Correo recibido: " + emailUsuario);
    }
    //-------------------------------------------------------------------------
    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


