package com.example.ikesios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AskForHelp extends AppCompatActivity {

    RadioGroup radioGroup,radioGroup2,radioGroup3;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_for_help);
        setTitle("Ικέσιος ");
        radioGroup = (RadioGroup) findViewById(R.id.groupradio);
        radioGroup2 = (RadioGroup) findViewById(R.id.groupradio2);
        radioGroup3 = (RadioGroup) findViewById(R.id.groupradio3);
        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkbox6);
        submit = (Button) findViewById(R.id.submit_help);

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


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

    }
}