// **********************************************************************************
// Title: SimpleLineMajorProject
// Author: Christopher Bielica
// Course Section: CMIS202-ONL1 (Seidel) Fall 2022
// File: HelloApplication.java(name and base code from default template intellij)
// Description: A simple program for handling lines in say an amusement park
// **********************************************************************************
package com.example.simpleline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

//Using the intellij default template for JAVAFX
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("SimpleLine");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        //Note part one does not use the listview, I was just going to use the 2d array, but instead the linked list from part 2 will be used to populate it, part one sort is displayed via system out
        FileControl newFile = new FileControl();
        MrSorter newSort = new MrSorter();

        System.out.println(newFile.lineCount("src/Customers.txt"));
        System.out.println(Arrays.deepToString(newFile.readInCustomers("src/Customers.txt")));
        System.out.println(Arrays.deepToString(newSort.customerSort(newFile.readInCustomers("src/Customers.txt"))));
        System.out.println(LineControl.customerInLineLinkedList((newSort.customerSort(newFile.readInCustomers("src/Customers.txt")))));
        System.out.println(LineControl.customerInLinePriortyQueue((newSort.customerSort(newFile.readInCustomers("src/Customers.txt")))));
        launch();
    }
}