package com.fundamentals.practice;

public class CompanyInfo {
    /* Practice for using Static */

    static String company = "Your Company";
    int id;
    String name;


   public void display(){
       System.out.println("id: "+id+" Name:"+name+ " Company: "+company);
   }

   public static void main(String[] args){
       CompanyInfo info = new CompanyInfo();
       info.id = 10010;
       info.name= "Peter Parker";
       info.display();
       // using Static variable
       CompanyInfo.company = "Daily Bugle";
       //call display a second time
       info.display();
   }






















}// END OF CLASS
