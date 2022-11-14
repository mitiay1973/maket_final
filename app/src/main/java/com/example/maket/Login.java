package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void register(View view) {
        setContentView(R.layout.activity_registr);
    }


    public void Start(View view) {
        setContentView(R.layout.activity_main);
    }

}