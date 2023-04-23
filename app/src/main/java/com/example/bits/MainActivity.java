package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_Login(View view) {
        Intent intent = new Intent(MainActivity.this,LoginPage.class);
        startActivity(intent);
    }

    public void show_Signup(View view) {
        Intent intent = new Intent(MainActivity.this,signupPage.class);
        startActivity(intent);
    }
}