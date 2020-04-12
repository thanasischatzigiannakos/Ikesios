package com.example.ikesios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.login.widget.LoginButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

TextInputEditText email,passwd;
Button login,register,about,developers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login=(Button)findViewById(R.id.log_in);
        register=(Button)findViewById(R.id.register);
        about=(Button)findViewById(R.id.about);
        developers=(Button)findViewById(R.id.developers);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });



    }

    public void openNewActivity(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
