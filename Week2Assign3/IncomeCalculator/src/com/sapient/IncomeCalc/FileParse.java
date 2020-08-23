package com.sapient.IncomeCalc;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileParse {
		   
	   public static void read(String csvFile) {
	      try {
		         File file = new File(csvFile);
		         FileReader flread = new FileReader(file);
		         Scanner rd = new Scanner(flread);
		         while(rd.hasNextLine()) {
		        	 OutputWrite.parseInput(rd.nextLine());
		         }
		         rd.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
}
