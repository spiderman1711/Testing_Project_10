package com.mycompany.testing_project_10;

import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.mycompany.testing_project_10.Verfication;
import models.Subject;

public class Csv_Reader {
    
    Subject getSubject(String path)  throws FileNotFoundException {
        String line;
        Subject subject = null;
        Verfication verification = new Verfication();
        Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\" + path));

        line = sc.nextLine();
        String[] sList = line.split(",");

        String subjectName =  sList[0];
        String subjectCode = sList[1];
        double subjectFullMarkNumber = Double.parseDouble(sList[2]);    
        if(verification.isValidSubjectName(subjectName) && verification.isValidSubjectCode(subjectCode) && verification.isValidFullMark(subjectFullMarkNumber)) {
        	subject = new Subject(subjectName, subjectCode, subjectFullMarkNumber);
        }
        
        sc.close();
        return subject;
    }
    
    
    	public ArrayList<Student> csv_parsing(String path) throws FileNotFoundException {
        Subject subject = new Subject("1", "1", 100);
        ArrayList<Student> studentList = new ArrayList<>();
        String line, word;

        Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\" + path));
        Verfication verification = new Verfication();
        // parse first time
        if(sc.hasNextLine()){
            line = sc.nextLine();
            String[] sList = line.split(",");
            
            String subjectName =  sList[0];
            String subjectCode = sList[1];
            double subjectFullMarkNumber = Double.parseDouble(sList[2]);    
            
            subject = new Subject(subjectName, subjectCode, subjectFullMarkNumber);
        }

        while (sc.hasNextLine()) {
            line = sc.nextLine();

            String[] wList = line.split(",");
            
            String name = wList[0];
            boolean isValidName = verification.isValidStudentName(name);
            
            String number = wList[1];
            boolean isValidNumber = verification.isValidStudentNumber(number);
            
            double activitiesMark = Double.parseDouble(wList[2]);
            boolean isValidActivitesMArk = verification.isValidActivitiesMark(activitiesMark, subject.getFullMark());
            
            double oralOrPracticalMark = Double.parseDouble(wList[3]);
            boolean isValidOralOrPracticalMark = verification.isValidOralPracticalMark(activitiesMark, subject.getFullMark());
            
            double midTermMark = Double.parseDouble(wList[4]);
            boolean isValidMidTermMark = verification.isValidMidtermExamsMark(midTermMark, subject.getFullMark());
            
            double finalMark = Double.parseDouble(wList[5]);
            boolean isValidFinalMark = verification.isValidFinalExamMark(finalMark, subject.getFullMark());

            if(isValidName && isValidNumber && isValidActivitesMArk && isValidOralOrPracticalMark && isValidMidTermMark && isValidFinalMark){
                Student st = new Student(name, number, activitiesMark, oralOrPracticalMark, midTermMark, finalMark);
                studentList.add(st);
            }
        }
        sc.close();
        System.out.println(studentList.size());
        return studentList;
    }
}