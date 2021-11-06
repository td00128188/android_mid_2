package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button BMI;
    EditText cm,kg;
    TextView A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BMI = (Button) findViewById(R.id.button2);
        BMI.setOnClickListener(this);
        cm = (EditText) findViewById(R.id.editTextNumber);
        kg = (EditText) findViewById(R.id.editTextNumber2);
        A = (TextView) findViewById(R.id.textView3);
    }

    @Override
    public void onClick(View view) {
        double Cm = Double.parseDouble(cm.getText().toString());
        double mm = Cm/100.0;
        double Kg = Double.parseDouble(kg.getText().toString());
        double bmi = Kg/(mm*mm);
        if(bmi <18.5){
            A.setText("體重過輕"+bmi);
        }
        else if(18.5 <= bmi && bmi <= 24){
            A.setText("正常範圍"+bmi);
        }
        else
            A.setText("異常範圍"+bmi);

    }
}