package com.cherish.superagent.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.cherish.superagent.R;
import com.google.android.material.textfield.TextInputEditText;

public class Deposit extends AppCompatActivity {

    private TextInputEditText editText;
    private ImageView back;
    public TextView infoHint,fixed;
    public TextView infoHint2;
    private TextInputEditText editText2;
    private Button nextPage;
    String textString, fixedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        infoHint = findViewById(R.id.hint);
        editText= findViewById(R.id.edit);
        fixed = findViewById(R.id.fixed);
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
                    textString = editText2.getText().toString().trim();
                    fixedText = fixed.getText().toString().trim();
                   if (textString.equals(fixedText)){
                       editText2.setTextColor(Color.BLACK);
                   }
                }else{
                    infoHint2.setVisibility(View.INVISIBLE);
                }
            }
        });


        nextPage = findViewById(R.id.depositBtn);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textString = editText2.getText().toString().trim();
                fixedText = fixed.getText().toString().trim();
                if (!textString.equals(fixedText)){
                    editText2.setTextColor(Color.RED);

                }else {
                    Intent newPage = new Intent(getApplicationContext(), Confirmation.class);
                    startActivity(newPage);
                }


            }
        });

        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backPage = new Intent(getApplicationContext(),Homeview.class);
                startActivity(backPage);
            }
        });

    }
}
