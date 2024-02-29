package com.fundamentals.labs;

public class ConditionasLab {

    public String areTheyEqual(int num){
        if(num < 100) {
            return "The score is less than 100.";
        }else{
            return "The score is between 100 and 110.";
        }
    }


    public static void main(String[] args){
        ConditionasLab myConditions =  new ConditionasLab();
        //String answer = myLesson.areTheyEqual(37);
        //System.out.println(answer);
    }

} // END OF CLASS
