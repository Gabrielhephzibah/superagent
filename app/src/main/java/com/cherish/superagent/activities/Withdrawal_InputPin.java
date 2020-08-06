package com.cherish.superagent.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cherish.superagent.R;

public class Withdrawal_InputPin extends AppCompatActivity {
    private Button cancel;
    private  Button canceltrans;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawal__input_pin);
        cancel = findViewById(R.id.WithdrawBtn);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(getApplicationContext(), withdrawal_confirmationPage.class);
                startActivity(nextPage);
            }
        });

        canceltrans = findViewById(R.id.cancelTrancBtn);
        canceltrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(Withdrawal_InputPin.this).create();
                alertDialog.setTitle("Cancel Withdrawal");
                alertDialog.setMessage("Credit will not be transfered. \n" +
                        "You must return any cash received for this withdrawal!");
                alertDialog.setButton(Dialog.BUTTON_POSITIVE,"Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.setButton(Dialog.BUTTON_NEGATIVE, "CANCEL WITHDRAWAL", new DialogInterface.OnClickListener() {
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
                Intent home =  new Intent(getApplicationContext(), Withdrawal_Page.class);
                startActivity(home);
            }
        });


    }
}
