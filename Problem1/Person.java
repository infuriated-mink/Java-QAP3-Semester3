package Problem1;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender; // M or F

    // Constructor for Person class that takes in the name of the person, their age,
    // and their gender (M or F)
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setters
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // toString method to display the name of the person, their age, and their
    // gender
    public String toString() {
        return "\n" + "Name: " + myName + "\nAge: " + myAge + "\nGender: " + myGender;
    }
}