package com.example.simpleline;
//This class will allow us to create our main object that we will be using which is the customer in the line
//It extends from its parent class and adds on two extra parameters
public class CustomerInLine extends Customer implements Comparable<CustomerInLine>{
    private int lineNum;
    private String pass;

    public CustomerInLine(String name,int lineNum,String pass) {
        super(name);
        this.lineNum = lineNum;
        this.pass = pass;
    }

    public int getLineNum(){
        return lineNum;
    }
    public String getPass(){
        return pass;
    }
    //overwrited the deafult to string, was wondering why my linked list was printing out so odd thing, turns out I forgot to override the toString
    public String toString(){
        return getName() + " " + lineNum + " " + pass;
    }
    //I overrided the compareTo method so that I have comparison I can use for the priority queue
    @Override
    public int compareTo(CustomerInLine otherCustomer) {
        int com = 0;
        if(this.getPass() == "no pass"){
            com = 1;
        }
        else if (this.getPass() == "has pass"){
            com = 0;
        }
        return com;
    }
}
