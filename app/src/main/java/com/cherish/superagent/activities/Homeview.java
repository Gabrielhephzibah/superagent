package com.cherish.superagent.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.cherish.superagent.R;

public class Homeview extends AppCompatActivity {
    private LinearLayout deposit;
    private Button logOut;
    private  LinearLayout withdrawal;
    private LinearLayout transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeview);

        deposit = findViewById(R.id.depositBtn);
        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deposit = new Intent(getApplicationContext(), Deposit.class);
                startActivity(deposit);
            }
        });

        withdrawal = findViewById(R.id.WithdrawalBtn);
        withdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent withdrawal = new Intent(getApplicationContext(),Withdrawal_Page.class);
                startActivity(withdrawal);
            }
        });


        logOut= findViewById(R.id.logOutBtn);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(Homeview.this).create();
                alertDialog.setTitle("LOG OUT");
                alertDialog.setMessage("Be sure you remember your password before logging out");
                alertDialog.setButton(Dialog.BUTTON_POSITIVE,"Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.setButton(Dialog.BUTTON_NEGATIVE, "LOG OUT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(MainActivity);
                    }
                });
                alertDialog.show();
            }
        });

        transaction =findViewById(R.id.trasaction);
        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transaction_history = new Intent(getApplicationContext(), TransactionHistoryActivity.class);
                startActivity(transaction_history);
            }
        });

    }
}
