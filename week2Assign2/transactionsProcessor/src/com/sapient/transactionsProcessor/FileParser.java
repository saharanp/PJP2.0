package com.sapient.transactionsProcessor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileParser {
		   
	   public static void read(String csvFile) {
	      try {
		         File file = new File(csvFile);
		         FileReader flread = new FileReader(file);
		         Scanner read = new Scanner(flread);
		         Outputwriter.parseInput(read.nextLine().substring(3));
		         while(read.hasNextLine()) {
		        	 Outputwriter.parseInput(read.nextLine());
		         }
		         read.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
}

