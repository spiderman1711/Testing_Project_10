/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class Subject {
    String subjectName;
    String subjectCode;
    double fullMark;

    public Subject(String subjectName, String subjectCode, double fullMark) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.fullMark = fullMark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public double getFullMark() {
        return fullMark;
    }

    public void setFullMark(double fullMark) {
        this.fullMark = fullMark;
    }
    
    
}
