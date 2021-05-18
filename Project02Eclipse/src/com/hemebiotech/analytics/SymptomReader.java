package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class SymptomReader {
    /**
     * This method use the treeMap method to read
     * all symptoms from the file symptoms.txt
     * @return
     * @throws IOException
     */
    public Map<String, Integer>  readSymptom() throws IOException {
        File myFile = new File("./symptoms.txt");
        try {
            BufferedReader reader = new BufferedReader (new FileReader(myFile));
            String line = reader.readLine();
            Map<String, Integer> mySymptoms = new TreeMap<>();
            while (line != null) {
                if (mySymptoms.get(line) == null) {
                    mySymptoms.put(line, 1);
                } else {
                    mySymptoms.put(line, mySymptoms.get(line) + 1);
                }
                line = reader.readLine();	// get another symptom
            }
            return mySymptoms;
        } catch (FileNotFoundException fnf) {
            System.out.println("Impossible de lire le fichier symptoms.txt");
        }
        return readSymptom();
    }
}
