package com.example.secondhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateToFirstFragment();
    }

    private void navigateToFirstFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container_view, new FirstFragment())
                .commit();
    }
}