package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CovidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);
        getSupportActionBar().hide();
    }
}