package com.fundamentals.lessons;

/* Lesson 8 - Looping Statements */
/* Looping statements require 3 key factors:
* 1. Initialized value
* 2. The Condition to be checked
* 3. The increment or decrement */
public class Lesson8 { // START OF CLASS

    /* The While Loop (Counts Up)*/
    public void aLittleWhileLoop(int total) {
        int num = 0; // initialized value
        while(num <= total){ // condition
            System.out.println(num + ", ");
            num++; // increment
        }
    }
    //(Counts Down)
    public void countdown(){
        int count = 10;
        while (count >= 0){
            System.out.print(count + ", "); //<-- "print" will have them print horizontally
            count--;
        }
    }


    /* Do while loop - The code block is
    * executed once prior to checking the condition */
    public void aDoWhileLoop(){
        int start = 0;
        do {
            if(start % 2 == 0){ //prints out even numbers by dividing number by 2
                System.out.println(start + " ");
            }
            start++;
        }while(start <= 20);
    }


    /* For Loop - A more compact way for doing loops. */
    public void aForLoop(int total){
        for(int i = 0; i < total; i++){
            System.out.print(i + " ");
        }
    }
    /* Looping within another loop*/
    public void multiLoop(int first, int second) {
        for (int i = 0; i < first; i++) {
            for (int k = 0; k < second; k++) {
                System.out.print("(" + i + "," + k + ")");
            }
            System.out.println();
        }
    }

    /* Branching */
    public void branchingExample(){
        for(int i = 0; i < 6; i++){
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                System.out.println("The loop ends");
            }
            if (i == 3){
                System.out.println("Three");
            }else{
                System.out.println(i);
            }
        }
    }





    // ---MAIN-----------------------------
    public static void main(String [] args){
        Lesson8 myLesson = new Lesson8();
        //myLesson.aLittleWhileLoop(10);
        //myLesson.countdown();
        //myLesson.aDoWhileLoop();
        //myLesson.aForLoop(14);
        //myLesson.multiLoop(5, 3);
        myLesson.branchingExample();
    }




























































} // END OF CLASS
