//This class will handle taking care of the sort.
package com.example.simpleline;

import java.util.Arrays;

public class MrSorter {
    //The first method will take in the second column from our two 2d array so that it may be merge sorted
    //public static int[] secondColumnGrabber(String[][] ourCustomers){
    //    int[] secondColumn = new int[ourCustomers.length];
    //The following loop will go through the array, and take the second column and enter it into our new array
    //   for(int c =0;c< ourCustomers.length;c++){
    //This will also convert our string into an int for easier comparison
    //      secondColumn[c]= Integer.parseInt(ourCustomers[c][1]);
    // }
    // return secondColumn;
    // }
    //The following method will then sort our array via a merge sort
    //The following method will sort our 2d array via comparing the columns of the closet rows
    public static String[][] customerSort(String[][] customers) {
        //for (int c = 0; c < customers.length - 1; c++) {
        //    System.out.println(c);
        //    for (int i = 0; i < customers.length - 1; i++) {
        boolean check = false;
        while(!check){
            check = true;
            for (int c = 0; c < customers.length - 1; c++) {
                //System.out.println(i);
                //System.out.println(Arrays.deepToString(customers));
                if (Integer.parseInt(customers[c][1]) > Integer.parseInt(customers[c + 1][1])) {
                    check = false;
                    String temp = customers[c][1];
                    customers[c][1] = customers[c + 1][1];
                    customers[c + 1][1] = temp;
                    //System.out.println(c);
                    //System.out.println(Arrays.deepToString(customers));
                    //int tempOne = Integer.parseInt(customers[c][2]);
                    //int tempTwo = Integer.parseInt(customers[c + 1][2]);
                    //customers[c][2] = String.valueOf(tempTwo);
                    //customers[c + 1][2] = String.valueOf(tempOne);


                }
            }

        }
        return customers;
    }
}
