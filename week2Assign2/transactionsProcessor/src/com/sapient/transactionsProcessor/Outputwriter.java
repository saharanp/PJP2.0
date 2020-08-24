package com.sapient.transactionsProcessor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Outputwriter {

	static List<Transactions> Data = new ArrayList<Transactions>();
	
	public static void parseInput(String line) {		
		System.out.println(line);
		//String [] arr= line.split(" ' ");
		
		
		String [] arr = line.split(",");
		/*
		 if(arr[2].equals(,)) {
			Data.add(new NormalTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[3],arr[4],Integer.parseInt(arr[5]));
		}
		 */
		if(arr[2].equals("")) {
			Data.add(new NormalTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[3],arr[4],Integer.parseInt(arr[5]),arr[6] == "Y" ? true : false));
		}
		else {
			Data.add(new IntradayTransaction(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],arr[4],Integer.parseInt(arr[5])));
		}
	}

	public static void writeData() {
		String str = "";
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Dell\\Desktop\\week2\\week2Assign2\\sample_output.csv");
			Collections.sort(Data);
			/*
			 for( var t : Data) {
				str += t;
			}
			 */
			for( Transactions t : Data) {
				str += t;
			}
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

