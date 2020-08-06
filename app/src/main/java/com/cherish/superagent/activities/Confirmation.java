package com.cherish.superagent.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cherish.superagent.R;

public class Confirmation extends AppCompatActivity {
    private Button success;
    private  Button cancel;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        success =  findViewById(R.id.DepositBtn);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), Deposit_Successful.class);
                startActivity(nextPage);
            }
        });


        cancel = findViewById(R.id.cancelTrancBtn);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(Confirmation.this).create();
                alertDialog.setTitle("Cancel Deposit");
                alertDialog.setMessage("Credit will not be transfered. \n" +
                        "You must return any cash received for this deposit!");
                alertDialog.setButton(Dialog.BUTTON_POSITIVE,"Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.setButton(Dialog.BUTTON_NEGATIVE, "CANCEL DEPOSIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(MainActivity);
                    }
                });
                alertDialog.show();
            }
        });

        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previous_page = new Intent(getApplicationContext(), Deposit.class);
                startActivity(previous_page);
            }
        });



    }
}
