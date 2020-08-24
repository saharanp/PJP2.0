package com.sapient.transactionsProcessor;

/*
 public class IntradayTransactions{

	public IntradayTransaction(int eId,int cId,String sId, String transactionType, String transactionDate, int value)
	{
		this.eId = eId;
		this.cId = cId;
		this.sId = sId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.value = value;
		this.fee = 10;
	}
	
}
 */
public class IntradayTransaction extends Transactions{

	public IntradayTransaction(int eId,int cId,String sId, String transactionType, String transactionDate, int value)
	{
		this.eId = eId;
		this.cId = cId;
		this.sId = sId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.value = value;
		this.fee = 10;
	}
	
}



