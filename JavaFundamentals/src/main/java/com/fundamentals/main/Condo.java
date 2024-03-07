package com.fundamentals.main;
/* Child of the House Class */
public class Condo extends House{
        private String balconyType;

        public Condo(String balconyType){
            this("Concrete", "Red", "Flat", 87, balconyType);
        }

        // CONSTRUCTOR
        public Condo(String foundationType, String doorColor, String roofStyle,
                     int totalWindows, String balconyType){
            this.balconyType = balconyType;
            this.foundationType = foundationType;
            this.entranceDoorColor = doorColor;
            this.roofStyle = roofStyle;
            this.totalWindows = totalWindows;
        }

        public String getBalconyType(){
            return balconyType;
        }
        public void maintenance(){
            System.out.println("Maintenance has been called");
        }
        public static void main(String[] args){
            Condo myCondo = new Condo("Railed");
            System.out.println(myCondo.getEntranceDoorColor());
            System.out.println(myCondo.getFoundationType());
        }
    }

