package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public void additionFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String value1_s = myTextField.getText().toString();
        String value2_s = myTextField2.getText().toString();

        int value1 = Integer.parseInt(value1_s);
        int value2 = Integer.parseInt(value2_s);
        int total = value1 + value2;
        String val = Integer.toString(total);

        //Toast.makeText((Context) MainActivity.this, val , Toast.LENGTH_LONG).show();
        goToActivity(val);
    }

    public void subtractionFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String value1_s = myTextField.getText().toString();
        String value2_s = myTextField2.getText().toString();

        int value1 = Integer.parseInt(value1_s);
        int value2 = Integer.parseInt(value2_s);
        int total = value1 - value2;
        String val = Integer.toString(total);

        //Toast.makeText((Context) MainActivity.this, val , Toast.LENGTH_LONG).show();
        goToActivity(val);
    }

    public void multiplicationFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String value1_s = myTextField.getText().toString();
        String value2_s = myTextField2.getText().toString();

        int value1 = Integer.parseInt(value1_s);
        int value2 = Integer.parseInt(value2_s);
        int total = value1 * value2;
        String val = Integer.toString(total);

        //Toast.makeText((Context) MainActivity.this, val , Toast.LENGTH_LONG).show();
        goToActivity(val);
    }

    public void divisionFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editTextText);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText2);
        String value1_s = myTextField.getText().toString();
        String value2_s = myTextField2.getText().toString();

        int value1 = Integer.parseInt(value1_s);
        int value2 = Integer.parseInt(value2_s);
        String val = "";

        if (value2 == 0) {
            val = "Not defined";
        } else {
            double total = (double) value1 / value2;
            DecimalFormat numberFormat = new DecimalFormat("0.00");;
            val = numberFormat.format(total);
        }

        //Toast.makeText((Context) MainActivity.this, val , Toast.LENGTH_LONG).show();
        goToActivity(val);
    }

    public void goToActivity(String s) {

        Intent intent = new Intent(this, result.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}