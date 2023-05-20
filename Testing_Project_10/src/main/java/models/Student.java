package models;

public class Student {
    private String name;
    private String number;
    private double activitiesMark;
    private double oralOrPracticalMark;
    private double midTermMark;
    private double finalMark;
    
    private double totalMark;
    
    private double gpa;
    private String grade;
    
    public Student(String name, String number, double activitiesMark, double oralOrPracticalMark, double midTermMark, double finalMark) {
        this.name = name;
        this.number = number;
        this.activitiesMark = activitiesMark;
        this.oralOrPracticalMark = oralOrPracticalMark;
        this.midTermMark = midTermMark;
        this.finalMark = finalMark;
        this.totalMark = calculateTotalMark();
        calcualateGPAAndGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getActivitiesMark() {
        return activitiesMark;
    }

    public void setActivitiesMark(double activitiesMark) {
        this.activitiesMark = activitiesMark;
    }

    public double getOralOrPracticalMark() {
        return oralOrPracticalMark;
    }

    public void setOralOrPracticalMark(double oralOrPracticalMark) {
        this.oralOrPracticalMark = oralOrPracticalMark;
    }

    public double getMidTermMark() {
        return midTermMark;
    }

    public void setMidTermMark(double midTermMark) {
        this.midTermMark = midTermMark;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }
    
    private double calculateTotalMark(){
        return this.activitiesMark + this.oralOrPracticalMark + this.midTermMark + this.finalMark; 
    }
    
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    private void calcualateGPAAndGrade(){  
        if(this.totalMark >= 97){
            this.grade = "A+";
            this.gpa = 4.0;
        }
        else if(this.totalMark >=93){
            this.grade = "A";
            this.gpa = 4.0;
        }
        else if(this.totalMark >= 89){
            this.grade = "A-";
            this.gpa = 3.7;
        }
        else if(this.totalMark >= 84){
            this.grade = "B+";
            this.gpa = 3.3;
        }
        else if(this.totalMark >= 80){
            this.grade = "B";
            this.gpa = 3.0;
        }
        else if(this.totalMark >= 76){
            this.grade = "B-";
            this.gpa = 2.7;
        }
        else if(this.totalMark >= 73){
            this.grade = "C+";
            this.gpa = 2.3;
        }
        else if(this.totalMark >= 70){
            this.grade = "C";
            this.gpa = 2.0;
        }
        else if(this.totalMark >= 67){
            this.grade = "C-";
            this.gpa = 1.7;
        }
        else if(this.totalMark >= 64){
            this.grade = "D+";
            this.gpa = 1.3;
        }
        else if (this.totalMark >= 60){
            this.grade = "D";
            this.gpa = 1.0;
        }
        else{
            this.grade = "F";
            this.gpa = 0.0;
        }        
    }

	@Override
	public String toString() {
		return name + "," + number + "," + gpa + "," + grade;
	}
    
    
}