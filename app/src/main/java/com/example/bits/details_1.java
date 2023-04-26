package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class details_1 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_1);

        btn = findViewById(R.id.btn_show_link);
        btn.setOnClickListener(view -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLltujPVLmFK6yPUI9BZQC4GuQDT1Z0mo4")));
        });
    }
}