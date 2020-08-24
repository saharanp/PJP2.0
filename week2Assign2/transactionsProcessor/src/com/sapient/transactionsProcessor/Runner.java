package com.sapient.transactionsProcessor;

	import java.io.IOException;

	public class Runner {

		public static void main(String[] args) throws IOException {
			
			String csvFile = "C:\\Users\\Dell\\Desktop\\week2\\week2Assign2\\sample_input.csv";
		    FileParser.read(csvFile);
		    Outputwriter.writeData();
		}

	}