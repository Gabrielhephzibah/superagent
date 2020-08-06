package com.cherish.superagent.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cherish.superagent.R;

import java.util.ArrayList;
import java.util.List;

public class TransactionAdapter extends ArrayAdapter<TransactionHistoryList> {

    private Context mcontext;

    private List<TransactionHistoryList> transactionList;

    public TransactionAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<TransactionHistoryList> list) {
        super(context, 0 , list);
        mcontext = context;
        transactionList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mcontext).inflate(R.layout.history_layout,parent,false);

        TransactionHistoryList transaction = transactionList.get(position);
        TextView amount = listItem.findViewById(R.id.transactionAmount);
        amount.setText(""+transaction.getAmount());

        TextView transactionType = listItem.findViewById(R.id.type);
        transactionType.setText(transaction.getTransactionType());

        TextView status  = listItem.findViewById(R.id.status);
        status.setText(transaction.getStatus());

        TextView timestamp = listItem.findViewById(R.id.timestamp);
        timestamp.setText(transaction.getTimestamp());

        TextView accountNumber = listItem.findViewById(R.id.accountNumber);
        accountNumber.setText(transaction.getAccountNumber());


//
//        if(Transaction.getResponseCode().equals("00")){
//            amount.setText(Transaction.getTransactionAmount());
//            amount.setTextColor(Color.parseColor("#00B653"));
//        }else{
//            amount.setText(Transaction.getTransactionAmount());
//            amount.setTextColor(Color.parseColor("#B6042F"));
//        }
//        TextView datee = (TextView) listItem.findViewById(R.id.transactionDate);
//        datee.setText(Transaction.getTransactionDate());
//
//        TextView status = (TextView) listItem.findViewById(R.id.transactionStatus);
//        if(Transaction.getResponseCode().equals("00")){
//            status.setText(Transaction.getTransactionStatus());
//            status.setTextColor(Color.parseColor("#00B653"));
//        }else{
//            status.setText(Transaction.getTransactionStatus());
//            status.setTextColor(Color.parseColor("#B6042F"));
//        }

        return listItem;
    }

    @Override
    public int getCount() {
        if(transactionList.size() > 10){
            return 10;
        }else{
            return transactionList.size();
        }
    }
}