package com.example.advancedadapter;

public class Student {
    private String firstName;
    private String lastName;
    private String major;


    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    };

    //FirstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }

    //LastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String name){
        this.lastName = name;
    }

    //Major
    public String getMajor(){
        return major;
    }
    public void setMajor(String name){
        this.major = name;
    }


}
