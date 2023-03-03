package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somma = (Button) findViewById(R.id.btnSomma);
        EditText num1 = (EditText) findViewById((R.id.editTextN1));
        EditText num2 = (EditText) findViewById((R.id.editTextN2));
        TextView res = (TextView) findViewById((R.id.textViewResult));

        somma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int totale = 0;
                totale = Integer.valueOf(num1.getText().toString()) + Integer.valueOf(num2.getText().toString());
                res.setText(totale);
            }
        });
    }
}