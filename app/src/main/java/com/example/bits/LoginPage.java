package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText user ,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

    }

    public void sendDataLogin(View view) {
        user = findViewById(R.id.inputUser);
        password = findViewById(R.id.inputPassword);
        String InputUser = user.getText().toString();
        String InputPassword = password.getText().toString();
        if (InputUser.isEmpty() || InputPassword.isEmpty()){
            Toast.makeText(this,"Fields must be filled",Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(LoginPage.this,ViewPage.class);
            intent.putExtra("",InputUser);
            startActivity(intent);
        }

    }
}