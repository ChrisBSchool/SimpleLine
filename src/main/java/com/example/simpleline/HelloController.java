package com.example.simpleline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

//Using the intellij default template for JAVAFX
public class HelloController implements Initializable {
    @FXML
    private ListView<String> customerView;
    @FXML
    void sort(MouseEvent event) {
    //    ObservableList<String> customerDisplay = FXCollections.observableArrayList();
    //    for(int c = 0; c< FileControl.lineCount("src/Customers.txt");c++ ){
     //       customerDisplay.add(Arrays.deepToString())
     //   }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}