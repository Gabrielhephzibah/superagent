package com.cherish.superagent.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cherish.superagent.R;

public class Deposit_Successful extends AppCompatActivity {
    private ImageView back;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit__successful);
        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous_page = new Intent(getApplicationContext(), Confirmation.class);
                startActivity(previous_page);
            }
        });

        home = findViewById(R.id.back_to_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_page = new Intent(getApplicationContext(), Homeview.class);
                startActivity(home_page);
            }
        });

    }
}
