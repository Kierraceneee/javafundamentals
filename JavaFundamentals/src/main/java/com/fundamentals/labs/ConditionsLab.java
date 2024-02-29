package com.fundamentals.labs;

public class ConditionsLab {

    //TASK ONE
    public void amIEqual(String name1, String name2){
        if(name1.equals(name2)){
            System.out.println("Both names are equal.");
        } else {
            System.out.println("Both names are not equal.");
        }
    }

    //TASK TWO
    public String howsMyGrade(char grade) {
        String message;
        switch (grade) {
            case 'E':
                message = "Excellent Grade";
                break;

            case 'V':
                message = "Very Good Grade";
                break;

            case 'G':
                message = "Good Grade";
                break;

            case 'A':
                message = "Average Grade";
                break;

            case 'F':
                message = "Failed Grade";
                break;
            default:
                message = "Try Again";
        }
        return message;
    }



    public static void main(String[] args){
        ConditionsLab myConditions =  new ConditionsLab();
        //myConditions.amIEqual("Bob", "Bob");
        String grade = myConditions.howsMyGrade('G');
        System.out.println(grade);
    }

} // END OF CLASS
