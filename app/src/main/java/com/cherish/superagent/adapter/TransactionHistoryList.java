package com.cherish.superagent.adapter;

public class TransactionHistoryList {

    private double amount;
    private String transactionType;
    private String status;
    private String timestamp;
    private String accountNumber;


    public TransactionHistoryList(double amt, String type, String statuss, String timestampp, String number ){
        amount = amt;
        transactionType = type;
        status = statuss;
        timestamp = timestampp;
        accountNumber = number;
    }

    public void setAmount(int amt){
        amount = amt;
    }


    public double getAmount(){
        return amount;
    }


    public void setTransactionType(String type){
        transactionType=type;
    }


    public String getTransactionType(){
        return transactionType;
    }


    public void  setStatus(String statuss){
        status = statuss;
    }


    public String getStatus(){
        return status;
    }


    public void setTimestamp(String timestampp){
        timestamp=timestampp;
    }


    public String getTimestamp(){
        return timestamp;
    }


    public void setAccountNumber(String number){
        accountNumber = number;
    }


    public String getAccountNumber()
    {
        return accountNumber;
    }

}
