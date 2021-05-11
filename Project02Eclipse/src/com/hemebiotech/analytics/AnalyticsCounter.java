package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	/*private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0*/
	
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();


		int i = 0;	// set i to 0

		Map<String, Integer> mySymptoms = new TreeMap<String, Integer>();

		while (line != null) {
			if (mySymptoms.get(line) == null) {
				mySymptoms.put(line, 1);
			} else {
				mySymptoms.put(line, mySymptoms.get(line) + 1);
			}

			line = reader.readLine();	// get another symptom
		}

		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		for (Entry entry : mySymptoms.entrySet()) {
			writer.write(entry.getKey() + " = " + entry.getValue() + System.getProperty("line.separator"));
		}

		writer.close();
		System.out.println("the symptoms.txt was analysed correctly!!!");
	}
}
