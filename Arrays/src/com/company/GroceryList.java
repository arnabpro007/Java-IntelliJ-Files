package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGrocerylist(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i <groceryList.size() ; i++) {
            System.out.println("Element #" + (i+1) + " : " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position , String newItem){
        groceryList.set(position,newItem);
        System.out.println("Item #" + (position+1) + " has been modified" );
    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("We have removed " + theItem);
    }

    public String findItem(String SearchItem){
        //boolean exists = groceryList.contains(SearchItem);
        int position = groceryList.indexOf(SearchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
