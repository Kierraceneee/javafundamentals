package com.fundamentals.labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsLab {

    //TASK ONE
public ArrayList<String> pizzaArrayList(){
    ArrayList<String> myPizza = new ArrayList<>();
    myPizza.add("Neapolitan");
    myPizza.add("New York Style");
    myPizza.add("Chicago Deep-Dish");
    myPizza.add("Margherita");
    myPizza.add("Sicilian");
    myPizza.add("Hawaiian");
    myPizza.add("California");
    myPizza.add("Greek");
    myPizza.add("Detroit Style");
    myPizza.add("Tavern Style");

    System.out.println(myPizza.size());
    return myPizza;
}

public void showPizzaList(ArrayList<String> pizzas){
    for (String pizza : pizzas){ //Why the singular and plural?
        System.out.println(pizza);
    }
}

    //TASK TWO
public int iWantFives(int total){
    HashSet<Integer> fiveSet = new HashSet<>();
    for(int f = 0; f <= total; f++){
        if(f % 5 == 0){
            fiveSet.add(f);
        }
    }
    for(int values : fiveSet){
        System.out.println(values);
    }
    return total;
}
    // TASK THREE
public void myFavBooks(){
    HashMap<Integer, String> books = new HashMap<>();
    books.put(0061122416, "The Alchemist");
    books.put(0446675504, "Parable of The Sower");
    books.put(1524714682, "One of Us Is Lying");
    books.put(1791392792, "Verity");

    for(Map.Entry<Integer, String> book: books.entrySet()){
        System.out.println(book.getKey() + ", " + book.getValue());
    }
}

    public static void main(String[]  args){
        CollectionsLab myLab = new CollectionsLab();
        //myLab.showPizzaList(myLab.pizzaArrayList());
        //myLab.iWantFives(50);
        myLab.myFavBooks();
    }
}
