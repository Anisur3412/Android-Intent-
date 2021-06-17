package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.emailId);
        pass = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String Email =  email.getText().toString();
               String Password =  pass.getText().toString();
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("email",Email);
                intent.putExtra("pass",Password);
                startActivity(intent);

            }
        });



    }
}