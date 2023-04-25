package com.example.bits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signupPage extends AppCompatActivity {

    EditText user ,email ,password ,rePassword;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

    }

    public void sendDataSignup(View view) {
        user = findViewById(R.id.inputUser);
        email = findViewById(R.id.inputEmail);
        password = findViewById(R.id.inputPassword);
        rePassword = findViewById(R.id.inputRePassword);
        String InputUser = user.getText().toString();
        String InputEmail = email.getText().toString();
        String InputPassword = password.getText().toString();
        String InputRePassword = rePassword.getText().toString();


        Intent intent = new Intent(signupPage.this,ViewPage.class);
        intent.putExtra("",InputUser);
        startActivity(intent);


//        if (InputUser.isEmpty() || InputEmail.isEmpty() || InputPassword.isEmpty() || InputRePassword.isEmpty()){
//            Toast.makeText(this,"Fields must be filled",Toast.LENGTH_LONG).show();
//        }
//        else {
//
//            if (InputRePassword != InputPassword){
//                Toast.makeText(this,"The Password does not match",Toast.LENGTH_LONG).show();
//            }
//            else {
//
//            }
//        }

    }
}