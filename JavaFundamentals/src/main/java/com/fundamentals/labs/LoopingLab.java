package com.fundamentals.labs;

public class LoopingLab {

    //TASK ONE
  public void countByFive() {
      int num = 0;
      while (num <= 15){
          if (num == 5) {
              System.out.println("five, ");
          } else if (num == 10) {
              System.out.println("ten, ");
          } else if (num == 15) {
              System.out.println("fifteen");
          }else{
              System.out.println(num + ",");
      }num++;
      }
  }

    //TASK TWO
    public void countToThirty() {
        int start = 0;
        do {
            if(start % 3 == 0){
                System.out.println(start + " ");
            }
            start++;
        } while(start <= 30);
    }


    public static void main(String[] args){
    LoopingLab myLab = new LoopingLab();
    myLab.countByFive();
    myLab.countToThirty();
    }
}

