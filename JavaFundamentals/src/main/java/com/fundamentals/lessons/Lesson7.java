package com.fundamentals.lessons;

public class Lesson7 {

    // Basic If Statement
    public void amIGreater(int value1, int value2) {
        System.out.println("Before If");
        if(value1 >= value2){
            System.out.println("Value is greater than or equal.");
        }
        System.out.println("After if");
    }
    // Basic if/else statement
    public void amIGreaterOrNot(String name1, String name2){
        System.out.println("Before if/else");
        if(name1.equals(name2)){
            System.out.println("Both names are equal.");
        } else {
            System.out.println("Both names are not equal.");
        }
        System.out.println("After if/else");
    }

    // Two independent if statements
    public void justTwoIfs(int num1, int num2){
        System.out.println("Two ifs not tied to each other");
        if(num1 > 10){
            System.out.println(num1 + " is greater than 100");
        }
        if(num2 < 100){
            System.out.println(num2 + " is less than 100");
        }
    }

    // if else chain
    public String checkScores(int score){
        if(score < 20) {
            return "The score is less than 20.";
        }else if(score <= 30) {
            return "The score is between 20 and 30.";
        }else if(score <=40) {
            return "The score is between 31 and 40";
        }else {
            return "The score is greater than 40.";
        }
    }
    // And (&&) or (||) logical statements
    public void theOrTheAnd(int value){
        if(value > 100 || value < 50){
            System.out.println("Value is less than 50 or greater than 100");
        }
        if(value % 2 == 0 && value < 30){
            System.out.println("Value is less than 30 and even");
        }
    }

        // Switch Statements
    public String pizzaFlavors(String flavor){
        String message;
        switch(flavor) {
            case "pepperoni":
                message = "I love pepperoni pizza";
                break;
            case "hamburger":
                message = "I love hamburger pizza";
                break;
            case "chesse":
                message = "I love cheese pizza.";
                break;
            default:
                message = "I love to eat " + flavor + " pizza";
        }
        return message;
    }












    public static void main(String[] args ){
        Lesson7 myLesson = new Lesson7();
        //myLesson.amIGreater(10,5);
        //myLesson.amIGreaterOrNot("Ted", "ted");
        //myLesson.justTwoIfs(657,  95);
        //String answer = myLesson.checkScores(37);
        //System.out.println(answer);
        //myLesson.theOrTheAnd(10);
        String pizza = myLesson.pizzaFlavors("yuckity hamburger ");
        System.out.println(pizza);

    }





















} // end of class
