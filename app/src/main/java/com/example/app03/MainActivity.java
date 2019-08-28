package com.example.app03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Button btnAdivinar= (Button) findViewById(R.id.boton1);
        btnAdivinar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.texto1);
                EditText ingresado = (EditText) findViewById(R.id.ingreso1);
                if(view.getId()==R.id.boton1        ) {
                    Random r= new Random();
                    Integer nroSorteado= 1+r.nextInt(9);
                    Integer nroIngresado= Integer.parseInt(ingresado.getText().toString());
                    if(nroSorteado.equals(nroIngresado)) {
                        tv.setText("Número sorteado fue el :"+ nroSorteado+"Adivino... !!!");}
                    else {
                        tv.setText("Número sorteado fue el :"+ nroSorteado+" No acerto. Intentelode nuevo... !!!");}
                }
            }


        });
    }//cierra del metodo onCreate


}//cierra la clase