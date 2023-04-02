/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testing_project_10;

import models.Student;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Youssef
 */
public class Testing_project_10 {

    public static void main(String[] args) throws FileNotFoundException {
        Csv_Reader cr = new Csv_Reader();
        ArrayList<Student> studentList;
        studentList = cr.csv_parsing("C:\\Users\\abdoa\\Desktop\\New Text Document.csv");
        System.out.println(studentList.get(0).getName());
    }
}