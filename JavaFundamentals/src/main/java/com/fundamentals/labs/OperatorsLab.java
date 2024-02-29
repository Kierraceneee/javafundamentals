package com.fundamentals.labs;


import java.util.Scanner;

public class OperatorsLab { // START OF CLASS

    // TASK ONE
    public void mathEquations() {
        int sum1 = (10 - 2) * (12/ 3);
        int sum2 = (10 - 32) * (12/3) +24;
        System.out.println(sum1 +106);
        System.out.println(sum2 +232);
    }

    //TASK TWO
    public void operators(int free, int trapped) {
        free += trapped;
        System.out.println("+= operator " + free);
        free *= trapped;
        System.out.println("*= operator " + free);
        trapped %= free;
        System.out.println("%= operator " + trapped);

    }
    //TASK THREE
   public void whatsYourNumber() {
        int value1,givenValue, total;
        System.out.println("Give me a number");
        Scanner userInput = new Scanner(System.in);
        value1 = 5;
        givenValue = userInput.nextInt();
        total =  givenValue % value1;
        System.out.println("Your total is " + total);
    }

    public static void main(String[] args){
        OperatorsLab myOperators = new OperatorsLab();
        myOperators.mathEquations();
        //myOperators.operators(100,47);
        //myOperators.whatsYourNumber();

    }

































}// END OF CLASS
