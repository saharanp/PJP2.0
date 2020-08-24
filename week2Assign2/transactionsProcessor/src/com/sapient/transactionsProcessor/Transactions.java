package com.sapient.transactionsProcessor;

public class Transactions implements Comparable {	
	
	int eId;
	int cId;
	String sId;
	String transactionType;
	String transactionDate;
	int value;
	boolean blvalue;
	int fee;


@Override
public int compareTo(Object obj1) {
	// TODO Auto-generated method stub
	
	Transactions obj = (Transactions)obj1;
	int cIdCompare = this.cId - obj.cId;
	int feeCompare = this.fee -  obj.fee;
	int transactionTypecomp = this.transactionType.compareTo(obj.transactionType);
	int transactionDatecomp = this.transactionDate.compareTo(obj.transactionDate);
	/*
	 if(cIdCompare == 0&& tTypeCompare == 0 && tDateCompare == 0) {
		
				return feeCompare;
			else if(cIdCompare == 0&& tTypeCompare == 0)
				return tDateCompare;
		}
		else {
			return tTypeCompare;
	}
	 */
	if(cIdCompare == 0) {
		if(transactionTypecomp == 0) {
			if(transactionDatecomp == 0)
				return feeCompare;
			else
				return transactionDatecomp;
		}
		else {
			return transactionTypecomp;
		}
	}
	else {
		return cIdCompare;
	}
}

@Override
public String toString() {
	return cId + "," + transactionType + "," + transactionDate + "," + ""  + "," + fee + "\n" ;
}

}