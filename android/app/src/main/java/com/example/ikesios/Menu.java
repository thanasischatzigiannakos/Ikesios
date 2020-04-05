package com.example.ikesios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    Button help;
    Button dilosi;
    Button test;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        help = (Button)findViewById(R.id.Help_Btn) ;
        dilosi = (Button)findViewById(R.id.Dilosi_btn) ;
        test = (Button)findViewById(R.id.Test_Btn) ;
        exit = (Button)findViewById(R.id.Exit_btn) ;
        setTitle("Ικέσιος ");
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AskForHelp.class);
                startActivity(i);
            }
        });

        dilosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),DiseaseStateme.class);
                startActivity(i);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),POPUP.class);
                startActivity(i);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
