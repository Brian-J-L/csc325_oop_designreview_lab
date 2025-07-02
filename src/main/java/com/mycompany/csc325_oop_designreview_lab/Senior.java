package com.mycompany.csc325_oop_designreview_lab;
//inherit
public class Senior extends Student {
    //Constructor checks that the student has at least 85 credits
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            // For credit requirement not met, throw exception
            throw new IllegalArgumentException("A Senior must have at least 85 credits.");
        }
    }
    // Overrides the toString method to display freshman-specific student information
    @Override
    public String toString() {
        return "Senior{name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", GPA=" + getGpa() + "}";
    }
}

