package com.example.simpleline;
//This class will allow us to create our main object that we will be using which is the customer in the line
//It extends from its parent class and adds on two extra parameters
public class CustomerInLine extends Customer{
    private int lineNum;
    private boolean pass;

    public CustomerInLine(String name,int lineNum,boolean pass) {
        super(name);
        this.lineNum = lineNum;
        this.pass = pass;
    }

    public int getLineNum(){
        return lineNum;
    }
    public boolean getPass(){
        return pass;
    }
}
