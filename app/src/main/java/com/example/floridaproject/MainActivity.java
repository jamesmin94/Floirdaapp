package com.example.floridaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button button2;
   private Button button3;
   ImageView imageView8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnFinish = (Button) findViewById(R.id.btnfinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });





        //액티비티 이동 구문 시작 3
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,Websearching.class);
                startActivity(intent); //액티비티이동





            }
        });





        ///액티비티 이동 구문 시작
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, Floridamap1.class
                 );
                 startActivity(intent);////액티비티 이동 끝

            }
        });


        imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Welcome to the sunshine state I hope to enjoy your vacation... During travel Florida you can get useful information on this app, With Google maps, you can browse tour information whatever you want!", Toast.LENGTH_LONG).show();
            }
        });




    }



}