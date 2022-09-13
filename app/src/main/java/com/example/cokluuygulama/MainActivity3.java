package com.example.cokluuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button btn;
    Button btn2;
    EditText h1;
    EditText h2;
    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        btn= findViewById(R.id.btn);
        btn2= findViewById(R.id.btn2);
        rg= findViewById(R.id.rg);
        rb1= findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        h1= findViewById(R.id.h1);
        h2= findViewById(R.id.h2);
        tv= findViewById(R.id.tv);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb1.isChecked()) {
                    double a, b, c;
                    a = Double.parseDouble(h1.getText().toString());
                    b = Double.parseDouble(h2.getText().toString());
                    c = a * b;

                    tv.setText(String.valueOf(c));
                    Toast.makeText(MainActivity3.this, "Euro bazında hesaplanmıştır.", Toast.LENGTH_SHORT).show();
                }
                if(rb2.isChecked()) {
                    double a, b, c;
                    a = Double.parseDouble(h1.getText().toString());
                    b = Double.parseDouble(h2.getText().toString());
                    c = a * b;

                    tv.setText(String.valueOf(c));
                    Toast.makeText(MainActivity3.this, "Dolar bazında hesaplanmıştır.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(i);
                Toast.makeText(MainActivity3.this, "Menüye yönlendiriliyorsunuz.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}