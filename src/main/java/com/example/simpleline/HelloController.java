package com.example.simpleline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ResourceBundle;

//Using the intellij default template for JAVAFX
public class HelloController implements Initializable {
    @FXML
    private ListView<Object> customerView;

    @FXML
    Button showButton;
    @FXML
    Button sortPassButton;
    @FXML
    Button searchButton;
    @FXML
    Button clearButton;
    @FXML
    TextField searchField;

    HashControl newHash = new HashControl();

    //@Override
    //public void handle(ActionEvent event) {
      //  if (sortButton.isPressed()){
        //    customerView.getItems().addAll(LineControl.customerInLineLinkedList(FileControl.readInCustomers("src/Customers.txt")));
        //}
    //}

    //public void setSortButton(ActionEvent e){
      //  customerView.getItems().addAll(LineControl.customerInLineLinkedList(FileControl.readInCustomers("src/Customers.txt")));
    //}
    //@Override
    //public void handle(ActionEvent event) {

    //}


    //@FXML
    //public void sortButton(ActionEvent e) {
    //    customerView.getItems().addAll(LineControl.customerInLineLinkedList(FileControl.readInCustomers("src/Customers.txt")));
    //    ObservableList<String> customerDisplay = FXCollections.observableArrayList();
    //    for(int c = 0; c< FileControl.lineCount("src/Customers.txt");c++ ){
     //       customerDisplay.add(Arrays.deepToString())
     //   }
    //}
    public void onShowClick(){
        customerView.getItems().addAll(LineControl.customerInLineLinkedList((MrSorter.customerSort(FileControl.readInCustomers("src/Customers.txt")))));
    }
    public void onSortByPassClick() {
        customerView.getItems().addAll(LineControl.customerInLinePriortyQueue((MrSorter.customerSort(FileControl.readInCustomers("src/Customers.txt")))));
    }
    public void onSearchClick(){
        Hashtable<String,CustomerInLine> tempTable = newHash.makeHash(LineControl.customerInLineLinkedList((MrSorter.customerSort(FileControl.readInCustomers("src/Customers.txt")))));
        //newHash.makeHash(LineControl.customerInLineLinkedList((MrSorter.customerSort(FileControl.readInCustomers("src/Customers.txt")))));
        customerView.getItems().add(newHash.searchHash(tempTable, searchField.getText()));
    }
    public void onClearClick(){
        customerView.getItems().clear();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showButton.setOnAction(event -> onShowClick());
        sortPassButton.setOnAction(event -> onSortByPassClick());
        searchButton.setOnAction(event -> onSearchClick());
        clearButton.setOnAction(event -> onClearClick());
        //customerView.getItems().addAll(LineControl.customerInLineLinkedList(FileControl.readInCustomers("src/Customers.txt")));
        //customerView.getItems().stream()
    }

    //@Override
    //public void handle(ActionEvent event) {
     // if(event.getSource()==sortButton){
      //    customerView.getItems().addAll(LineControl.customerInLineLinkedList(FileControl.readInCustomers("src/Customers.txt")));
      //}
    //}
}