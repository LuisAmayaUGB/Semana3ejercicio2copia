package com.example.semana3ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText valor1, valor2;
    public Button sumar;
    public TextView vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=(EditText) findViewById(R.id.edtnum1);
        valor2=(EditText) findViewById(R.id.edtnum2);
        sumar=(Button) findViewById(R.id.btnsumar);
        vista=(TextView) findViewById(R.id.txtVer);
    }




    public void sumando(View view){

        String dato1=valor1.getText().toString();
        int dat1=Integer.parseInt(dato1);

        String dato2=valor2.getText().toString();
        int dat2=Integer.parseInt(dato2);

        int sumaTotal=dat1+dat2;

        vista.setText("La suma es: "+ sumaTotal);

String algo="sfsdfdsfds";
        Toast.makeText(getApplicationContext(), algo,Toast.LENGTH_LONG).show();


    }


}