package com.example.simpleline;
//This class will handle everything that deals with hashing, the first method will create a hash table from our list
//The key will be created from the name parameter in each of our objects
//A search method will then be under that which uses the name(key) to search for the object which it has been paired
import java.util.Hashtable;
import java.util.LinkedList;

public class HashControl {
    //The following method will create our hash table and keys from the first parameters of our objects
    public Hashtable<String, CustomerInLine> makeHash(LinkedList<CustomerInLine> cList){

        Hashtable<String,CustomerInLine> customerTable = new Hashtable<String, CustomerInLine>();
        //This loop will run through the linked list, grab the first parameter to use as a key for the object
        for(int c = 0;c<FileControl.lineCount("src/Customers.txt");c++){
            //The key will be set to the first parameter of each object we grab from the list as it goes through
            String key = cList.get(c).getName();
            //System.out.println(key);
            //Finally the pair is added to the table, the key comes from the parameter we grab and it's paired off to the object which it came from.
            customerTable.put(key,cList.get(c));
        }
        return customerTable;
    }
    public Object searchHash(Hashtable<String,CustomerInLine> ctable,String key){
        return ctable.get(key);
    }

}
