package org.example.fileio;

import java.io.*;
import java.util.ArrayList;

public class WriteAndReadFromFile {
    public static void main(String[] args) {
        String patientName = "Goaurav Singh";

        writeToFile(patientName);
        String filePath = "src/main/resources/patient_list.txt";
        ArrayList<String> patientList = readFromFile(filePath);
        System.out.println(patientList);


    }
    private static ArrayList<String> readFromFile(String filePath) {
        ArrayList<String> namesList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(filePath);
            DataInputStream dis = new DataInputStream(fis);
            String line;
            while(dis.readLine()!=null){
                line = dis.readLine();
                namesList.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return namesList;
    }
    private static void writeToFile(String patientName) {
        String filePath = "src/main/resources/patient_list.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(patientName);
            writer.newLine();  // Add a newline character after each entry
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
