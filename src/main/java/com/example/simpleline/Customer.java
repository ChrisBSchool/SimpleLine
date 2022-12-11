package com.example.simpleline;
//This is most basic object we can build, this will the parent for the customerInLine class
public class Customer {
    private String name;

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
