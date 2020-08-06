package com.cherish.superagent.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cherish.superagent.R;

public class withdrawal_confirmationPage extends AppCompatActivity {
    private Button withdrawSucess;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawal_confirmation_page);
        withdrawSucess = findViewById(R.id.withdrawBtn);
        withdrawSucess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newPage = new Intent(getApplicationContext(),Withdraw_Successful.class);
                startActivity(newPage);
            }
        });

        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous = new Intent(getApplicationContext(),Withdrawal_InputPin.class );
                startActivity(previous);
            }
        });
    }
}
