package com.example.botonesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageButton imagenPrueba;
    private ToggleButton tgb;
    private TextView txtEstado, txtEstado1;
    private Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        imagenPrueba = findViewById(R.id.imageButtonPrueba);
        imagenPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Prueba Funcionando", Toast.LENGTH_LONG).show();
            }
        });

        tgb = (ToggleButton) findViewById(R.id.tgBtn1);
        txtEstado = (TextView) findViewById(R.id.etiSeleccion);
        tgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.tgBtn1){
                    if(tgb.isChecked()){
                        txtEstado.setText("Boton On");
                    }else{
                        txtEstado.setText("Boton Off");
                    }
                }
            }
        });

        sw = (Switch) findViewById(R.id.switch1);
        txtEstado1 = (TextView) findViewById(R.id.etiSeleccion1);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.switch1){
                    if(sw.isChecked()){
                        txtEstado1.setText("Boton On");
                    }else{
                        txtEstado1.setText("Boton Off");
                    }
                }
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

}