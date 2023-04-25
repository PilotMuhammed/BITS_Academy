package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class controlPanel extends AppCompatActivity {

    TextView showUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_panel);

        /*--- Code get User From Login & Signup ---*/
        showUser = findViewById(R.id.textViewUser);
        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("");
        showUser.setText(user);

    }

}