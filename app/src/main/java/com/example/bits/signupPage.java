package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
    }

    public void sendDataSignup(View view) {
        Intent intent = new Intent(signupPage.this,ViewPage.class);
        startActivity(intent);
    }
}