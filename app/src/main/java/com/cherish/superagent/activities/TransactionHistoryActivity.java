package com.cherish.superagent.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.cherish.superagent.R;
import com.cherish.superagent.adapter.TransactionAdapter;
import com.cherish.superagent.adapter.TransactionHistoryList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class TransactionHistoryActivity extends AppCompatActivity {
    ImageView back;

    TransactionAdapter transactionAdapter;

    ArrayList<TransactionHistoryList> transactionHistoryLists = new ArrayList<>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);
        listView = findViewById(R.id.transactionHistory);

        back = findViewById(R.id.arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(), Homeview.class);
                startActivity(back);
            }
        });

        JSONObject transaction1 = new JSONObject();
        try {
            transaction1.put("amount",2000.00);
            transaction1.put("type","Withdrawal");
            transaction1.put("status","Completed");
            transaction1.put("accountNumber","09087654321");
            transaction1.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction2 = new JSONObject();
        try {
            transaction2.put("amount",4000.00);
            transaction2.put("type","Withdrawal");
            transaction2.put("status","Completed");
            transaction2.put("accountNumber","23456786");
            transaction2.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction3 = new JSONObject();
        try {
            transaction3.put("amount",6000.00);
            transaction3.put("type","Deposit");
            transaction3.put("status","Completed");
            transaction3.put("accountNumber","234h44457889");
            transaction3.put("timeStamp","11:32,10/10/2017");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction4 = new JSONObject();
        try {
            transaction4.put("amount",7000.00);
            transaction4.put("type","Withdrawal");
            transaction4.put("status","Completed");
            transaction4.put("accountNumber","234999887");
            transaction4.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction5 = new JSONObject();
        try {
            transaction5.put("amount",2000.00);
            transaction5.put("type","Pending");
            transaction5.put("status","Completed");
            transaction5.put("accountNumber","78856786");
            transaction5.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction6 = new JSONObject();
        try {
            transaction5.put("amount",3000.00);
            transaction5.put("type","Pending");
            transaction5.put("status","Completed");
            transaction5.put("accountNumber","78856786");
            transaction5.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction7 = new JSONObject();
        try {
            transaction5.put("amount",3000.00);
            transaction5.put("type","Pending");
            transaction5.put("status","Completed");
            transaction5.put("accountNumber","78856786");
            transaction5.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONObject transaction8 = new JSONObject();
        try {
            transaction5.put("amount",3000.00);
            transaction5.put("type","Pending");
            transaction5.put("status","Completed");
            transaction5.put("accountNumber","78856786");
            transaction5.put("timeStamp","11:32,10/10/2017");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(transaction1);
        jsonArray.put(transaction2);
        jsonArray.put(transaction3);
        jsonArray.put(transaction4);
        jsonArray.put(transaction5);
        jsonArray.put(transaction5);
        jsonArray.put(transaction5);
        jsonArray.put(transaction5);
        jsonArray.put(transaction6);
        jsonArray.put(transaction7);
        jsonArray.put(transaction8);
        jsonArray.put(transaction4);
        jsonArray.put(transaction5);
        jsonArray.put(transaction5);
        jsonArray.put(transaction5);
        jsonArray.put(transaction5);


                   for (int i = 0; i<jsonArray.length(); i++){

            try{

                System.out.println(jsonArray);

                double amount = Double.parseDouble(jsonArray.getJSONObject(i).getString("amount"));
                String type = jsonArray.getJSONObject(i).getString("type");
                String status = jsonArray.getJSONObject(i).getString("status");
                String accountNumber = jsonArray.getJSONObject(i).getString("accountNumber");
                String timeStamp = jsonArray.getJSONObject(i).getString("timeStamp");

                transactionHistoryLists.add(new TransactionHistoryList(amount,type,status,timeStamp,accountNumber));

            }catch (Exception e){
                e.printStackTrace();
            }
        }


        transactionAdapter = new TransactionAdapter(TransactionHistoryActivity.this,transactionHistoryLists);
        listView.setAdapter(transactionAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("ITEM_AT_POSITION "+parent.getAdapter().getItem(position).toString());
                String transactionType = ((TextView) view.findViewById(R.id.type)).getText().toString();
                String amt = ((TextView) view.findViewById(R.id.transactionAmount)).getText().toString();
                String timestamp = ((TextView) view.findViewById(R.id.timestamp)).getText().toString();
                String status = ((TextView) view.findViewById(R.id.status)).getText().toString();
                String accountNumber = ((TextView) view.findViewById(R.id.accountNumber)).getText().toString();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TransactionHistoryActivity.this);
                alertDialogBuilder.setTitle("Transaction Details");
                alertDialogBuilder
                        .setMessage("\nAmount : " + amt + "\n\nStatus : " + status + "\n\nDated : " + timestamp + "\n\nTransaction : " + transactionType)
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });


    }
}
