package com.cherish.superagent.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cherish.superagent.R;

public class Withdraw_Successful extends AppCompatActivity {
    private ImageView back;
    private Button back_to_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw__successful);
        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous = new Intent(getApplicationContext(),withdrawal_confirmationPage.class);
                startActivity(previous);
            }
        });


        back_to_home = findViewById(R.id.home);
        back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous = new Intent(getApplicationContext(), Homeview.class);
                startActivity(previous);
            }
        });

    }
}
