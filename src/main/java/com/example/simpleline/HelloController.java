package com.example.simpleline;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//Using the intellij default template for JAVAFX
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}