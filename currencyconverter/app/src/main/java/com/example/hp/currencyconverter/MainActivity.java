package com.example.hp.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertToEuro(View view){
        EditText editText = (EditText) findViewById(R.id.conEditText);
        String amountInpounds = editText.getText().toString();
        double amountInpoundsdouble = Double.parseDouble(amountInpounds);
        double amountIndollarsdouble = amountInpoundsdouble * 1.3;
        String amountIndollarsString = String.format("%.2f", amountIndollarsdouble);


  Toast.makeText(this,"amount in dollars is " + amountIndollarsString , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
