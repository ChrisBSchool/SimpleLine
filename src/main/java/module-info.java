module com.example.simpleline {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simpleline to javafx.fxml;
    exports com.example.simpleline;
}