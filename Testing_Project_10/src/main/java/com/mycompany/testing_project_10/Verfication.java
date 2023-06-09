/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testing_project_10;

/**
 *
 * @author Youssef
 */
public class Verfication {
    
    

public boolean isValidSubjectName(String name) {
    if (name == null || name.isEmpty() || name.charAt(0) == ' ') {
        return false;
    }
    for (char c : name.toCharArray()) {
        if (!Character.isLetter(c) && c != ' ') {
            return false;
        }
    }
    return true;
}




public boolean isValidSubjectCode(String code) {
    if (code == null || code.length() < 6 || code.length() > 7) {
        return false;
    }
    for (int i = 0; i < 3; i++) {
        if (!Character.isLetter(code.charAt(i))) {
            return false;
        }
    }
    for (int i = 3; i < 6; i++) {
        if (!Character.isDigit(code.charAt(i))) {
            return false;
        }
    }
    if (code.length() == 7 && code.charAt(6) != 's') {
        return false;
    }
    return true;
}




public boolean isValidFullMark(double mark) {
    return mark == 100;
}





public boolean isValidStudentName(String name) {
    if (name == null || name.isEmpty() || name.charAt(0) == ' ') {
        return false;
    }
    for (char c : name.toCharArray()) {
        if (!Character.isLetter(c) && c != ' ') {
            return false;
        }
    }
    return true;
}





public boolean isValidStudentNumber(String number) {
   if(number==null||number.length()!=8||!Character.isDigit(number.charAt(0))){
       return false;
   } 
   for(int i=0;i<7;i++){
       if(!Character.isDigit(number.charAt(i))){
           return false;
       } 
   } 
   if(!Character.isLetter(number.charAt(7))&&number.length()==8){
       return false; 
   } 
   return true; 
}




public boolean isValidActivitiesMark(double mark, double fullMark) { 
        double result = mark/fullMark * 100;

        return result >= 0 && result <= 10;
    }






public boolean isValidOralPracticalMark(double mark, double fullMark) { 
        double result = mark/fullMark * 100;

        return result >= 0 && result <= 10;
    }






public boolean isValidMidtermExamsMark(double mark, double fullMark) { 
    double result = mark/fullMark * 100;
    
    return result >= 0 && result <= 20;
}






public boolean isValidFinalExamMark(double mark, double fullMark) { 
    double result = mark/fullMark * 100;

    return result >= 0 && result <= 60;
}

    
}
