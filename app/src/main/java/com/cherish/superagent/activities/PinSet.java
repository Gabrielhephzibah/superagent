package com.cherish.superagent.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cherish.superagent.R;

public class PinSet extends AppCompatActivity {
    private Button setPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_set);
        setPin = findViewById(R.id.SetPinBtn);
        setPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Homeview.class);
                startActivity(nextPage);
            }
        });
    }
}
