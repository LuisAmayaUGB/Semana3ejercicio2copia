package com.example.semana3ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public  String dato="Si";

    public EditText valor1, valor2;
    public Button sumar;
    public TextView vista;
    public ImageButton imgButon, play;
    MediaPlayer sound;

    private CheckBox AceptaTC;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=(EditText) findViewById(R.id.edtnum1);
        valor2=(EditText) findViewById(R.id.edtnum2);
        sumar=(Button) findViewById(R.id.btnsumar);
        vista=(TextView) findViewById(R.id.txtVer);
imgButon=(ImageButton) findViewById(R.id.botonImage);
play=(ImageButton)findViewById(R.id.play);


        AceptaTC=(CheckBox)findViewById(R.id.checkBox);






play.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_UP){
            play.setImageResource(R.drawable.dos);
            sound.start();
            return true;
        }else if(event.getAction() == MotionEvent.ACTION_DOWN){
            play.setImageResource(R.drawable.uno);
            return true;
        }


        return false;
    }
});






        sound=MediaPlayer.create(getApplicationContext(), R.raw.birds1);











imgButon.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_UP){
            imgButon.setImageResource(R.drawable.dos);


            if (AceptaTC.isChecked()==true) {
                sumar.setEnabled(true);
                Log.d (dato, "se llama a la función onCreate");
            }else{
                sumar.setEnabled(false);
            }



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



       int ale=getRandomNumber(40,70);
       String algo=String.valueOf(ale);


       Toast.makeText(getApplicationContext(), algo,Toast.LENGTH_LONG).show();


    }



    public static int getRandomNumber(int min, int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }


}