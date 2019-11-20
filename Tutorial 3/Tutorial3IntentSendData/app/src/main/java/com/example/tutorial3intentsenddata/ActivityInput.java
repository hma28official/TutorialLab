package com.example.tutorial3intentsenddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        final EditText firstNum = (EditText)findViewById(R.id.angkaSatu);
        final EditText secondNum = (EditText)findViewById(R.id.angkaDua);
        Button btnAdd = (Button)findViewById(R.id.btnTambah);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                Intent intent = new Intent(ActivityInput.this, ActivityOutput.class);
                intent.putExtra("jumlah", num1+" + "+num2+" = "+(num1+num2));
                startActivity(intent);
            }
        });
    }
}
