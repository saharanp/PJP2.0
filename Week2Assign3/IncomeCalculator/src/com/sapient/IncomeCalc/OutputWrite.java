package com.sapient.IncomeCalc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class OutputWrite {

	static List<Read> Data = new ArrayList<Read>();

	public OutputWrite(){}
	public static void parseInput(String line) {		
		System.out.println(line);
		String [] arr = line.split(",");
		Data.add(new Read(arr[0],arr[1],arr[2],arr[3],Double.parseDouble(arr[4])));		
	}

	public static void writeData() {
		String output = "";
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\Dell\\Desktop\\week2\\Week3Assign3\\sample_output.csv");
				Collections.sort(Data);
				for(Read detail : Data) {
					output+=detail;
					System.out.println(detail);
				}
			fw.write(output);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


