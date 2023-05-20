package com.mycompany.testing_project_10;

import models.*;
import java.util.*;

import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Csv_Writer {
    public void writeCsv(String path, Subject subject, ArrayList<Student> students) {
        try {
            File myObj = new File(System.getProperty("user.dir") + "\\" + path);
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        try {
            FileWriter myWriter = new FileWriter(System.getProperty("user.dir") + "\\" + path);
            myWriter.write(subject.toString());
            myWriter.write("\n");
            for(int i = 0; i < students.size(); i++) {
                myWriter.write(students.get(i).toString());
                myWriter.write("\n");
            }
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}