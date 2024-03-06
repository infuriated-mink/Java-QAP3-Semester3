package Problem1;

public class Teacher extends Person {
    private String subject;
    private double salary;

    // Constructor for Teacher class that takes in the name of the teacher and their
    // age, gender, subject, and salary
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to display the name of the teacher, their subject, and their
    // salary
    public String toString() {
        String formattedSalary = String.format("$%.2f", salary);
        return super.toString() + "\nSubject: " + subject + "\nSalary: " + formattedSalary;
    }
}
