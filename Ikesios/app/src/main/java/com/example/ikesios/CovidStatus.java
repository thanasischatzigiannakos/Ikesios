package com.example.ikesios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CovidStatus extends AppCompatActivity {

    Button me,other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_status);

        me=(Button) findViewById(R.id.me);
        other=(Button) findViewById(R.id.other);



        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otherStatement();
            }
        });
    }

    public void otherStatement(){
        Intent intent = new Intent(this, Other_Statement.class);
        startActivity(intent);
    }

}
