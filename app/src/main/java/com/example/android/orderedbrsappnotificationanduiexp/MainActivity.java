package com.example.android.orderedbrsappnotificationanduiexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent("SEND_BR_ACTION");
            intent.setPackage("com.example.android.orderedbrrappnotificationanduiexp");
            sendOrderedBroadcast(intent,null);
        });

    }
}