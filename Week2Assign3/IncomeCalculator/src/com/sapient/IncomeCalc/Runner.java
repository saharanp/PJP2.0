package com.sapient.IncomeCalc;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		
		String input = "C:\\Users\\Dell\\Desktop\\week2\\Week3Assign3\\sample_input.csv";
		FileParse.read(input);
	    OutputWrite.writeData();
	}

}
