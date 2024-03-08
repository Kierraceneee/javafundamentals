package com.fundamentals.lessons;

import java.sql.SQLOutput;

public class Lesson12 {
    // default constructor
    private String firstName, lastName;
    public Lesson12(){
        System.out.println("Default Constructor called");
    }

    public Lesson12(String firstName){
        //System.out.println("First Name: "+ firstName);
        this.firstName = firstName;
    }

    public Lesson12(String firstName, String lastName){
        //System.out.println("First Name: " + firstName);
        //System.out.println("Last Name: " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Setter and Getter Systems
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }
    public void sendMessage(String message){
        System.out.println(message);
    }
    public static void main(String[] args){
        Lesson12 myLesson = new Lesson12("Kierra", "Broadnax");
        myLesson.sendMessage("Welcome to Lesson 12");
        System.out.println(myLesson.getFirstName());
    }
}
