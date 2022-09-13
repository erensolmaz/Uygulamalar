package com.example.cokluuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    Button  btn1;
    Button btn2;
    Button btn3;
    Button btn4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn1= findViewById(R.id.button1);
        btn2= findViewById(R.id.button2);
        btn3= findViewById(R.id.button3);
        btn4= findViewById(R.id.button4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent a = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(a);
                Toast.makeText(MainActivity2.this, "Döviz hesaplama açılıyor...", Toast.LENGTH_SHORT).show();




            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(i);
                Toast.makeText(MainActivity2.this, "Hesap makinesi açılıyor...", Toast.LENGTH_SHORT).show();

            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent c = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(c);
                Toast.makeText(MainActivity2.this, "Listview açılıyor...", Toast.LENGTH_SHORT).show();


            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent x = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity(x);
                Toast.makeText(MainActivity2.this, "Ana menüye dönülüyor...", Toast.LENGTH_SHORT).show();

            }
        });
    }

}