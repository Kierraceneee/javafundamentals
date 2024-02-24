package com.fundamentals.labs;
  // TASK 1
    public class StringsLab {

        // Statement 1
    public void myString(){
        String myString = "My First String";
        System.out.println(myString.toLowerCase());
    }

    // Statement 2
    String str = "My Second String";
    public void myString2(){
        char ch = str.charAt(1);
        System.out.println(ch);
    }

    // Statement 3
    public void myString3(String value){
        String myString3 = "My Third String";
        System.out.println(myString3 + value);
        System.out.println(value.length());

    }

    //TASK 2

    String hill = "Jack and Jill went up the hill";
    String water = "to fetch a pail of water.";
    String crown = "Jack fell down and broke his crown";
    String after = "and Jill cam tumbling down after";

    public String nurseryRhyme(String message) {
      return hill + " " + water + " " + crown + " " + after;
    }
    public String escapeMe (){
        return "Jack and Jill went up the hill\n to fetch a pail of water.\n Jack fell down and broke his crown\n and Jill came tumbling after.";
    }


    public static void main(String [] args){
        StringsLab myStringsLab = new StringsLab();
        String msg = "My Strings Lab";
        //myStringsLab.myString();
        //myStringsLab.myString2();
        //myStringsLab.myString3(msg);
        System.out.println(myStringsLab.nurseryRhyme(msg));
        System.out.println(myStringsLab.escapeMe());
    }




    } // END OF CLASS
