package Problem1;

public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    // Constructor for Student class that takes in the name of the student, their
    // gender and age, their ID number, and their GPA
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setters
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method to display the name of the student, their ID number, and
    // their GPA
    public String toString() {
        return super.toString() + "\nID Number: " + myIdNum + "\nGPA: " + myGPA;
    }
}
