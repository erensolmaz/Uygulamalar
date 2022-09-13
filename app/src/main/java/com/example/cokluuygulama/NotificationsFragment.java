package com.example.cokluuygulama;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class NotificationsFragment extends Fragment {
    List<Yerler> lstBook;
    public Context mContext;

    private View rootView;
    RecyclerViewAdapter recyclerViewAdapter;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public NotificationsFragment() {
    }


    public static NotificationsFragment newInstance(String param1, String param2) {
        NotificationsFragment fragment = new NotificationsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstBook = new ArrayList<>();
        lstBook.add(new Yerler("İstanbul","Şehir","Description book",R.drawable.izmir));
        lstBook.add(new Yerler("İzmir","Şehir","Description book",R.drawable.istanbul));
        lstBook.add(new Yerler("Ankara","Şehir","Description book",R.drawable.ankara));
        lstBook.add(new Yerler("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Yerler("Kapadokya","Categorie Book","Description book",R.drawable.kapadokya));
        lstBook.add(new Yerler("Mardin","Categorie Book","Description book",R.drawable.mardin));
        lstBook.add(new Yerler("Pamukkale","Şehir","Description book",R.drawable.pamukkale));
        lstBook.add(new Yerler("Van","Şehir","Description book",R.drawable.van));
        lstBook.add(new Yerler("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Yerler("Kapadokya","Şehir","Description book",R.drawable.kapadokya));
        lstBook.add(new Yerler("Mardin","Şehir","Description book",R.drawable.mardin));
        lstBook.add(new Yerler("Pamukkale","Şehir","Description book",R.drawable.pamukkale));
        lstBook.add(new Yerler("Van","Şehir","Description book",R.drawable.van));
        lstBook.add(new Yerler("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Yerler("Kapadokya","Şehir","Description book",R.drawable.kapadokya));
        lstBook.add(new Yerler("İstanbul","Şehir","Description book",R.drawable.izmir));
        lstBook.add(new Yerler("İzmir","Şehir","Description book",R.drawable.istanbul));
        lstBook.add(new Yerler("Ankara","Şehir","Description book",R.drawable.ankara));
        lstBook.add(new Yerler("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Yerler("Kapadokya","Categorie Book","Description book",R.drawable.kapadokya));
        lstBook.add(new Yerler("Mardin","Categorie Book","Description book",R.drawable.mardin));
        lstBook.add(new Yerler("Pamukkale","Şehir","Description book",R.drawable.pamukkale));
        lstBook.add(new Yerler("Van","Şehir","Description book",R.drawable.van));
        lstBook.add(new Yerler("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Yerler("Kapadokya","Şehir","Description book",R.drawable.kapadokya));
        lstBook.add(new Yerler("Mardin","Şehir","Description book",R.drawable.mardin));
        lstBook.add(new Yerler("Pamukkale","Şehir","Description book",R.drawable.pamukkale));
        lstBook.add(new Yerler("Van","Şehir","Description book",R.drawable.van));
        lstBook.add(new Yerler("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Yerler("Kapadokya","Şehir","Description book",R.drawable.kapadokya));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_notifications, container, false);
        RecyclerView myrv = (RecyclerView) rootView.findViewById(R.id.recyclerview_id);
        recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        //myrv.setAdapter(recyclerViewAdapter);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
            myrv.setAdapter(recyclerViewAdapter);
        return rootView;

    }
}