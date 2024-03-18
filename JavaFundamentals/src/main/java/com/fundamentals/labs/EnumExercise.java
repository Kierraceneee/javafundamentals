package com.fundamentals.labs;


public class EnumExercise {

    public void myGenres(MoviesEnum genres){
        String msg = "I prefer ";
        switch (genres){
            case SCIFI:
                msg += "Sci-Fi movies.";
                break;
            case HISTORICALDRAMA:
                msg+= "Historical Drama movies.";
                break;
            case MOCKUMENTARY:
                msg += "Mockumentary movies.";
                break;
            case FILMNOIR:
                msg += "Film Noir movies movies.";
                break;
            case MUSICAL:
                msg += "Musical movies.";
                break;
            default:
                msg += "any movie";
        }
        System.out.println(msg);
    }

    public static void main(String[] args){
        EnumExercise myEnum =  new EnumExercise();
        myEnum.myGenres(MoviesEnum.MOCKUMENTARY);
    }
}
