package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class controlPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_panel);
    }

    public void show(View view) {
        Intent intent = new Intent(controlPanel.this,ViewPage.class);
        startActivity(intent);
    }
}