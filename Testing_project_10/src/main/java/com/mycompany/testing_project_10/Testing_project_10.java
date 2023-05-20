
 package com.mycompany.testing_project_10;

 import models.Student;
 
 import java.io.FileNotFoundException;
 import java.util.ArrayList;
 import models.Subject;
 
 /*
  *
  *@author Youssef
  */
public class Testing_project_10 {

   public static void main(String[] args) throws FileNotFoundException {
       Csv_Reader cr = new Csv_Reader();

       Subject subject;
       ArrayList<Student> studentList;

       subject = cr.getSubject("samples\\Testing_Sample.csv");
       studentList = cr.csv_parsing("samples\\Testing_Sample.csv");
       new Csv_Writer().writeCsv("samples\\Output.csv", subject, studentList);
       for(int i=0; i<studentList.size(); i++) {
           System.out.println(studentList.get(i));
       }

   }}
