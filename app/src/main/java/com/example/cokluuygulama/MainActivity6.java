package com.example.cokluuygulama;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                int id = destination.getId();
                switch (id)
                {
                    case R.id.navigation_dashboard:
                        Toast.makeText(MainActivity6.this, "Giriş sayfasına dönülüyor...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_home:
                        Toast.makeText(MainActivity6.this, "Anasayfaya dönülüyor...", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.navigation_notifications:
                        Toast.makeText(MainActivity6.this, "Galeriye gidiliyor...", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.navigation_profile:
                        Toast.makeText(MainActivity6.this, "Profile gidiliyor...", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }



}