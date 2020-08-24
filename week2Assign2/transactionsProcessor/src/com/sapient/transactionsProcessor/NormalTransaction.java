package com.sapient.transactionsProcessor;
/*
 public class NormalTransaction {

	public NormalTransaction(int eId,int cId,String transactionType, String transactionDate, int value, boolean blValue){
		
		this.eId = eId;
		this.cId = cId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.value = value;
		this.blvalue = blValue;
		if(blValue==true)
			fee=500;
		//elseiftransactionType.equals("sell") || transactionType.equals("withdraw"))
			fee=100;
		else
			fee=50;		
		
 */

public class NormalTransaction extends Transactions{

	public NormalTransaction(int eId,int cId,String transactionType, String transactionDate, int value, boolean blValue){
		
		this.eId = eId;
		this.cId = cId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.value = value;
		this.blvalue = blValue;
		if(blValue) 
			fee = 500;
		else {
			if(transactionType.equals("sell") || transactionType.equals("withdraw")) 
				fee = 100;
			else
				fee = 50;
		}
	}


}

