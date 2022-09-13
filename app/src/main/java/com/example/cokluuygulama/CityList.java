package com.example.cokluuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CityList extends AppCompatActivity {
    private TextView tvTitle,tvdescription,tvCat;
    private ImageView img;

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);

        tvTitle = findViewById(R.id.txttitle);
        tvdescription = findViewById(R.id.txtDesc);
        tvCat = findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.imgid);

      /*  listView = findViewById(R.id.listView);
        ArrayList<Lists> arrayList = new ArrayList<>();
        arrayList.add(new Lists(R.drawable.istanbul,"",""));
        arrayList.add(new Lists(R.drawable.istanbul,"",""));
        arrayList.add(new Lists(R.drawable.istanbul,"",""));
        arrayList.add(new Lists(R.drawable.van,"",""));

        ListAdapter listAdapter = new ListAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(listAdapter);
*/
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");



        tvTitle.setText(title);
        tvdescription.setText(description);
        img.setImageResource(image);

    }
}
