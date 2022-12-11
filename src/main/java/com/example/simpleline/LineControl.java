package com.example.simpleline;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LineControl {
    //The following method will take our 2d array from the customer file and create the CustomerInLine objects which will be stored in a linkedlist
    public static LinkedList<CustomerInLine> customerInLineLinkedList(String[][] customers){
        LinkedList<CustomerInLine> cList = new LinkedList<>();
        //This loop will go until we reach the end of our lines in the file, code within will go through all the lines and create a customerinline from each
        for(int c = 0;c<FileControl.lineCount("src/Customers.txt");c++){
            //System.out.print("Linked List cycle" + c);
            CustomerInLine personInLine = new CustomerInLine(customers[c][0],Integer.parseInt(customers[c][1]), customers[c][2]);
            cList.add(personInLine);
            }
        return cList;
        }
        //This method is pretty much a copy and paste of the above one but I've changed the linkedlist to a queue
    public static PriorityQueue<CustomerInLine> customerInLinePriortyQueue(String[][] customers){
        //
        PriorityQueue<CustomerInLine> linePriorityQueue = new PriorityQueue<>(new Comparator<CustomerInLine>() {
            //Finally figured it out, needed this little override in order for the comparing to actually work
            //The override is checking two customers, and our overwritten compare method back in the Customer in line class
            // is set to give a lower number thus higher priority to objects in which their third parameter says they have a pass
            @Override
            public int compare(CustomerInLine o1, CustomerInLine o2) {
                return o1.getPass().compareTo(o2.getPass());
            }
        });
        //This loop will go until we reach the end of our lines in the file, code within will go through all the lines and create a customerinline from each
        for(int c = 0;c<FileControl.lineCount("src/Customers.txt");c++){
            //System.out.print("Linked List cycle" + c);
            CustomerInLine personInLine = new CustomerInLine(customers[c][0],Integer.parseInt(customers[c][1]), customers[c][2]);
            linePriorityQueue.add(personInLine);
        }
        return linePriorityQueue;
    }
   // public static LinkedList<CustomerInLine> lineQueue(LinkedList<CustomerInLine> organizedCustomers){
   //     PriorityQueue<CustomerInLine> linePriorityQueue = new PriorityQueue<>();
   //     for(int c = 0;c<FileControl.lineCount("src/Customers.txt");c++){
    //        linePriorityQueue.add(CustomerInLine)
    //    }



    }

