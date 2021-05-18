package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptom {
    /**
     * This method take an argument mySymptoms whose a Map then return all mySymptoms
     * that have been read to the readSymptom() method then write all symptoms
     * in a new file called result.out in alphabetical order
     * @param mySymptoms
     * @throws IOException
     */
    public void writeSymptom(Map<String, Integer> mySymptoms) throws IOException {
        FileWriter writer = new FileWriter ("result.out");
        for (
                Map.Entry entry : mySymptoms.entrySet()) {
            writer.write(entry.getKey() + " = " + entry.getValue() + System.getProperty("line.separator"));
        }
        writer.close();
        System.out.println("Le fichier symptoms.txt a été lis correctement!!!");
    }
}
