package com.example.ikesios;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.datepicker.MaterialDatePicker;

import java.util.Calendar;

public class Covid_Final extends AppCompatActivity {

    DatePickerDialog picker;
    DatePickerDialog picker2;
    EditText date1;
    EditText date2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid__final);
        date1=(EditText) findViewById(R.id.date1);
        date1.setInputType(InputType.TYPE_NULL);
        date1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Calendar cldr = Calendar.getInstance();
            int day = cldr.get(Calendar.DAY_OF_MONTH);
            int month = cldr.get(Calendar.MONTH);
            int year = cldr.get(Calendar.YEAR);
            // date picker dialog
            picker = new DatePickerDialog(Covid_Final.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                            date1.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                        }
                    }, year, month, day);
            picker.show();
        }
    });

        date2=(EditText) findViewById(R.id.date2);
        date2.setInputType(InputType.TYPE_NULL);
        date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr2 = Calendar.getInstance();
                int day = cldr2.get(Calendar.DAY_OF_MONTH);
                int month = cldr2.get(Calendar.MONTH);
                int year = cldr2.get(Calendar.YEAR);
                // date picker dialog
                picker2 = new DatePickerDialog(Covid_Final.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                date2.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker2.show();
            }
        });

    }


}
