package com.example.cokluuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {


    ListView listview;
    ArrayList<String> liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        listview = findViewById(R.id.liste);
        liste = new ArrayList<>();
        liste.add("Eren");
        liste.add("Fatma");
        liste.add("Mehmet");
        liste.add("Ahmet");
        liste.add("Geri");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1, liste);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (liste.get(position)) {


                    case "Eren":
                        Toast.makeText(MainActivity5.this, "id: eren | Şifre: solmaz", Toast.LENGTH_SHORT).show();
                        break;
                    case "Fatma":
                        Toast.makeText(MainActivity5.this, "id: fatma | Şifre: korkmaz", Toast.LENGTH_SHORT).show();
                        break;
                    case "Mehmet":
                        Toast.makeText(MainActivity5.this, "id: mehmet | Şifre: elma", Toast.LENGTH_SHORT).show();
                        break;
                    case "Ahmet":
                        Toast.makeText(MainActivity5.this, "id: ahmet | Şifre: cam", Toast.LENGTH_SHORT).show();
                        break;
                    case "Geri":
                        Intent i = new Intent(MainActivity5.this, MainActivity2.class);
                        startActivity(i);
                        Toast.makeText(MainActivity5.this, "Menüye Yönlendiriliyorsunuz.", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });
    }
}