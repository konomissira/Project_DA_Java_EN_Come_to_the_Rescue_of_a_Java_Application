package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		SymptomReader reader = new SymptomReader();
		Map<String,Integer> mySymptoms = reader.readSymptom();
		WriteSymptom writer = new WriteSymptom();
		writer.writeSymptom(mySymptoms);

	}
}
