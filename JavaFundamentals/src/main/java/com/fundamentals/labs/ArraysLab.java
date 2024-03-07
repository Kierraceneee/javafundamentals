package com.fundamentals.labs;

public class ArraysLab {

    //TASK ONE
    public void icecreamList(){
        String[]flavor =  new String[11];
        flavor[0] = "Chocolate";
        flavor[1] = "Vanilla";
        flavor[2] = "Rocky Road";
        flavor[3] = "Cookies n Cream";
        flavor[4] = "Mint Chocolate Chip";
        flavor[5] = "Strawberry";
        flavor[6] = "Chocolate Chip";
        flavor[7] = "Salted Caramel";
        flavor[8] = "Pistachio";
        flavor[9] = "Butter Pecan";
        flavor[10] = "Strawberry Cheesecake";
        for(int num = 0; num < flavor.length; num++){
            System.out.println(num);
        }
    }

    // TASK TWO
    public void scores(){
        int[][] myList = {{26,40},{10,28},{33,28},{30,24},
                            {13,19},{24,31},{6,30},{24,31},
                            {26,23}, {35,32},{17, 24}, {40,9},
                            {16,23}, {23,3},{3,26},{31,21}};
        for(int home = 0; home <myList.length; home++){
            for (int away = 0; away < myList.length; away++) {
                System.out.println("(" + "Home: " + home + ")" +
                        "(" + "Away: " + away + ")");
                /*if (home == 0 & away == 0) {
                    System.out.println();

                }*/
            }
        }
    }














public static void main(String[] args){
        ArraysLab myLab = new ArraysLab();
        myLab.icecreamList();
        myLab.scores();
}





}
