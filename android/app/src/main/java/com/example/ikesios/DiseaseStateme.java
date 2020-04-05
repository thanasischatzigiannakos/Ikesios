package com.example.ikesios;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DiseaseStateme extends AppCompatActivity {
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    Button submit, clear;
    EditText date;
    DatePickerDialog datePickerDialog;
    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_stateme);
        setTitle("Ικέσιος ");
        test=(TextView)findViewById(R.id.test);

        test.setVisibility(View.INVISIBLE);

        submit=(Button)findViewById(R.id.submit_asthenia);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(),Menu.class);
                startActivity(e);

                Intent i=new Intent(getApplicationContext(),PUP.class);
                startActivity(i);
            }
        });


    }
}
