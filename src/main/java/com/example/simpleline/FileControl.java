package com.example.simpleline;// This class will handle in the reading in of our files and later on the writing of our files
// I plan on reading in my data into a 2d array, it'll be split into three parameters
// Each parameter will be separated by a comma
import java.io.*;
public class FileControl {
    // Will just use the default constructor, I'm just going to add a method for reading in a file and later writing it back
    //The read in method will return a 2d array, each line is a row and each column is separated by a comma
    //Total row count is determined by total line count and we only have three parameters separated by commas so we 3 columns
    public static String[][] readInCustomers(String file){
            int lineCount = FileControl.lineCount("src/Customers.txt") - 1;
            String[][] customers = new String[lineCount+1][3];

            try{
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                //The customer string will be used to temp store each line as they're read in
                String customer;
                int c = 0;
                //This while loop will go through the file until our counter reaches our total amount of lines
                while(c <= lineCount) {
                    customer = fileReader.readLine();
                    String[] commaTracker = customer.split(",");

                    //A for loop will be used to take the split parameters from the commTracker array and place them into their correct columns
                    for(int i = 0;i < 3;i++){
                        customers[c][i] = commaTracker[i];
                    }
                    //the counter is increased in the while loop
                    c++;
                }

            } catch(IOException e){
                e.printStackTrace();
                System.out.print("Sorry, can't find that file");
            }
            return customers;
    }
    //The line count method just checks the amount of lines in our file
    //I could do the line check when reading it in but as preferance and in case something goes wrong
    //I will just handle the counting separate from the reading.
    public static int lineCount(String file){
        //create a counter to keep track of the lines
        int c = 0;
        try{
            //create a reader
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            //String will be used to hold onto the current line
            String cLine;
            //The while loop will go through the line, adding up our counter until it hits a blank line
            //cLine will be keeping track of the current line and should return null when a blank is sent to it
            while((cLine = fileReader.readLine())!= null){
                c++;
            }
        } catch(IOException e){
            e.printStackTrace();
            System.out.print("Sorry, can't find that file");
        }
        //counter is returned
        return c;
    }
}
