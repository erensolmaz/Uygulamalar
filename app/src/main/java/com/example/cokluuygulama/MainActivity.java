package com.example.cokluuygulama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText et1;
    EditText et2;
    TextView tw1;
    Button button;
    RadioButton rbtn1;
    RadioButton rbtn2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= findViewById(R.id.et1);
        et2= findViewById(R.id.et2);
        tw1= findViewById(R.id.tw1);
        button= findViewById(R.id.button);
        rbtn1= findViewById(R.id.rbtn1);
        rbtn2= findViewById(R.id.rbtn2);
        rg= findViewById(R.id.rgroup);

        kullanici eren = new kullanici("eren@hotmail.com", "solmaz");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("eren@hotmail.com") && et2.getText().toString().equals("solmaz"))
                {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Hatalı giriş!", Toast.LENGTH_SHORT).show();
                }

                if (rbtn1.isChecked()) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    Toast.makeText(MainActivity.this, "Açık mod etkinleştirildi.", Toast.LENGTH_SHORT).show();
                }
                if (rbtn2.isChecked()) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    Toast.makeText(MainActivity.this, "Koyu mod etkinleştirildi.", Toast.LENGTH_SHORT).show();
                }


            }

        });

    }
}