package com.mycompany.testing_project_10;

import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Csv_Reader {
    ArrayList<Student> csv_parsing(String path) throws FileNotFoundException {
        ArrayList<Student> studentList = new ArrayList<>();
        String line, word;

        Scanner sc = new Scanner(new File(path));

        //skips first line
        if(sc.hasNextLine()){
            sc.nextLine();
        }

        while (sc.hasNextLine()) {
            line = sc.nextLine();

            String[] wList = line.split(",");
            String name = wList[0];
            int number = Integer.parseInt(wList[1]);
            double activitiesMark = Double.parseDouble(wList[2]);
            double oralOrPracticalMark = Double.parseDouble(wList[3]);
            double midTermMark = Double.parseDouble(wList[4]);
            double finalMark = Double.parseDouble(wList[5]);
            Student st = new Student(name, number, activitiesMark, oralOrPracticalMark, midTermMark, finalMark);
            studentList.add(st);
        }
        sc.close();
        return studentList;
    }
}
