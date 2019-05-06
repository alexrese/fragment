package com.example.alexrese.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlterarFragmento(View view){
        Fragment fragment;
        if (view == findViewById(R.id.btFragmento1)) {
            fragment = new FragmentOne();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmento, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.btFragmento2)) {
            fragment = new FragmentTwo();
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmento, fragment);
            ft.commit();
        }
    }
}

