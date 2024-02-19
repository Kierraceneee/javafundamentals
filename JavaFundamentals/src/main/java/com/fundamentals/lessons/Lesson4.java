package com.fundamentals.lessons;

// Lesson4: All About Strings
/* String objects ar immutable, which means once
the value is set it cannot be changed. Instead,
it creates a new object.
* */
public class Lesson4 {

    // field or instance variable
    String note = "Welcome to Lesson 4";

    // Assign a new reference to the field above
    String secondNote = note;

    /* This method returns a joined string back
    to where it was called from. the empty
    parenthesis is to ensure a space between variables.
     */
    public String joinWelcome(String message) {
        // Concatenation
        return note + " " + message;
    }

    /* Show that Strings are immutable */
    public void checkWelcome (String message) {
        note = note + " " + message;
        System.out.println(note);
        System.out.println(secondNote);
    }
    /* concat joins two strings together as concatenation.
    Same as the joinWelcome method above. */
    public void anotherJoin(String msg) {
        System.out.println(note.concat(msg));
    }
    /* This main is for education purposes only. Main.java
    * main is the normal start of this project
    * */
    public void indexNote(int index) {
            System.out.println(note.charAt(index));
            /* If you choose an int value greater
            * than the string, you will produce an error. */
    }



    public static void main(String [] args) {
        Lesson4 myLesson4 = new Lesson4 ();
        String msg = "All about Strings";
        System.out.println(myLesson4. joinWelcome (msg));
        myLesson4.checkWelcome(msg);
        myLesson4.indexNote(5);
        myLesson4.anotherJoin(" is not quite finished");
    }

} // end class
