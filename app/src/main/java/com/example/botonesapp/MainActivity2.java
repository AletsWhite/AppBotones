package com.example.botonesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    CheckBox c1, c2;
    RadioButton r1, r2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        c1 = (CheckBox) findViewById(R.id.idChec1);
        c2 = (CheckBox) findViewById(R.id.idChec2);
        b1 = (Button) findViewById(R.id.button2);

        r1 = (RadioButton) findViewById(R.id.idRadio1);
        r2 = (RadioButton) findViewById(R.id.idRadio2);
        b2 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button2){
                    validarCheck();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.button3){
                    validarRadio();
                }
            }
        });
    }

    private void validarCheck(){
        String mensaje = "Seleccionado:\n";
        if(c1.isChecked()==true){
            mensaje+="Opcion 1\n";
        }
        if(c2.isChecked()){
            mensaje+="Opcion 2";
        }

        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
    }

    private void validarRadio(){
        String mensaje = "Seleccionado:\n";
        if(r1.isChecked()){
            mensaje+="Opcion 1\n";
        }
        if(r2.isChecked()){
            mensaje+="Opcion 2";
        }

        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
    }
}