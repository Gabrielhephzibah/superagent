package com.cherish.superagent.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cherish.superagent.R;
import com.google.android.material.textfield.TextInputEditText;

public class Withdrawal_Page extends AppCompatActivity {
    private TextInputEditText editText;
    public TextView infoHint;
    public TextView infoHint2;
    private TextInputEditText editText2;
    private Button withdraw;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawal__page);
        infoHint = findViewById(R.id.hint);
        editText= findViewById(R.id.edit);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    infoHint.setVisibility(View.VISIBLE);
                }else {
                    infoHint.setVisibility(View.INVISIBLE);
                }
            }
        });

        infoHint2 = findViewById(R.id.hint2);
        editText2 = findViewById(R.id.edit2);
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    infoHint2.setVisibility(View.VISIBLE);
                }else{
                    infoHint2.setVisibility(View.INVISIBLE);
                }
            }
        });

        withdraw = findViewById(R.id.withdrawBtn);
        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Withdrawal_InputPin.class);
                startActivity(nextPage);
            }
        });

        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getApplicationContext(), Homeview.class);
                startActivity(home);
            }
        });

    }
}
