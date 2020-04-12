package com.example.ikesios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class Demographics extends AppCompatActivity {

    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12,checkBox13,checkBox14;
    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demographics);

        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkbox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkbox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkbox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkbox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkbox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkbox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkbox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkbox14);
        radioGroup1 = (RadioGroup) findViewById(R.id.groupradio);
        radioGroup2 = (RadioGroup) findViewById(R.id.groupradio2);
        radioGroup3 = (RadioGroup) findViewById(R.id.groupradio3);
        radioGroup4 = (RadioGroup) findViewById(R.id.groupradio4);
        submit = (Button) findViewById(R.id.register2);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

    }

    public void openNewActivity(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }
}
