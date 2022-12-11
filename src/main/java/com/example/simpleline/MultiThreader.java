package com.example.simpleline;

import java.util.LinkedList;
import java.util.PriorityQueue;

//This class will handle the multithreading for the final part of the project, it'll take our orginal 2d array and
//use the Linecontrol methods, one for each thread, so one priority queue will be created and one linked list
public class MultiThreader {
    String[][] ourCList = MrSorter.customerSort(FileControl.readInCustomers("src/Customers.txt"));
    LinkedList<CustomerInLine> threadList = new LinkedList<>();
    PriorityQueue<CustomerInLine> threadPriorityQueue = new PriorityQueue<>();
    public MultiThreader(){//(PriorityQueue<CustomerInLine> threadPriorityQueue, LinkedList<CustomerInLine> threadList){
        this.threadList = threadList;
        this.threadPriorityQueue = threadPriorityQueue;
    }
    //There will two linked lists, one for each thread, first line will be the first half of the data, the other the rest
    //LinkedList<CustomerInLine> lineOne = new LinkedList<>();
    //LinkedList<CustomerInLine> lineTwo = new LinkedList<>();
    //The first method will create the threads and then run our code inside of each thread
    public void threadControl(){
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Thread one");
                threadList = LineControl.customerInLineLinkedList(ourCList);
                System.out.println(threadList);
                System.out.println("Thread one working");

            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Thread Two");
                threadPriorityQueue = LineControl.customerInLinePriortyQueue(ourCList);
                System.out.println(threadPriorityQueue);
                System.out.println("Thread Two working");
            }
        });
        //Going to start the threads here, I was wondering why it wasn't working, well if the threads never start how are they suppose to work
        threadOne.start();
        threadTwo.start();
    }
    //The second method will just be used for returning our linked lists to outside this class
    public LinkedList<CustomerInLine> getThreadedList(){
        System.out.println("Sending the List from the thread");
        this.threadControl();
        return threadList;
    }
    public PriorityQueue<CustomerInLine> getPQueue(){
        System.out.println("Sending the Queue from the thread");
        this.threadControl();
        return threadPriorityQueue;
    }

    //@Override
    //public void run() {

    //}
}
