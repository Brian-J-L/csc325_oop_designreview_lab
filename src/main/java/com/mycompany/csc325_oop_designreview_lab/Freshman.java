package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    // Constructor takes name, age, and credits and passes them to the Student constructor
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }
    // Overrides the toString method to display freshman-specific student information
    @Override
    public String toString() {
        return "Freshman{name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", GPA=" + getGpa() + "}";
    }
}
