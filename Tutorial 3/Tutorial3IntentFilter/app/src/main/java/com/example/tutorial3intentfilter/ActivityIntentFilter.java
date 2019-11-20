package com.example.tutorial3intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityIntentFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);

        Button btnSend = (Button) findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new  String[]{"hma28official@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Welcome to CCIT-FTUI, TI Program");
                intent.putExtra(Intent.EXTRA_TEXT, "Hi Students, Welcome to this class");
                startActivity(Intent.createChooser(intent, "Choose Mail App"));
            }
        });
    }
}
