package Problem1;

public class CollegeStudent extends Student {
    private String major;
    private int year;

    // Constructor for CollegeStudent class that takes in the name of the college
    // student, their gender and age, their ID number, their GPA, their year, and
    // their major.
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method to display the name of the college student, their year, and
    // their major.
    public String toString() {
        return super.toString() + "\nYear: " + year + "\nMajor: " + major;
    }
}