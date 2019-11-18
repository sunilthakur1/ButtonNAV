package com.example.buttonnav;

import android.os.Bundle;

import com.example.buttonnav.models.Sutdents;
import com.example.buttonnav.ui.student.StudentsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_students)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        StudentsFragment.studentList.add(new Sutdents("Kiran Rana", "25", "Male", "kathmandu",R.drawable.male));
        StudentsFragment.studentList.add(new Sutdents("Alex", "24", "others", "Las vedas",R.drawable.others));
        StudentsFragment.studentList.add(new Sutdents("Katrina kaif", "35", "Female", "Bihar",R.drawable.female));

        NavigationUI.setupWithNavController(navView, navController);
    }}


