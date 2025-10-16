package com.devst.app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public class ConfigActivity extends AppCompatActivity {


    //-------------------------------------------------------------------------
    //Varibales
    private Button btnDetalle;
    private  String emailUsuario;
    //-------------------------------------------------------------------------

    @Override
    //onCreate es un metodo que se ejecuata cuando se abre la pantalla (pasar de login a home - home a configuracion etc...)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_config);

        //Vinculamos el Toolbar del XML
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Habilita el boton de "Atras" en la toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Configutacion");
        }
    //-------------------------------------------------------------------------
        //Botones
        //Asignamos la variable al boton definido en el XML
        btnDetalle = findViewById(R.id.btnConfig);
        Button btnwifi = findViewById(R.id.btnwifi);
        Button btnContactos = findViewById(R.id.btnContactos);
        Button btnWeb = findViewById(R.id.btnWeb);
        Button btnMapa = findViewById(R.id.btnMapa);
        //Recibimos el correo del Home Activity
        emailUsuario = getIntent().getStringExtra("email_usuario");
    //-------------------------------------------------------------------------

        //Boton y evento que nos lleva al DetalleActivity
        btnDetalle.setOnClickListener(v -> {
            Intent intent = new Intent(ConfigActivity.this, DetalleActivity.class);
            intent.putExtra("email_usuario", emailUsuario);
            startActivity(intent);
        });
    //-------------------------------------------------------------------------
        //Configuracion que nos abre el wifi del sistema
        btnwifi.setOnClickListener(v -> {
            Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            startActivity(intent);
        });
    //-------------------------------------------------------------------------
        //Configuracion que nos abre la lista de contactos
        btnContactos.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            startActivity(intent);
        });
    //-------------------------------------------------------------------------
        //Boton que abre la pagina web
        btnWeb.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.santotomas.cl")); //
            startActivity(intent);
        });
    //-------------------------------------------------------------------------
        //Boton que abre una ubicacion en especifica
        btnMapa.setOnClickListener(v -> {
            // Coordenadas y texto descriptivo
            String latitud = "-33.45694";
            String longitud = "-70.64827";
            String texto = "Instituto Profesional Santo Tomas, Santiago Centro";

            Uri ubicacion = Uri.parse("geo:" + latitud + "," + longitud + "?q=" + Uri.encode(texto));

            Intent intent = new Intent(Intent.ACTION_VIEW, ubicacion);
            intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
        });
    }
    //-------------------------------------------------------------------------
    //Evento para presionar el boton de "Atras"
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            finish();
            return true;
        }
        return  super.onOptionsItemSelected(item);
    }

}
