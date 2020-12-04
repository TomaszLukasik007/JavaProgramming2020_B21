package day37_CustomClass;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.time.LocalDate;

public class Student {
    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){
        this.name  = name;
        this.gender = gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }

  //  public void getInfo(){
    //    System.out.println("Student name : " + name + "\nStudent ID   : " + com.sun.xml.internal.bind.v2.model.core.ID + "\ngpa: " + gpa + "\nAge: " + age + "\nGender: " + gender);

    public String toString() {
        return
                "name= " + name +
                        ", ID= " + ID +
                        ", DOfB " + DOfB +
                        ", age " + age +
                        ", gender " + gender +
                        ", gpa " + gpa;


    }
}
/*
1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
 */