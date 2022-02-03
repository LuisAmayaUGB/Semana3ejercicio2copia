package com.example.semana3ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText valor1, valor2;
    public Button sumar;
    public TextView vista;
    public ImageButton imgButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=(EditText) findViewById(R.id.edtnum1);
        valor2=(EditText) findViewById(R.id.edtnum2);
        sumar=(Button) findViewById(R.id.btnsumar);
        vista=(TextView) findViewById(R.id.txtVer);
imgButon=(ImageButton) findViewById(R.id.botonImage);






imgButon.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_UP){
            imgButon.setImageResource(R.drawable.dos);

            String dato1=valor1.getText().toString();
            int dat1=Integer.parseInt(dato1);

            String dato2=valor2.getText().toString();
            int dat2=Integer.parseInt(dato2);

            int sumaTotal=dat1+dat2;

            vista.setText("La suma es: "+ sumaTotal);




            return true;
        }else if(event.getAction() == MotionEvent.ACTION_DOWN){
            imgButon.setImageResource(R.drawable.uno);
            return true;
        }

        return false;
    }
});

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

     //   imgButon.setBackgroundResource(R.drawable.car);

    }


}