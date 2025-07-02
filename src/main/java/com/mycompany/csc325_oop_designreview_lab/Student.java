/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

// Student subclass of Human
public class Student extends Human {
    private double gpa;
    private int credits;

    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // getter for GPA
    public double getGpa() {
        return gpa;
    }

    // setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Abstract methods from Human
    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student{name=" + getName() + ", age=" + getAge() + ", credits=" + credits + ", GPA=" + gpa + "}";
    }
}

