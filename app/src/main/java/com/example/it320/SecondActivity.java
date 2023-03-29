package com.example.it320;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_msg = (TextView) findViewById(R.id.received_value_id);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiver_msg.setText("Hello " + str + "!");

    }
}